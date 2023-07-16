package sem_8.Ex001_Interface;

public class Class_Test2 {

    int start;

    int val;

    public Class_Test2() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 20;
        return val;
    }

    public void reset() {
        start = 10;
        val = 10;
    }

    public void setNum(int x) {
        start = x;
        val = x;
    }

    public void promo() {
        System.out.println("Hello!");
    }
}
