//Вывести все простые числа от 1 до 1000
// Ввод 10 вывод - Простые числа: [2, 3, 5, 7]

package dz_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Введите положительное число: ");
         int input = scanner.nextInt();
         scanner.close();
         List<Integer> primes = new ArrayList<>();

         for (int i = 2; i <= input; i++) {
         boolean isPrimeNumber = true;
         for (int j = 2; j < i; j++) {
             if (i % j == 0) {
                 isPrimeNumber = false;
                 break;
             }
         }
         if (isPrimeNumber) {
             primes.add(i);
         }
    }
         System.out.println("Простые числа: " + primes);
    }

}
