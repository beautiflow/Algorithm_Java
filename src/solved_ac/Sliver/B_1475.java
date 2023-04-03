package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int[] set = new int[10];

        for(int i = 0; i < N.length(); i++){
            int num = Character.getNumericValue(N.charAt(i));
            if(num == 6){
                set[9]++;
            }
            else{
                set[num]++;
            }
        }

        int count = 0;
        for(int i = 0; i < 9; i++){
            count = Math.max(count, set[i]);
        }
        int nine = set[9]/2;
        if(set[9]%2 == 1){
            nine++;
        }
        count = Math.max(count, nine);

        System.out.println(count);
    }
}

