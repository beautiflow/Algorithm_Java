package Baekjoon.For_While;

import java.io.*;

public class B_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0 ; i<n ; i++){
            String s = bf.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a+ b+"\n");
        }
        bw.flush();
    }
}


/*
* BufferedReader
* 1. IOException 예외처리 필수적
* 2. 입력받은 모든 데이터가 String으로 반환
* 3. 줄마다 입력받아서, 따로 split 하여 데이터를 처리해주어야 함.
* 4. 숫자 형식으로 받기 위해서는 형변환 필요
*
*
*
*
* */
