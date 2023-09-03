package CodeTree.Algorithm.D2308.D230814;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeapYear {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if(leapYear(num)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }

    public static boolean leapYear(int num){
        if(num%4==0 && num%100!=0 ||num%400==0){
            return true;
        }
        return false;
    }
}
