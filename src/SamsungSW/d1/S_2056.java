package SamsungSW.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_2056 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T; i++){

            String date = br.readLine();

            String year = date.substring(0,4);
            String month = date.substring(4,6);
            String day = date.substring(6,8);

            if(Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 12 && Integer.parseInt(day) >=0 && Integer.parseInt(day) <= days[Integer.parseInt(month)-1] ){
                System.out.println("#"+(i+1)+" "+year+"/"+month+"/"+day);
            }
            else {
                System.out.println("#"+(i+1)+" -1");
            }
        }
    }
}
