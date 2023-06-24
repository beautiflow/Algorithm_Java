package SamsungSW.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_ssafy1_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int basket = Integer.parseInt(br.readLine());
        int apple = Integer.parseInt(br.readLine());
        int bug = Integer.parseInt(br.readLine());

        int[] arr = new int[basket];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < basket; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

            int left = -1;
            int right = -1;

            for (int i = 0; i < basket; i++) {
                if (arr[i] == 1) {
                    if(i < bug) {
                        left = Math.max(bug - i, left);
                    }
                    if(i >= bug) {
                        right = Math.max(i - bug, right);
                    }
                }
            }
            int shortt = Math.min(left, right);
            int longg = Math.max(left, right);

            int result = shortt * 2 + longg;
            System.out.println(result);
        }
    }

