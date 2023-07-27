package solved_ac.Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_8958 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < T; tc++){
            int point = 0;
            int sum = 0;
            String OX = br.readLine();
            char[] quiz = new char[OX.length()];

            for(int i = 0; i < OX.length(); i++){
                quiz[i] = OX.charAt(i);
            }

            for(int i = 0; i < OX.length(); i++){
                if(quiz[i] == 'O'){
                    point = point + 1;
                    sum += point;
                }
                else {
                    point = 0;
                    continue;
                }
            }
            System.out.println(sum);
        }
    }
}
