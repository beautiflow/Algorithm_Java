package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_6996 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str1 = st.nextToken();
            String str2 = st.nextToken();

            String[] arr1 = str1.split("");
            String[] arr2 = str2.split("");

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.toString(arr1).equals(Arrays.toString(arr2))) {
                System.out.println(str1 + " & " + str2 + " are anagrams.");
            }
            else {
                System.out.println(str1 + " & " + str2 + " are NOT anagrams.");
            }
        }

    }
}
