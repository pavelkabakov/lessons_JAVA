package sem_7.Ex001_Class;

public class TwoShape {

    private double width;

    private double height;

    public TwoShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public TwoShape(){
        this.width = 0;
        this.height = 0;
    }

    public TwoShape(double size){
        this.width = size;
        this.height = size;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void showDim() {
        System.out.printf("Ширина %.2f, высота %.2f \n", width, height);
    }

}
