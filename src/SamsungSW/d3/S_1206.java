package SamsungSW.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1206  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int tc = 1; tc <= 10; tc++) {

            int row = Integer.parseInt(br.readLine());

            int[] building = new int[row + 1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= row; i++) {
                building[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;

            for (int i = 3; i < building.length - 2; i++) {
                int max1 = Math.max(building[i - 2], building[i - 1]);
                int max2 = Math.max(building[i + 1], building[i + 2]);
                int max = Math.max(max1, max2);

                if (max < building[i]) {
                    count += building[i] - max;
                } else {
                    continue;
                }
            }
            System.out.println("#"+tc +" "+count);
        }
    }
}
