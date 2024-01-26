package Inflearn.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String changeStr = str.toLowerCase();
        int count = 0;

        char[] arr = changeStr.toCharArray();

        for(int i = 0; i < str.length()/2; i++){
            if(arr[i] == arr[str.length()-1-i]){
                count++;
            }
        }

        if(count == str.length()/2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

}
