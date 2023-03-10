package SamsungSW.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1545 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = N; i >= 0; i--){
            System.out.print(i + " ");
        }
    }
}
