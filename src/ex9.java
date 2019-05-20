public class ex9 {
    public static void main(String[] args) {
        ex9(4);
    }

    static void ex9(int x) {
        for (int i = x; i > 0; i--) {
            for (int j = 1; j < i+ 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
