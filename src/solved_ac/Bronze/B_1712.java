package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        int count = 0;


            for(int i= 0; ;i++){
                if(C * i >= A + (B*i)){
                    count++;
                    System.out.println(count);
                    break;
                }
                else {
                    System.out.println("-1");
                }
            }
    }
}
