package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

public class S_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String encode = br.readLine();
            String decode = new String(Base64.getDecoder().decode(encode));

            System.out.println("#" + (i+1) + " "+ decode);
        }
    }
}
