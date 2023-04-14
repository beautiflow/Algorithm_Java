package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B_2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());

        LinkedList<Integer> garo = new LinkedList<Integer>();
        LinkedList<Integer> sero = new LinkedList<Integer>();

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int where = Integer.parseInt(st.nextToken());
            int point = Integer.parseInt(st.nextToken());

            if(where == 0){
                garo.add(point);
            }
            if(where == 1){
                sero.add(point);
            }
        }

        garo.add(h);
        garo.add(0);
        sero.add(w);
        sero.add(0);

        garo.sort(null);
        sero.sort(null);

        int max_x = 0;
        for(int i = garo.size() -1; i > 0; i--){
            int temp = garo.get(i) - garo.get(i-1);
            if(max_x < temp){
                max_x = temp;
            }
        }

        int max_y = 0;
        for(int i = sero.size() -1; i > 0; i--){
            int temp = sero.get(i) - sero.get(i-1);
            if(max_y < temp){
                max_y = temp;
            }
        }

        System.out.println(max_x * max_y);
    }
}
