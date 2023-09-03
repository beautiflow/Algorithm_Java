package CodeTree.Algorithm.D2309;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValueChange {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        valueChange(N, M);
    }

    public static void  valueChange(int n, int m){
        int tmp = n;
        n = m;
        m = tmp;

        System.out.println(n + " "+m);
    }
}
