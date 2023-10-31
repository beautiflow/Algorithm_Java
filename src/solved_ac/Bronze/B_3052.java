package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B_3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine()); 
            
            int namuji = num%42;
            set.add(namuji);
        }

        System.out.println(set.size());
    }
}
