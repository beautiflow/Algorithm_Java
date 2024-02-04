package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2851_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[11];

        for(int i = 1; i <= 10; i++){
            int mushroom = Integer.parseInt(br.readLine());

            score[i] = score[i-1] + mushroom;
        }

        for(int i = 1; i < 11; i++){
            if(score[i] == 100){
                System.out.println(score[i]);
                return;
            }
            else if(score[i] > 100){
                if(Math.abs(score[i]-100) < Math.abs(score[i-1]-100)){
                    System.out.println(score[i]);
                    return;
                }
                else {
                    System.out.println(score[i-1]);
                    return;
                }
            }
            else if(score[i] < 100){
                if(Math.abs(score[i]-100) < Math.abs(score[i+1]-100)){
                    System.out.println(score[i]);
                    return;
                }
                else {
                    System.out.println(score[i+1]);
                    return;
                }
            }
        }




    }
}
