package CNUSW2.cnusw_practice;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());


        int n = st.countTokens();
        String[] arr1 = new String[n];
        for(int i = 0; i < n ; i++){
            arr1[i] = st.nextToken();
        }

        st = new StringTokenizer(sc.nextLine());
        int m = st.countTokens();
        String[] arr2 = new String[m];
        for(int i = 0; i < m ; i++){
            arr2[i] = st.nextToken();
        }

        StringBuilder sb = new StringBuilder();
        int maxLength = Math.max(n, m);
        for(int i = 0; i < maxLength; i++){
            if(i < n){
                sb.append(arr1[i]).append(' ');
            }
            if(i < m){
                sb.append(arr2[i]).append(' ');
            }
        }
        System.out.println(sb);
    }
}
