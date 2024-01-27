package Inflearn.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String answer = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(48 <= ch && ch <= 57){
                answer += ch;
            }
        }
        int numAnswer = Integer.parseInt(answer);
        System.out.println(numAnswer);
    }
}
