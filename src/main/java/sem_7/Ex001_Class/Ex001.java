package sem_7.Ex001_Class;

public class Ex001 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(1.2, 2.3, "white");
        Triangle t2 = new Triangle(3.4, 5.6, "black");

//        t1.setHeight(1.5);
//        t1.setWidth(2.1);
//        t1.style = "черный";
//
//        t2.setHeight(1.3);
//        t2.setWidth(2.5);
//        t2.style = "Белый";

        System.out.println("Информация о t1 ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь " + t1.area());

        System.out.println("Информация о t2 ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь " + t2.area());
    }
}
