package CodeTree.Algorithm.D2308.D230817;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Continue {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        int[] arr = new int[n1];
        int[] brr = new int[n2];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < brr.length; i++){
            brr[i] = Integer.parseInt(st.nextToken());
        }


        if(part(arr, brr)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }

    public static boolean part(int[] arr, int[] brr){

        int count = 0;

        for(int i = 0; i < arr.length; i++){
                int num = 0;
                if (arr[i] == brr[count]){
                    count++;
                    num = 1;
                }
            if(count==brr.length){
                return true;
            }
            if(num==0&&count>0){
                return false;
            }
        }
        return false;
    }
}
