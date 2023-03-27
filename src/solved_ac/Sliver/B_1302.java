package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class B_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int size = 0;
        String result = "";

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < N; i++){
            String str = br.readLine();

            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            }
            else {
                map.put(str, 1);
            }
        }

        for(String key : map.keySet()){
            if(size < map.get(key)){
                size = map.get(key);
                result = key;
            }
            else if(size == map.get(key)){
                if(result.compareTo(key) > 0){
                    result = key;
                }
            }
        }
        System.out.println(result);
    }
}
