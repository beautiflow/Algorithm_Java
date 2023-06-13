package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_5648 {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        List<Long> nums = new ArrayList<>();

        while (N-- >0) {
            if (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            nums.add(reverse(Long.parseLong(st.nextToken())));
        }
        Collections.sort(nums);

        for (long num : nums) {
            sb.append(num).append('\n');
        }
        System.out.println(sb);
    }

    public static long reverse(long number) {
        String s = String.valueOf(number);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        long result = Long.parseLong(sb.toString());
        return result;
    }
}


//        List<Long> list = new ArrayList<>();
//        while(st.hasMoreTokens()) {
//            list.add(reverse(st.nextToken()));
//
//            System.out.println(list);
//        }
//
//        Collections.sort(list);
//        for (int i = 0; i < N; i++) {
//            sb.append(list.get(i)+"\n");
//        }
//        System.out.println(sb.toString());
//    }
//
//
//    static long reverse(String list) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(list);
//        return Long.parseLong(sb.reverse().toString());
//    }
