package Inflearn.ch02;

/**
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * 예를 들어 N=5이면
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *
 * 출력
 * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 *
 * 예시 입력
 * 5
 * 2 3 3 1 3
 * 1 1 2 2 3
 *
 * 예시 출력
 * A
 * B
 * A
 * B
 * D
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] Arr = new int[N];
        int[] Brr = new int[N];
        String[] answer = new String[N];

        StringTokenizer stA = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            Arr[i] = Integer.parseInt(stA.nextToken());
        }

        StringTokenizer stB = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            Brr[i] = Integer.parseInt(stB.nextToken());
        }

        for(int i = 0 ; i < N; i++){
            if(Arr[i] == 1){
                if(Brr[i] == 1){
                    answer[i] = "D";
                }
                else if(Brr[i] == 2){
                    answer[i] = "B";
                }
                else {
                    answer[i] = "A";
                }

            }
            else if(Arr[i] == 2){
                if(Brr[i] == 1){
                    answer[i] = "A";
                }
                else if(Brr[i] == 2){
                    answer[i] = "D";
                }
                else {
                    answer[i] = "B";
                }
            }
            else {
                if(Brr[i] == 1){
                    answer[i] = "B";
                }
                else if(Brr[i] == 2){
                    answer[i] = "A";
                }
                else {
                    answer[i] = "D";
                }
            }
        }

        for(int i = 0 ; i < N; i++){
            System.out.println(answer[i]);
        }
    }
}
