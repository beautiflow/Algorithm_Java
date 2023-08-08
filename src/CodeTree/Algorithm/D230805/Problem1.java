package CodeTree.Algorithm.D230805;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1 {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            int N = Integer.parseInt(br.readLine());

            int[][] board = new int[N+1][N+1];

            for(int i = 1; i <= N; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 1; j <= N; j++){
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= N; j++){
                    if(board[r][j] < board[r][c]){
                        board[r][j] = 0;
                    }
                    if(board[i][c] < board[r][c]){
                        board[i][c] = 0;
                    }
                }
            }

            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= N; j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }

        }
    }

