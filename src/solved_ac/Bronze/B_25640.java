package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_25640 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String mbti = br.readLine();

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = 0; i < N; i++){
            String str = br.readLine();

            if(mbti.equals(str)){
                count++;
            }
        }
        System.out.println(count);
    }
}
