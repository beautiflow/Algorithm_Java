package SamsungSW.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S_1215 {

    static char[][] board = new char[8][8];
    static int num;
    static boolean flag;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       for (int tc = 1; tc <= 10; tc++) {
            num = Integer.parseInt(br.readLine());

            for (int i = 0; i < 8; i++) {
                String str = br.readLine();
                for (int j = 0; j < 8; j++) {
                    board[i][j] = str.charAt(j);
                }
            }

            int count = 0;

          for(int i = 0; i < board.length; i++){
              for(int j = 0; j < board.length - num + 1; j++){

                  flag = true;
                  for(int h = 0; h < num/2; h++){
                      if(board[i][j+h] != board[i][j-h+num-1]){
                          flag=false;
                      }
                  }
                  if(flag){
                      count++;
                  }

                  flag = true;
                  for(int h = 0; h < num/2; h++){
                      if(board[j+h][i] != board[j-h+num-1][i]){
                          flag = false;
                      }
                  }
                  if(flag){
                      count++;
                  }
              }
          }

           System.out.print("#"+ tc+" ");
           System.out.println(count);

        }
    }
}

