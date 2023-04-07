package solved_ac.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_5430 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            Deque<Integer> deque = new LinkedList<Integer>();
            String command = br.readLine();
            int N = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().replace("[", "").replace("]", "").split(",");

            for (int i = 0; i < N; i++) {
                deque.add(Integer.parseInt(arr[i]));
            }

            boolean direction = true;
            boolean error = false;

            for (int i = 0; i < command.length(); i++) {
                char cmd = command.charAt(i);
                switch (cmd) {
                    case 'R':
                        direction = !direction;
                        break;
                    case 'D':
                        if (deque.isEmpty()) {
                            error = true;
                            break;
                        } else {
                            if (direction) {
                                deque.pollFirst();
                            } else {
                                deque.pollLast();
                            }
                            break;
                        }
                    default:
                        break;
                }
                if (error) {
                    break;
                }
            }

            if (error) {
                sb.append("error").append("\n");
            } else {
                sb.append("[");
                if (direction) {
                    while (!deque.isEmpty()) {
                        sb.append(deque.pollFirst());
                        if (deque.isEmpty()) {
                            break;
                        }
                        sb.append(",");
                    }
                } else {
                    while (!deque.isEmpty()) {
                        sb.append(deque.pollLast());
                        if (deque.isEmpty()) {
                            break;
                        }
                        sb.append(",");
                    }
                }
                sb.append("]").append("\n");
            }
        }
        System.out.println(sb);
    }
}
