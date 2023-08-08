package CodeTree.Algorithm.D230808;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem3 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        draw(N);
    }

    static void draw(int n){
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++)
                if (i==1 || i==n || j==1 || i == j || j == n-i+1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
}
