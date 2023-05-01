package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10709 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int dot;

        for (int i = 0; i < H; i++) {
            String sky = br.readLine();
            dot = -1;
            for (int j = 0; j < W; j++) {
                if (sky.charAt(j) == 'c') {
                    sb.append("0 ");
                    dot = j;
                }
                else if (dot == -1) {
                    sb.append("-1").append(" ");
                }
                else {
                    sb.append(j - dot).append(" ");
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
        System.out.println('\n');
    }
}
