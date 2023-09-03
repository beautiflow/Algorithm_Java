package CodeTree.Algorithm.D2308.D230814;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IsReturn {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(checkReturn(num));

    }

    public static int checkReturn(int num){
        return (int)((num / 2.5) * 3);
    }
}
