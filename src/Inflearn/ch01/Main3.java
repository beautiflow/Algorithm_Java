package Inflearn.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String answer = "";

        StringTokenizer st =  new StringTokenizer(str, " ");

        while (st.hasMoreTokens()){
            String word = st.nextToken();
            if(word.length() > answer.length()){
                answer = word;
            }
        }

        System.out.println(answer);

    }

}
