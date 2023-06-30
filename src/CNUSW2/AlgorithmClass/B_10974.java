package CNUSW2.AlgorithmClass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B_10974 {
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> tmp = new ArrayList<>();
        N = Integer.parseInt(br.readLine());
        int count = 0;
        backtrack(count, tmp);
    }

    private static void backtrack(int cnt, List<Integer> list) {
        if(list.size() == N){
           for(int num : list){
               System.out.print(num+" ");
           }
            System.out.println();
            return;
        }

        for(int i = 1; i <= N; i++){
            if(!list.contains(i)){
                list.add(i);
                backtrack(cnt+1, list);
                list.remove(list.size()-1 );
            }
        }
    }
}

