package CodeTree.Algorithm.D2308.D230816;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sosu {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int count = 0;

        for(int i = a; i <= b; i++){
            if(sosuCheck(i)){
                if(sum(i)%2==0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static boolean sosuCheck(int i){
        if(i == 1){
            return false;
        }
        for(int j = 2; j < i; j++){
            if(i%j == 0){
                return false;
            }
        }
        return true;
    }

    public static int sum(int i){
       int sum = i/10 + i%10;

       return sum;
    }
}
