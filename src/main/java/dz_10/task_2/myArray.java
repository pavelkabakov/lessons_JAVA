package dz_10.task_2;

import java.lang.reflect.Array;

public class myArray{

//    private T array;
//
//    public myArray (T o1){
//        this.array = o1;
//    }

    public <T> void printArray(T[] items){

        for (T item: items) {
            System.out.println(item);
        }

        }
}
