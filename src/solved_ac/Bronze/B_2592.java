package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[1001];
        int sum = 0;
        int max = 0;
        int result = 0;


        for(int i = 1; i <= 10; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num]++;

            sum += num;
        }
        for(int i = 1; i <= 1000; i++){
            if(max <= arr[i]){
                max = arr[i];
                result = i;
            }
        }
        System.out.println(sum/10);
        System.out.println(result);
    }
}
