package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class B_3985{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int people = 0;
        int max = 0;

        int maxSum = Integer.MIN_VALUE;
        int people2 = 0;

        int L = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int cake[] = new int[L+1];

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int sum = 0;

            if((K-P+1) > max) {
                max = K-P+1;
                people = i;
            }
            for(int j = P; j <= K; j++){
                if(cake[j] == 0){
                    cake[j] = i;
                    sum++;
                }
            }
            if(sum > maxSum){
                people2 = i;
                maxSum = sum;
            }
        }
        System.out.println(people);
        System.out.println(people2);
    }
}

//public class B_3985 {
//    static int start;
//    static int end;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        int L = Integer.parseInt(br.readLine());
//        int N = Integer.parseInt(br.readLine());
//
//        int[] cake = new int[L+1];
//        int manyNum = 0;
//        int takeNum = 0;
//
//        int count = 0;
//        int max = 0;
//        int maxCount = Integer.MIN_VALUE;
//
//        for(int i = 1; i <= N; i++){
//            st = new StringTokenizer(br.readLine());
//
//            start = Integer.parseInt(st.nextToken());
//            end = Integer.parseInt(st.nextToken());
//
//            if (end-start+1 > max){
//                max = end-start+1;
//                manyNum = i;
//            }
//
//            for(int j = start; j <= end; j++) {
//                if (cake[j] == 0) {
//                    cake[j] = i;
//                    count++;
//                }
//            }
//            if(count > maxCount){
//                takeNum = i;
//                maxCount = count;
//            }
//        }
//        System.out.println(manyNum);
//        System.out.println(takeNum);
//    }
//}
