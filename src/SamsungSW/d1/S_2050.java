package SamsungSW.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        char[] arr = str.toCharArray();  // 문자열의 배열을 한 글자씩 잘라 배열에 삽입
        for(int i = 0; i < arr.length; i++){
            System.out.printf(arr[i] - 'A' + 1 + " ");
        }
     }
}
