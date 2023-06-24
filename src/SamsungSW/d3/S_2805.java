package SamsungSW.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S_2805 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            int N = Integer.parseInt(br.readLine());
            int profit = 0;

            for(int i = N/2; i >= 0; i--){
                String str = br.readLine();
                for(int j = i; j < N-i; j++){
                    profit += str.charAt(j) - '0';
                }
            }
            for(int i = 1; i <= N/2; i++){
                String str = br.readLine();
                for(int j = i; j < N-i; j++){
                    profit += str.charAt(j) - '0';
                }
            }
            System.out.println("#"+tc+" "+profit);




            //int[][] farm = new int[N][N];

//            for(int i = 0; i < N; i++){
//                String str = br.readLine();
//                for(int j = 0; j < N; j++){
//                    int value = str.charAt(j)-'0';
//                    farm[i][j] = value;
//                }
//            }
//
//
//            for(int i = 0; i < N; i++){
//            int half = N/2;
//                if(i <= half){
//                    for(int j = 0; j < N; j++){
//                        if((i+j) >= half && (i+j) <= (2*i+2)){
//                            profit += farm[i][j];
//                        }
//                    }
//                }
//                else{
//                    for(int j = 0; j < N; j++){
//                        if(i+j >= (2*i-2) && i+j <= (N-1+half)){
//                            profit += farm[i][j];
//                        }
//                    }
//                }
//            }
            System.out.println("#"+tc+" "+profit);
        }

    }
}
