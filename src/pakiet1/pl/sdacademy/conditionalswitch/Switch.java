package pakiet1.pl.sdacademy.conditionalswitch;

public class Switch {
    public static void main(String[] args) {
        int x = 3;
        switch (x) {
            case 1:
                System.out.println("Wartość 1");
            case 2:
                System.out.println("Wartość 2");
            case 3:
                System.out.println("Wartość 3");
                break;
                default:
                    System.out.println("Wartość różna od 1, 2,3");
        }
    }
}
