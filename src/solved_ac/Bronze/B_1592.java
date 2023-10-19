package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1592 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 인원 수
        int M = Integer.parseInt(st.nextToken()); // 한 사람당 공을 받는 횟수
        int L = Integer.parseInt(st.nextToken()); // L번째 옆으로

        int[] friends = new int[N+1];
        int throwBall = 0;
        int index = 1;
        friends[1] = 1;

        while (true) {
            if(friends[index] == M){ // 한사람당 받는 횟수가 M 일 경우 게임 끝
                break;
            }

            if(friends[index]%2 != 0){ // 받는 횟수가 홀수인 경우 시계방향으로
                index = index + L;
                if(index > N){
                    index = index%N;
                }
                friends[index]++;

            }
            else { // 받는 횟수가 짝수인 경우 반시계방향으로
                index = index - L;
                if(index < 1){
                    index = index+N;
                }
                friends[index]++;

            }
            throwBall++;
        }
        System.out.println(throwBall);

    }
}
