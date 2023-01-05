package Baekjoon.Array;

import java.util.Scanner;

public class B_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr;

        int testcase = sc.nextInt();

        for(int i = 0; i < testcase; i++){
            int N = sc.nextInt();
            arr = new int[N];

            double sum = 0;

            for(int j = 0; j < N; j++){
                int val = sc.nextInt();
                arr[j] = val;
                sum += val;
            }

            double mid = (sum / N);
            double count = 0;

            for(int j = 0; j < N; j++){
                if(arr[j] > mid){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/N)*100);
        }
        sc.close();
    }
}




//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int[] arr;
//        int testcase = sc.nextInt();
//
//        for(int i = 0; i < testcase; i++){
//            int N = sc.nextInt();
//            arr = new int[N];
//
//            double sum = 0;
//
//            for(int j = 0; j < N; j++){
//                int score = sc.nextInt();
//                arr[j] = score;
//                sum += score;
//            }
//
//            double mid = (sum/N);
//            double count = 0;
//
//            for(int j = 0; j < N; j++){
//                if(arr[j] > mid){
//                    count++;
//                }
//            }
//            System.out.printf("%.3f%%\n", (count/N)*100);
//        }
//
//    }
//}
