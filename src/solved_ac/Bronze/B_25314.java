package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N % 4 == 0){
            for(int i = 0; i < N/4; i++){
                System.out.print("long ");
            }
            System.out.println("int");
        }
    }
}
