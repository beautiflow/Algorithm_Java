package CodeTree.Algorithm.D2308.D230814;

public class IsReturn6 {
    public static int f(int x, int y, int z) {
        if (x > y) {
            if (x > z) {
                return x;
            }
            else {
                return z;
            }
        }
        else {
            if (y > z) {
                return y;
            }
            else {
                return z;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print(f(2, 3, 4) + " " + f(4, 3, 2) + " " + f(3, 2, 4));
    }

}
