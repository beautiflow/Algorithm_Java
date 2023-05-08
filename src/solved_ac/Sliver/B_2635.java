package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B_2635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = N; i >= N / 2; i--) {
            ArrayList<Integer> List = new ArrayList<>();
            List.add(N);

            int temp = N;
            int temp2 = i;

            while (true) {
                if (temp < 0) {
                    break;
                }
                int temp3 = temp;

                if(temp2 >= 0){
                    List.add(temp2);
                }

                temp = temp2;
                temp2 = temp3 - temp;
            }
            if(count < List.size()){
                count = List.size();
                answer = List;
            }
        }
        System.out.println(count);
        for(Integer c : answer){
            System.out.print(c+ " ");
        }
    }
}