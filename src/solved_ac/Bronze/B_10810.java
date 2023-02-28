package solved_ac.Bronze;

import java.util.Scanner;

public class B_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N];

        for(int i = 0; i < M; i++){
            int first = sc.nextInt();
            int end = sc.nextInt();
            int ballnum = sc.nextInt();
            for(int j = first - 1; j < end; j++){
                basket[j] = ballnum;
            }
        }
        for(int i = 0; i < basket.length; i++){
            System.out.print(basket[i]+ " ");
        }
    }
}
