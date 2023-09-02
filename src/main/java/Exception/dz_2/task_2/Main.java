package Exception.dz_2.task_2;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[] {22,33,55,88,44,77,99,5,4};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

}



