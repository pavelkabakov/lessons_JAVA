package les_1;

import java.util.Scanner;

public class Ex001_Scanner {
    public static void main(String[] args) {
        task1();
        task1();


//        Scanner in = new Scanner(System.in);
//        System.out.print("Input name: ");
//        String name = in.nextLine();
//        System.out.print("Input age: ");
//        int age = in.nextInt();
//        System.out.print("Input height: ");
//        float height = in.nextFloat();
//        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
//        in.close();

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input name: ");
//        String name = in.nextLine();
//        System.out.print("Input age: ");
//        int age = in.nextInt();
//        System.out.print("Input height: ");
//        float height = in.nextFloat();
//        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
//        in.close();

//        String input = "1 fish 2 fish red fish blue fish";
//        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
//        System.out.println(s.nextInt());
//        System.out.println(s.nextInt());
//        System.out.println(s.next());
//        System.out.println(s.next());
//        s.close();
    }


    static void task1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
//        in.close();
    }
}
