package leetCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Vaild_Anagram {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String t = br.readLine();

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t){
        int[] first = new int[26];
        int[] second = new int[26];
        int count = 0;
        HashSet firstString = new HashSet<String>();
        HashSet secondString = new HashSet<String>();

        for(int i = 0; i < s.length(); i++){
            int countF = s.charAt(i) - 'a';
            first[countF]++;
            firstString.add(s.charAt(i));
        }

        for(int i = 0; i < t.length(); i++){
            int countT = t.charAt(i) - 'a';
            second[countT]++;
            secondString.add(t.charAt(i));
        }

        for(int i = 0; i < 26; i++){
            if(first[i] == second[i]){
                if(first[i] == 0 && second[i]==0){
                    continue;
                }
                count++;
            }
        }

        if(firstString.size() == secondString.size() && firstString.size() == count){
            return true;
        }
        return false;
    }
}
