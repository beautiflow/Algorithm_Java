package SamsungSW.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1209_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int tc = 1; tc <= 10; tc++){
            int T = Integer.parseInt(br.readLine());

            int[][] arr = new int[100][100];
            int max = 0;
            int garo = 0;
            int sero = 0;
            int leftcross = 0;
            int rightcross = 0;


            for(int i = 0; i < 100; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < 100; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i = 0; i < 100; i++){
                garo = 0;
                for(int j = 0; j < 100; j++){
                    garo += arr[i][j];
                }
                max = Integer.max(max, garo);
            }

            for(int i = 0; i < 100; i++){
                sero = 0;
                for(int j = 0; j < 100; j++){
                    sero += arr[j][i];
                }
                max = Integer.max(max, sero);
            }

            for(int i = 0; i < 100; i++){
                leftcross = arr[i][i];
            }
            max = Integer.max(max, leftcross);


            for(int i = 99; i >= 0; i--){
                for(int j = 0; j < 100; j++){
                    rightcross = arr[i][j];
                }
                max = Integer.max(max, rightcross);

            }

            System.out.println("#"+tc+" "+max);
        }
    }
}
