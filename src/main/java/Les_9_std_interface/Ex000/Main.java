package Les_9_std_interface.Ex000;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo() {
            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
        };

        foo.m1();
        foo.m2();
    }
}

