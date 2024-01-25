package Inflearn.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        char[] arr = str.toCharArray();

        int lt = 0;
        int rt = str.length()-1;

        while (lt < rt){
            if(!Character.isAlphabetic(arr[lt])){
                lt++;
            }
            else if(!Character.isAlphabetic(arr[rt])){
                rt--;
            }
            else{
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        for (char x : arr) {
            System.out.print(x);
        }
    }

}
