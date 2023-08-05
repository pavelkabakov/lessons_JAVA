package Les_9_std_interface.Ex002_Iterator;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {


        //#region Worker Iterator
       
         Worker worker = new Worker(
             "Имя", "Фамилия", 23, 4567);

         Iterator<String> components = worker;

         while (components.hasNext()) {
             System.out.println(worker.next());
         }
       
    }
}
