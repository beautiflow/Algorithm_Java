package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String[] arr = new String[4];


        for(int tc = 0; tc < 3; tc++){
            int count = 0;

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i <= 3; i++){
                arr[i] = st.nextToken();

                if(arr[i].contains("0")){
                    count++;
                }
            }

            if(count == 1){
                System.out.println("A");
            } else if (count == 2) {
                System.out.println("B");
            } else if (count == 3) {
                System.out.println("C");
            } else if (count == 4) {
                System.out.println("D");
            }else {
                System.out.println("E");
            }
        }
    }
}
