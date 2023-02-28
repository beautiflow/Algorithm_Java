package solved_ac.Bronze;

import java.util.Scanner;

public class B_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N+1];
        int change = 0;

        for(int i = 1; i <= N; i++) {
            basket[i] = i;
        }
        for(int j = 0; j < M; j++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            change = basket[a];
            basket[a] = basket[b];
            basket[b] = change;

        }
        for(int i = 1; i <= N; i++){
            System.out.print(basket[i]+" ");
        }
    }
}
