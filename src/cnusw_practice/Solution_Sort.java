package cnusw_practice;

import java.util.Arrays;

public class Solution_Sort{
    public String solution (String[] runner, String[] finish){

        Arrays.sort(runner);
        Arrays.sort(finish);

        for(int i = 0; i < finish.length; i++){
            if(runner[i].equals(finish[i])){
                continue;
            }
            else{
                return runner[i];
            }
        }
        return runner[runner.length-1];
    }

    public static void main(String[] args){
        String[] run = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] fin = {"josipa", "filipa", "marina", "nikola"};
        Solution_Sort sol = new Solution_Sort();
        System.out.println(sol.solution(run, fin));
    }
}