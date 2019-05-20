package pakiet1.pl.sdacademy.whileloop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int x = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zgadnij moją liczbę");
        int input = sc.nextInt();
        while(input != x){
            System.out.println("Nie zgadłeś, spróbuj ponownie");
            input = sc.nextInt();
        }
        System.out.println("Zgadłeś");

    }
}
