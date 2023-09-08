package CodeTree.Algorithm.D2308.D230809;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = sum(N);

        System.out.println(sum);
    }

    public static int sum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        int answer = sum / 10;

        return answer;
    }
}
