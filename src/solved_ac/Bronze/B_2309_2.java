package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_2309_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int sum = 0;
        int total = 0;
        int not1 = 0;
        int not2 = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        for(int i = 0; i < 9; i++){
            for(int j = i+1; j < 9; j++){
                total = sum - arr[i] - arr[j];
                if(total == 100){
                    not1 = i;
                    not2 = j;
                    break;
                }
            }
        }

        for(int i = 0; i < 9; i++){
            if( i == not1 || i == not2){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
