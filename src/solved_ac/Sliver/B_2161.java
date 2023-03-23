package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i = 1 ; i <= N; i++){
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();

        while (queue.size() != 1){
            sb.append(queue.poll()).append(" ");
            queue.add(queue.poll());
        }
        System.out.print(sb);
        System.out.print(queue.poll());







    }
}
