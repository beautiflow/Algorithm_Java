package CodeTree.Algorithm.D2308.D230822;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SeasonReturn {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Y = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        if(valueCheck(Y, M, D)){


        }
        else {
            System.out.println(-1);
        }
    }

    public static boolean valueCheck(int y, int m, int d){
        return false;
    }
}
