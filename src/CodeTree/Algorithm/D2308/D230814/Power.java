package CodeTree.Algorithm.D2308.D230814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Power {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int result = power(a, b);
        System.out.println(result);
    }

    public static int power(int a, int b){
        return (int)Math.pow(a, b);
    }
}
