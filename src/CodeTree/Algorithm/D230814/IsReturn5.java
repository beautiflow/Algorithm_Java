package CodeTree.Algorithm.D230814;

public class IsReturn5 {
    public static int f(int x, int L) {
        return 2 * L - x;
    }

    public static void main(String[] args) {
        int i, x = 1;
        for (i = 0; i < 6; i++) {
            x = f(x, -i);
            x = f(x, i);
        }
        System.out.println(x);
    }

}
