package CodeTree.Algorithm.D230814;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IsReturn3 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(f(N));
    }

    public static int f(int N){
        int i, j, s;
        s = 0;
        for (i=0;i<N;i+=2)
            for (j=0;j<i;j+=2)
                s += i + j;
        return s;
    }
}
