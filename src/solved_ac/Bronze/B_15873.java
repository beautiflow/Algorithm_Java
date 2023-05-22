package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_15873 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int sum = 0;

        while (str.contains("10")){
            str = str.replaceFirst("10", "");
            sum += 10;
        }

        for(int i = 0 ; i < str.length(); i++){
            sum += Integer.parseInt(str.substring(i, i+1));
        }
        System.out.println(sum);
    }
}
