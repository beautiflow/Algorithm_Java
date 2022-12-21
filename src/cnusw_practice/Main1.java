package cnusw_practice;

import java.util.Scanner;

public class Main1 {

        public static int gcd(int A, int B){
            if(A%B == 0){
                return B;
            }
            return gcd(B, A%B);
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(gcd(A, B));
        }
    }


