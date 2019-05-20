package pakiet1.pl.sdacademy.input;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość tekstową");
        String stringInput = scanner.nextLine();
        System.out.println("Podano: " + stringInput);

        int intInput = scanner.nextInt();
        System.out.println("Podano: " + stringInput);
    }

}
