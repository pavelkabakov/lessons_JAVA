//2)* Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации
// запишите в лог-файл.
package dz_2;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;
public class task_2 {
    public static void main(String[] args) throws IOException{
        int [] array = {2, 5, 1, -7, 3, 64, 0};
        System.out.println(Arrays.toString(array));
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
//        printArrayInt(newArr);
        System.out.println(Arrays.toString(newArr));

    }
    public static int[] listSort(int [] arr) throws IOException{
        Logger logger = Logger.getLogger(task_2.class.getName());
        FileHandler fh = new FileHandler("logTask_2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        for(int k = 0; k < arr.length-1; k++) {
            logger.info("Итерация: " + k + "; " + "Массив: " + Arrays.toString(arr) + "\n");
            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}
