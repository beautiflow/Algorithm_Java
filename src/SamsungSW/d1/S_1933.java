package SamsungSW.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            if(N%i==0){
                System.out.print(i+ " ");
            }
        }
    }
}
