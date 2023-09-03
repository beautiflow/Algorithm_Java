package CodeTree.Algorithm.D2308.D230808;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] square = new int[N][N];
        int count = 1;

        for(int i = 0 ;i < N; i++){
            for(int j = 0; j < N; j++){
                square[i][j] = count++;
                System.out.print(square[i][j]+" ");
                if(count == 10){
                    count = 1;
                }
            }
            System.out.println();
        }
    }
}
