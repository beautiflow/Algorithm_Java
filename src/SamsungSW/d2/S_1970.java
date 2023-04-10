package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){

            int price = Integer.parseInt(br.readLine());

            int[] coin = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
            int[] result = {0, 0, 0, 0, 0, 0, 0, 0};


            for(int i = 0; i < 8; i++){
                if(price >= coin[i]){
                    int cnt = price/coin[i];
                    result[i] = cnt;
                    price -= cnt*coin[i];
                }
            }

            System.out.println("#"+tc);
            for(int k = 0; k < coin.length; k++) {
                System.out.print(result[k] + " ");
            }
            System.out.println();
        }
    }
}
