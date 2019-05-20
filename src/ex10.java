public class ex10 {
    public static void main(String[] args) {
        ex10(4);
    }

    static void ex10(int x) {
        for (int i = x; i > 0; i--) {
            for (int j = x - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
