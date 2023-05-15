package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2564 {

    static int[] map;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int width = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        int shop = Integer.parseInt(br.readLine());
        int cnt = 0;
        int police = 0;

        map = new int[shop];

        for(int i = 0; i < shop+1; i++){
            st = new StringTokenizer(br.readLine());
            int dir = Integer.parseInt(st.nextToken());
            int loc = Integer.parseInt(st.nextToken());
            int temp = 0;

            switch (dir){
                case 1 :
                    temp = loc;
                    break;
                case 2 :
                    temp = width + length + width - loc;
                    break;
                case 3 :
                    temp = width + length + width + length - loc;
                    break;
                case 4 :
                    temp = width + loc;
                    break;
            }

            if(i < shop){
                map[i] = temp;
            }
            else {
                police = temp;
            }
        }

        for(int i = 0; i < shop; i++){
            int path1 = Math.abs(police - map[i]);
            int path2 = 2 * width + 2 * length - path1;
            cnt += Math.min(path1, path2);
        }
        System.out.println(cnt);
    }
}