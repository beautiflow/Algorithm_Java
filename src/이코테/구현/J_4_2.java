package 이코테.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J_4_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int H = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i <= H; i++){
            for(int j = 0; j < 60; j++){
                for(int k = 0; k < 60; k++){
                    // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
                    if(check(i, j, k)){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    // 특정한 시각 안에 '3' 이 포함되어 있는지의 여부
    public static boolean check(int H, int m, int s){
        if(H % 10 == 3 || m / 10 == 3 || m % 10 ==3 || s / 10 == 3 || s % 10 ==3){
            return true;
        }
        return false;
    }
}
