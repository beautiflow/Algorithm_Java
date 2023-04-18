package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class B_1431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] serial = new String[N];

        for(int i = 0; i < N; i++){
            serial[i] = br.readLine();
        }

        Arrays.sort(serial, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length()){
                    return -1;
                }
                else if(o1.length() == o2.length()){
                    if (sum(o1) == sum(o2)) {
                        return o1.compareTo(o2);
                    }
                    else {
                        return Integer.compare(sum(o1), sum(o2));
                    }
                }
                else {
                    return 1;
                }
            }
        });

        for(int i = 0 ; i < N; i++){
            System.out.println(serial[i]);
        }
    }

    public static int sum(String str){
        int sum = 0;

        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                sum += str.charAt(i) - '0';
            }
        }
        return sum;
    }
}
