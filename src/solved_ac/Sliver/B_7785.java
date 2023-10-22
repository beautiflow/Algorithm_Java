package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B_7785  {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<String> inCompany = new HashSet<String>();

        for(int i = 0; i < N; i++){
            StringTokenizer  st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String log = st.nextToken();

            if(log.equals("enter")){
                inCompany.add(name);
            }
            else if (log.equals("leave")) {
                inCompany.remove(name);
            }
        }

        ArrayList<String> list = new ArrayList<>();
        Iterator<String> iterator = inCompany.iterator();
        while (iterator.hasNext()){
            list.add(iterator.next());
        }

        Collections.sort(list, Collections.reverseOrder());

        for(String name : list){
            System.out.println(name);
        }
    }
}

