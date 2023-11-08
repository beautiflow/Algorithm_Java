package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1919_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word1 = br.readLine();
        String word2 = br.readLine();
        int count=0;

        char[] alpha1 = new char[26];
        char[] alpha2 = new char[26];

        for(int i = 0; i < word1.length(); i++){
            alpha1[word1.charAt(i)-'a']++;
        }

        for(int i = 0; i < word2.length(); i++){
            alpha2[word2.charAt(i)-'a']++;
        }

        for(int i = 0; i < 26; i++){
             count += Math.abs(alpha1[i] - alpha2[i]);
        }

        System.out.println(count);
    }
}
