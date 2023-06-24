package solved_ac.Bronze;

import java.util.Scanner;

public class B_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        for(int i = 1; i <= N ; i++){
            String whiteSpace = " ".repeat(N-i);
            String star = "*".repeat(i);
            System.out.println(whiteSpace.concat(star));
        }
    }
}
