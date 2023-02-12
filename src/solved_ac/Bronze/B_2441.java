package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class B_2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N ; i++){
            for(int j = 1; j<i ; j++){
                System.out.print(" ");
            }
            for(int j = N; j >= i ; j-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// for(int i = 0; i < N; i++){
//        for(int j = N; i < j; j--){
//        System.out.print("*");
//        }
//        System.out.println();
//        }