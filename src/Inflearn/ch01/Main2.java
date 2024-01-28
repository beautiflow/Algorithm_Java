package Inflearn.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == Character.toLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb);
    }

}
