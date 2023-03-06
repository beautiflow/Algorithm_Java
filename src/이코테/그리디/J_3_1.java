package 이코테.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J_3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;

        int[] coinTypes = {500, 100, 50, 10};

        for(int i = 0; i < 4; i++){
            int coin = coinTypes[i];
            count += N / coin;
            N %= coin;
        }
        System.out.println(count);
    }
}
