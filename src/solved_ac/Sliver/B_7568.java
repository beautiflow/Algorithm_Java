package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] height = new int[N];
        int[] weight = new int[N];
        int[] rank = new int[N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
            rank[i] = 1;
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(weight[i] < weight[j] && height[i] < height[j]){
                    rank[i]++;
                }
            }
        }
        for(int i = 0; i < N; i++){
            System.out.println(rank[i] + " ");
        }
    }
}
