package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_2851 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] total = new int[11];
        total[0] = 0;

        for(int i = 1; i < 11; i++){
            int mushroom = Integer.parseInt(br.readLine());
            total[i] += total[i-1] + mushroom;
        }

        for (int i = 1; i < 11; i++) {
            if (total[i] == 100) {
                System.out.println(total[i]);
                break;
            }
            if (total[i] > 100) {
                int compare1 = Math.abs(100 - total[i]);
                int compare2 = Math.abs(100 - total[i-1]);

                if (compare1 > compare2) {
                    System.out.println(total[i-1]);
                    break;
                } else if (compare1 < compare2) {
                    System.out.println(total[i]);
                    break;
                } else {
                    System.out.println(total[i]);
                    break;
                }
            }
            else if (total[10] < 100) {
                System.out.println(total[10]);
                break;
            }
        }
    }
}
