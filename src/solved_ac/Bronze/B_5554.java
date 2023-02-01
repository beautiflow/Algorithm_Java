package solved_ac.Bronze;

import java.io.IOException;
import java.util.Scanner;

public class B_5554 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int t = a + b + c + d;

        System.out.println(t / 60);
        System.out.println(t % 60);
    }
}
