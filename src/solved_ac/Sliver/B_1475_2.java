package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1475_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] arr = new int[10];

        for(int i = 0; i < str.length(); i++){
            int number = Character.getNumericValue(str.charAt(i));
            if(number == 6){
                arr[9]++;
            }
            else {
                arr[number]++;
            }
        }
        int count = 0;
        for(int i = 0; i < 9; i++){
            count = Math.max(count, arr[i]);
        }

        int nine = arr[9]/2;
        if(arr[9]%2 == 1){
            nine++;
        }

        count = Math.max(count, nine);
        System.out.println(count);
    }
}
