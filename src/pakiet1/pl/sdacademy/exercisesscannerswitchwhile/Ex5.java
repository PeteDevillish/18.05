package pakiet1.pl.sdacademy.exercisesscannerswitchwhile;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < (int) Math.sqrt(input); i++) {
            isPrime = true;
            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("To jest liczba pierwsza");
        else {
            System.out.println("To nie jest liczba pierwsza");

        }
        }
    }
