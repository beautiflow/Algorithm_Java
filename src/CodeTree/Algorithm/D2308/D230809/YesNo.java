package CodeTree.Algorithm.D2308.D230809;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YesNo {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(correct(N)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static boolean correct(int N){
        int num = N;
        int sum = 0;
        for(int i = 0; i < 2; i++){
            sum += N%10;
            N = num/10;
        }

        return num%2==0 && sum%5==0;
    }
}
