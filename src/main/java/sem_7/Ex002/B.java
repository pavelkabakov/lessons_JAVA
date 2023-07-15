package sem_7.Ex002;

public class B extends A{

    public B(int a, int b) {
        super.i = a;
        this.i = b;
    }

    int i;

    public void show(){
        System.out.println("i (super) = " + super.i + "\n" + "i this = " + this.i );
    }
}
