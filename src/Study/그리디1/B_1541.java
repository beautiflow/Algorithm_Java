package Study.그리디1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1541 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] math = br.readLine().split("-");
        int ans = 0;

        for(int i = 0; i < math.length; i++){
            int sum = 0;
            String[] str = math[i].split("\\+");
            for(int j = 0; j < str.length; j++){
                sum += Integer.parseInt(str[j]);
            }

            if(i == 0){
                ans += sum;
            }
            else {
                ans -= sum;
            }
        }
        System.out.println(ans);
    }
}
