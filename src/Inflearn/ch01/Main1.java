package Inflearn.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char ch = br.readLine().charAt(0);

        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}

/**
 * 주어진 문자도 대문자 혹은 소문자 중 무엇으로 들어올 지 모르니 변환 필수
 */
