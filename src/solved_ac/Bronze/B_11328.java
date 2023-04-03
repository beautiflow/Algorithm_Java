package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_11328 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());


        for(int i = 0 ; i < N ; i++){
            List<Character> list1 = new ArrayList<>();
            List<Character> list2 = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(char c : st.nextToken().toCharArray()){
                list1.add(c);
            }
            for(char c : st.nextToken().toCharArray()){
                list2.add(c);
            }

            Collections.sort(list1);
            Collections.sort(list2);

            while (!list1.isEmpty() && !list2.isEmpty()){
                if(list1.remove(0) != list2.get(0)){
                    break;
                }
                else{
                    list2.remove(0);
                }
            }

            if(list1.isEmpty()){
                System.out.println("Possible");
            }
            else {
                System.out.println("Impossible");
            }
        }
    }
}
