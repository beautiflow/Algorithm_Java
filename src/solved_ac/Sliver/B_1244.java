package solved_ac.Sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1244 {

    static int total;
    static int[] switches;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        total = Integer.parseInt(br.readLine());
        switches = new int[total+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= total; i++) {
            switches[i] = Integer.parseInt(st.nextToken());
        }

        int student = Integer.parseInt(br.readLine());

        for (int i = 0; i < student; i++) {
            st = new StringTokenizer(br.readLine());

            int gender = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                man(Integer.parseInt(st.nextToken()));
            } else if(gender == 2) {
                woman(Integer.parseInt(st.nextToken()));
            }
        }

        for (int i = 1; i < switches.length; i++) {
            System.out.print(switches[i] + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }

    public static void man(int x) {
        int cur = x;
        while(cur < switches.length) {
            if(switches[cur] == 0) {
                switches[cur] = 1;
            }
            else if(switches[cur] == 1) {
                switches[cur] = 0;
            }
            cur += x;
        }
    }

    public static void woman(int x) {
        if (switches[x] == 0) {
            switches[x] = 1;
        } else if (switches[x] == 1) {
            switches[x] = 0;
        }

        int count = 1;
            while ((x-count) > 0 && (x+count) < switches.length){
                if (switches[x + count] == switches[x - count]) {
                    if (switches[x + count] == 0) {
                        switches[x - count] = 1;
                        switches[x + count] = 1;
                    } else if (switches[x + count] == 1) {
                        switches[x - count] = 0;
                        switches[x + count] = 0;
                    }
                    count++;
                } else {
                    break;
                }
            }
        }
    }

