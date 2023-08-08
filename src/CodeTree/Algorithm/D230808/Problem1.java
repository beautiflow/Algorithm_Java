package CodeTree.Algorithm.D230808;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1 {
        static int[][] program;

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());



            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

           program = new int[n][m];

            printBoard(n, m);
        }

        public static void printBoard(int n, int m){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    program[i][j] = 1;
                    System.out.print(program[i][j]);
                }
                System.out.println();
            }
        }
    }

