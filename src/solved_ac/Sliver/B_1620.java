package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> pocketName = new HashMap<>();
        HashMap<Integer, String> pocketNum = new HashMap<>();
        for(int i = 1; i <= N; i++){
            String name = br.readLine();
            pocketName.put(name, i);
            pocketNum.put(i, name);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < M; i++){
            String input = br.readLine();
            if(isNumber(input)){
                sb.append(pocketNum.get(Integer.parseInt(input)) + "\n");
            }
            else{
                sb.append(pocketName.get(input)+ "\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean isNumber(String s){
        try {
            Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}
