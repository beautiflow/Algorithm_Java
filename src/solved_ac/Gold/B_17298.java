package solved_ac.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] index = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
            index[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N; i++){
            while (!stack.isEmpty() && index[stack.peek()] < index[i]){
                index[stack.pop()] = index[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()){
            index[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(index[i]).append(" ");
        }
        System.out.println(sb);
    }
}
