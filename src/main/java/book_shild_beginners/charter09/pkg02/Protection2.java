package book_shild_beginners.charter09.pkg02;
import book_shild_beginners.charter09.pkg01.Protection;

class Protection2 extends Protection {
    Protection2() {
        System.out.println("Конструктор, унаследованный из другого пакета");

        //ОШИБКА!!! доступно только для данного класса Protection или пакета pkg01
        //System.out.println("n = " + n);
        //ОШИБКА!!! доступно только для данного класса Protection
        //System.out.println("n_priv = " + npriv);

        System.out.println("n_prot = " + n_prot);
        System.out.println("n_publ = " + n_publ);
    }
}
