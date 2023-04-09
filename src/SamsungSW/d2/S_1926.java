package SamsungSW.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){

            int count = 0;

            if(N < 10){
                if(i%3 == 0){
                    System.out.print("-"+" ");
                }
                else {
                    System.out.print(i+" ");
                }
            }
            else {
                String str = String.valueOf(i);
                String[] num = str.split("");

                for(int j = 0; j < num.length; j++){
                    if(num[j].contains("3") || num[j].contains("6") || num[j].contains("9")){
                            count++;
                    }
                }
                if(count == 0){
                    System.out.print(i + " ");
                }
                else {
                    for(int k = 0; k < count; k++){
                        if(count == 1){
                            System.out.print("-");
                        }
                        else {
                            System.out.print("-");
                        }

                    }
                    System.out.print(" ");
                }
            }
        }
    }
}
