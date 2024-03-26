package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1436_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int series = 1;
        int num = 666;


        while (N != series){
            num++;
            if(String.valueOf(num).contains("666")){
                series++;
            }
        }
        System.out.println(num);
    }

}
