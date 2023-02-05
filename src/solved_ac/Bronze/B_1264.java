package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();
            if(str.equals('#')){
                break;
            }
            str = str.toLowerCase();
            int count = 0;
            int i = 0;
            for(; i < str.length(); i++){
                char t = str.charAt(i);
                if(t == 'a' || t == 'e' || t == 'i'|| t == 'o' || t == 'u' ){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
