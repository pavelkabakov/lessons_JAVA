package les_3;

import java.util.ArrayList;

public class Ex002_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList list = new ArrayList();
        list.add(2809);
        list.add(6688);
        list.add(443);
        list.add(456);
        list.add(999);


        for (Object o : list) {
            System.out.println(o);
        }
    }

}
