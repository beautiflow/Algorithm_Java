package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] location_1 = br.readLine().split(" ");
        String[] location_2 = br.readLine().split(" ");
        String[] location_3 = br.readLine().split(" ");

        String x;
        String y;

        if(location_1[0].equals(location_2[0])){
            x = location_3[0];
        }
        else if (location_1[0].equals(location_3[0])) {
            x = location_2[0];
        }
        else {
            x = location_1[0];
        }

        if(location_1[1].equals(location_2[1])){
            y = location_3[1];
        }
        else if (location_1[1].equals(location_3[1])) {
            y = location_2[1];
        }
        else {
            y = location_1[1];
        }

        System.out.println(x + " " + y);
    }
}
