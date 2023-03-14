package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            String str = br.readLine();
            int N = Integer.parseInt(str);

            boolean[] check = new boolean[10];

            int num = 1;

            int count = 0;

            while (true) {

                for (int i = 0; i < str.length(); i++) {
                    int temp = Integer.parseInt(str.substring(i, i + 1));
                    if (check[temp] == false) {
                        check[temp] = true;
                        count++;
                    }
                }
                if (count == 10) {
                    break;
                } else {
                    num++;
                    str = Integer.toString(num * N);
                }
            }
            System.out.println("#" + (t+1) + " " + str);
        }
    }
}
