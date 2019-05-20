public class ex8 {
    public static void main(String[] args) {
        ex8(4);

    }

    static void ex8(int x) {
        for (int i = 1; i < x + 1; i++) {
            for (int j = 1; j < i+ 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
