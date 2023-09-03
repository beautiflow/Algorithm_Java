package CodeTree.Algorithm.D2308.D230814;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IsReturn4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        System.out.println(Lee(a)+Lee(b)+Lee(c)+Lee(d));
    }

    public static int Lee(int x)
    {
        int last = 10;
        while (x > 0){
            if (x % 10 > last) return 0;
            last = x % 10;
            x /= 10;
        }
        return 1;
    }
}
