package SamsungSW.practice;

import java.util.*;
import java.io.*;

public class SanggyunCode2 {
        static BufferedReader br;
        static BufferedWriter bw;
        public static void main(String[] args) throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine()); // 바구니 수
            int apple = Integer.parseInt(br.readLine()); // 사과
            int x = Integer.parseInt(br.readLine()); // 벌레의 위치
            int[] arr = new int[n]; // 바구니에 담긴 사과
            StringTokenizer st = new StringTokenizer(br.readLine());
            int left = -1, right = -1; // 가장 왼쪽 바구니, 오른쪽 바구니의 인덱스
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                if(left == -1 && arr[i] == 1) { // 가장 왼쪽 바구니 인덱스 찾기
                    left = i;
                }
                if(left != -1 && arr[i] == 1) { // 가장 왼쪽 바구니가 찾아졌으므로 오른쪽 바구니 인덱스 찾기
                    right = i;
                }
            }

            int length = 0;
            if(left < x && right < x) length = x - left;
            else if(left < x && x < right) {
                int distanceLeft = x - left;
                int distanceRight = right - x;
                if(distanceLeft <= distanceRight) {
                    length = 2 * distanceLeft + distanceRight;
                }
                else {
                    length = 2 * distanceRight + distanceLeft;
                }
            }
            else if(x < left && x < right) length = right - x;

            bw.write(length + "\n");
            bw.flush();
            br.close();
            bw.close();
        }
    }

