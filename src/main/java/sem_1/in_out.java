//В консоли запросить имя пользователя. В зависимости от текущего времени,
// вывести приветствие вида////"Доброе утро, <Имя>!", если время от 05:00 до 11:59
// //"Добрый день, <Имя>!", если время от 12:00 до 17:59;////"Добрый вечер, <Имя>!",
// если время от 18:00 до 22:59;////"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

package sem_1;

import java.util.Scanner;
public class in_out {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }
}
