package CodeTree.Algorithm.D230817;

public class IsReturn67 {
    public static int f(int n) {
        if (n < 2)
            return 0;
        for(int d = n - 1; d > 1; d--) {
            if (n % d == 0)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.print(f(1) + " ");
        System.out.print(f(11) + " ");
        System.out.print(f(21) + " ");
        System.out.print(f(31) + " ");
    }


}
