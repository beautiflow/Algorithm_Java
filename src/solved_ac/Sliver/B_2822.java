package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[8];
        int[] index = new int[8];

        for(int i = 0; i < 8; i++) {
            index[i] = Integer.parseInt(br.readLine());
            score[i] = index[i];
        }

        Arrays.sort(score);

        System.out.println(score[7]+score[6]+score[5]+score[4]+score[3]);

        for(int i = 0; i < 8; i++){
            for(int j = 7; j >= 3; j--){
                if(score[j] == index[i]){
                    System.out.print(i+1+ " ");
                }
            }
        }
    }
}
