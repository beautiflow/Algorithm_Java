package SamsungSW.d2;

import java.util.Scanner;

public class S_1986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i =1; i <= T; i++){
            int N = sc.nextInt();
            int sum = 0;

            for(int j = 1; j <= N; j++){
                if(j % 2 != 0){
                    sum += j;
                }
                else{
                    sum -= j;
                }
            }
            System.out.println("#"+ i + " " + sum);
        }
    }
}
