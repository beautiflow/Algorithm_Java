package CodeTree.Algorithm.D2308.D230817;

public class IsReturn18 {
    static int[] p = new int[]{1, 3, 7, 8, 4, 3, 5, 2, 9, 2};

    public static void main(String[] args) {

        System.out.println(f(0, 9, 5, 6));


    }

    public static int g(int a, int b, int x){
        int i, c = 0;
        for(i = a; i <= b; i++) if (p[i] <= x) c++;
        return c;
    }

    public static int f(int a, int b, int x, int k) {
        int mid, lc;
        if (a == b) return p[a];
        mid = (a + b) / 2;
        lc=g(a,mid,x);
        if (lc >= k) return f(a, mid, x, k);
        else return f(mid + 1, b, x, k - lc);
    }
}
