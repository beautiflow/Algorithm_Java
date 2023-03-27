package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        for(int i = 0 ; i < A; i++){
            st = new StringTokenizer(br.readLine());
            set.add(st.nextToken());
        }

        int count = 0;
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < B; i++){
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            if(set.contains(temp)){
                list.add(temp);
                count++;
            }
        }

        sb.append(count).append('\n');
        Collections.sort(list);
        for(String i : list){
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
