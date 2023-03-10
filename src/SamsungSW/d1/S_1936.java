package SamsungSW.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1936 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A + B == 5 && A > B) {
            System.out.println("A");
        }
        if (A + B == 5 && A < B) {
            System.out.println("B");
        }
        if (A + B == 4 && A < B) {
            System.out.println("A");
        }
        if (A + B == 4 && A > B) {
            System.out.println("B");
        }
        if (A + B == 3 && A > B) {
            System.out.println("A");
        }
        if (A + B == 3 && A < B) {
            System.out.println("B");
        }
    }
}
