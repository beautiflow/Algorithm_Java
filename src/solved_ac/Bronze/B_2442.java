package solved_ac.Bronze;

import java.util.Scanner;

public class B_2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1 ; i <= N; i++){

            for(int j = i; j < N; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
