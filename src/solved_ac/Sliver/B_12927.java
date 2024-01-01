package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_12927 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] light = new String[1000];
        String switches = br.readLine();
        int[] index = new int[1000];


        for(int i = 1; i <= switches.length(); i++){
            light[i] = String.valueOf(switches.charAt(i));
            if(light[i].equals("N")){
                index[i] = 1;
                System.out.println("index["+i+"] = " + index[i]);
            }
        }









    }
}
