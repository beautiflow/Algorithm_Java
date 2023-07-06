package Study.practice2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1439 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int one = 0;
        int zero = 0;

        for(int i = 0; i < str.length()-1; i++){
           if(str.charAt(i) != str.charAt(i+1) && str.charAt(i) == '0'){
               zero++;
           }
           else if (str.charAt(i) != str.charAt(i+1) && str.charAt(i) == '1') {
                one++;
           }

           if(str.charAt(str.length()-1) == '0'){
               zero++;
           }
           else {
               one++;
           }
        }
        int min = Math.min(one, zero);

        System.out.println(min);

    }
}
