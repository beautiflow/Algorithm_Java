package Study.practice1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_24265 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        long sum = 0;

        for(int i = 1; i < N; i++){
            sum += i;
        }
        System.out.println(sum);
        System.out.println(2);

    }
}
