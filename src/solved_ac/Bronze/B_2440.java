package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B_2440{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            for(int j = N; i < j; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
