package Study.문자열기초;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1543 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        String search = br.readLine();

        int count = 0;

        for(int i = 0; i <= text.length()-search.length(); i++){
            if(text.substring(i, i+search.length()).equals(search)){
                count++;
                i += search.length()-1;
            }
        }
        System.out.println(count);
    }
}
