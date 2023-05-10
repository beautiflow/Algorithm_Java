package SamsungSW.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int tc = 1; tc <= 10; tc++){

            int T = Integer.parseInt(br.readLine());

            String check = br.readLine();

            char[] input = br.readLine().toCharArray();

            int count = 0;

            for(int i = 0; i < input.length - check.length() + 1; i++){
                if(input[i] == check.charAt(0)){
                    int same = 1;
                    for(int j = 1; j < check.length(); j++){
                        if(input[i+j] != check.charAt(j)){
                            same = 0;
                            break;
                        }
                    }
                    count += same;
                }
            }
            System.out.println("#"+tc+" "+count);
        }
    }
}
