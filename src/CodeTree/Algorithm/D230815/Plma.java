package CodeTree.Algorithm.D230815;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Plma {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        char o = st.nextToken().charAt(0);
        int c = Integer.parseInt(st.nextToken());

        if(o == '+'){
            System.out.println(a +" + "+c+" = "+plus(a, c));

        }
        else if (o == '-') {
            System.out.println(a +" - "+c+" = "+minus(a,c));
        }
        else if (o == '*') {
            System.out.println(a +" * "+c+" = "+multiply(a,c));
        }
        else if (o == '/') {
            System.out.println(a +" / "+c+" = "+devide(a,c));
        }
        else {
            System.out.println("False");
        }


    }

    public static int plus(int a, int c){
        return a+c;
    }

    public static int minus(int a, int c){
        return a-c;
    }

    public static int multiply(int a, int c){
        return a*c;
    }

    public static int devide(int a, int c){
        return a/c;
    }
}
