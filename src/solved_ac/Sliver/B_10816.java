package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*

먼저 List 를 정렬해준다.
그 다음 List 에서 내가 찾는 값의 갯수를 파악하기 위해서는 list 에서 내가 찾는 값의 가장 낮은 index 와 가장 높은 index 값을 빼주면 해당 값의 갯수를 파악할 수 있다.
해당 원리를 이용해서 2개의 함수를 만든다.
먼저 찾는 값의 가장 낮은 index 를 파악하기 위한 함수 lowerBound 와 가장 높은 index 를 파악하는 upperBound 이렇게 2개의 함수를 생성한다.
upperBound 에서는 half 범위를 계속 올려서 찾는 값 중 가장 높은 인덱스의 값을 반환하고
lowerBound 에서는 half 범위를 낮춰서 찾는 값중 가장 낮은 인덱스의 값을 반환한다.
이 인덱스 값의 차이가 결국 중복된 원소의 갯수를 의미한다.

 */

public class B_10816 {
    static final List<Integer> nlist = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            nlist.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(nlist);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(st.nextToken());

            sb.append(uppderBound(num) - lowerBound(num) + " ");
        }
        System.out.println(sb);
    }


    private static int lowerBound(int num){
        int min = 0;
        int max = nlist.size();

        // min 과 max 가 같아질 때 까지 반복
        while (min < max) {
            int half = (min + max) / 2; // 중간 위치를 구한다

            if (num <= nlist.get(half)) {
                max = half;
            } else {
                min = half + 1;
            }
        }
        return min;
    }

    private static int uppderBound(int num){
        int min = 0;
        int max = nlist.size();

        // min 과 max 가 같아질 때 까지 반복
        while (min < max){
            int half = (min + max) / 2;

            if(num < nlist.get(half)){
                max = half;
            }
            else {
                min = half + 1;
            }
        }
        return min;
    }
}
