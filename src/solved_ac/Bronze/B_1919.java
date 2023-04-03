package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        int[] arr = new int[26];
        int[] brr = new int[26];

        for(int i = 0; i < a.length(); i++){
            arr[a.charAt(i) - 'a']++;
        }
        for(int i = 0; i < b.length(); i++){
            brr[b.charAt(i) - 'a']++;
        }
        int count = 0;

        for(int i = 0; i < 26; i++){
            count += Math.abs(arr[i] - brr[i]);
        }
        System.out.println(count);
    }
}
