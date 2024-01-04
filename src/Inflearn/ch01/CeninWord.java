package Inflearn.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CeninWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < str.length(); i++){
            if(str == null || str.trim().isEmpty()){
                count = 0;
                sb.setLength(0);
                continue;
            }
            else{
                count++;
                max = Math.max(max, count);
                sb.append(str.charAt(i));
            }
        }
        System.out.println(max);
    }

}
