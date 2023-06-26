package dz_1;

import java.util.Scanner;

public class dz_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        iScanner.close();
        System.out.printf("Треугольное число: %d\n", summNumber(i));
        System.out.printf("Факториал: %d\n", factorial(i));
    }

    public static int summNumber(int a) {
        return (a * (a + 1)) / 2;
    }

    public static int factorial(int a){
        int fact = 1;
            if (a == 0) {
                return 1;
            }
            else {
                for (int i = 1; i <= a; i++) {
                    fact = fact * i;
            }
        }
        return fact;
    }


}
