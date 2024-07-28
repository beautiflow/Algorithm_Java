package Inflearn.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        str = str + " ";
        String answer = "";
        int count = 1;

        for (int i = 0; i < str.length()-1; i++) {
            // 전의 문자와 현재 문자랑 같은 경우
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }

            // 전의 문자와 현재 문자랑 다른 경우
            else {
                answer += str.charAt(i);
                if(count > 1){
                    answer += String.valueOf(count);
                    count = 1;

                }
            }
        }

        System.out.printf(answer);

    }
}