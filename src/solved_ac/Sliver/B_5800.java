package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_5800 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int gap = Integer.MIN_VALUE;

            st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());

            int[] score = new int[student];
            for (int i = 0; i < student; i++) {
                score[i] = Integer.parseInt(st.nextToken());
                max = Math.max(score[i], max);
                min = Math.min(score[i], min);
            }

            score = Arrays.stream(score)
                    .boxed().sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue).toArray();



            for (int i = 0; i < student-1; i++) {
                gap = Math.max(gap, Math.abs(score[i+1] - score[i]));
            }


            System.out.println("Class " + tc);
            System.out.println("Max " + max + ", Min " + min + ", Largest gap " + gap);

        }
    }
}


