package SamsungSW.d1;


import java.util.Scanner;

public class S_2071 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] arr = new int[10];

            for(int j = 0; j < T; j++){
                int sum = 0;
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
                System.out.println("#" + (j + 1) + " " + Math.round(sum/10.0));
        }
    }
}
