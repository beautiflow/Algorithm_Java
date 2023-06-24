//package solved_ac.Bronze;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//public class Bㄹㄴㅁㄴㅁㅇㄹㅁㄷㄹ_10811 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        Integer[] basket = new Integer[N+1];
//
//        for(int i = 1; i <= N; i++){
//            basket[i] = i;
//        }
//        for(int j = 0; j < M; j++){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//
//           Arrays.sort(basket, a, b+1, Comparator.reverseOrder());
//        }
//        for(int i = 1; i <=N; i++){
//            System.out.println(basket[i] + " ");
//        }
//    }
//}
