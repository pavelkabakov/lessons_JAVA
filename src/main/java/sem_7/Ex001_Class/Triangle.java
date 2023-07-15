package sem_7.Ex001_Class;

class Triangle extends TwoShape {

    String style;

    public Triangle(double height, double width,  String style) {
        super(width, height);
        this.style = style;
    }

    public Triangle(){
        super();
        this.style = "";
    }

    public double area() {
        return getHeight() * getWidth() / 2;
    }

    public void showStyle() {
        System.out.printf("Треугольник %s \n", style);
    }
}
