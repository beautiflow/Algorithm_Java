package Inflearn.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String str = st.nextToken();
        String t = st.nextToken();

        int[] arr = new int[str.length()];
        String[] words = str.split("");

        int p = 1000;
        for(int i = 0; i < str.length(); i++){
            if(words[i].equals(t)){
                p = 0;
                arr[i] = p;
            }
            else{
                p++;
                arr[i] = p;
            }
        }

        p = 1000;
        for(int i = str.length()-1; i >= 0; i--){
            if(words[i].equals(t)){
                p = 0;
            }
            else{
                p++;
                arr[i] = Math.min(arr[i], p);
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
