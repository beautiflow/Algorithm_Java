package CodeTree.Algorithm.D230822;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DateReturn {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());


        if(1 > M || M >= 13){
            System.out.println("No");
        }
        else if(M == 2){
            if(month28(D)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        else if(M == 4 || M == 6 || M == 9 || M == 11){
            if(month30(D)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        else {
            if(month31(D)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }

    public static boolean month28(int D){
        if(1 <= D && D <= 28){
            return true;
        }
        return false;
    }

    public static boolean month30(int D){
        if( 1 <= D && D <= 30){
            return true;
        }
        return false;
    }

    public static boolean month31(int D){
        if(1 <= D && D <= 31){
            return true;
        }
        return false;
    }
}
