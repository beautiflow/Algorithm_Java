package SamsungSW.d1;

import java.util.Scanner;

public class S_2043 {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int K = sc.nextInt();

                for(int i = K; i<=P; i++){
                    if (K == P){
                        break;
                    }else {
                        count++;
                    }
        }
        System.out.println(count);
    }
}
