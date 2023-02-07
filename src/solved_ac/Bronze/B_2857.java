package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2857 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[5];
        int count = 0;

        for(int i = 0; i < 5; i++){
            str[i] = br.readLine();
        }
        for(int i = 0; i < str.length; i++){
            if(str[i].contains("FBI")){
                System.out.print(i+1+" ");
                count++;
            }
        }
        if(count == 0){
            System.out.println("HE GOT AWAY!");
        }
    }
}
