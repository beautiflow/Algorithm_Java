package cnusw_practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> prison = new ArrayList<>();
        int prisonNumber = Integer.parseInt(sc.nextLine());
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        for(int i = 0; i < prisonNumber; i++){
            prison.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> lighter = new ArrayList<>();
        int lighterNumber = Integer.parseInt(sc.nextLine());
        st = new StringTokenizer(sc.nextLine());
        for(int i = 0; i < lighterNumber; i++){
            lighter.add(Integer.parseInt(st.nextToken()));
        }

        int solution = 0;
        for(int i = 0; i < prisonNumber; i++){
            int prisonLocation = prison.get(i);
            int minDistance = 100000;
            for(int j = 0; j < lighterNumber; j++) {
                int lightLocation = lighter.get(j);
                minDistance = Math.min(minDistance, Math.abs(lightLocation - prisonLocation));
            }
            solution = Math.max(solution, minDistance);
        }
        System.out.println(solution);
    }
}

