package sem_8.Ex004;

public class Main {
    public static void main(String[] args) {

        Class_default_metods t4 = new Class_default_metods();

        System.out.println("getAdmin: " + t4.getAdminID());

        System.out.println("getUser: " + t4.getUserID());

        System.out.println("static metod: " + MyIf.getUniqueID());
    }
}
