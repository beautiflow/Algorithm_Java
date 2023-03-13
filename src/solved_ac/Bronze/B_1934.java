package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(lcm(a,b));
        }
    }

    static int gdc(int a, int b){
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

    static int lcm(int a, int b){
        return a*b/ gdc(a,b);
    }
}
