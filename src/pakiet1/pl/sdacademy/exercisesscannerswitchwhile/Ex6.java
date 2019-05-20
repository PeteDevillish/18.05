package pakiet1.pl.sdacademy.exercisesscannerswitchwhile;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int a = 3;
        while(input>a){
            a *= 3;
        }
        System.out.println(a);
    }
}
