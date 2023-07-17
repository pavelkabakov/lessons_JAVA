package dz_7.Task_2;

public class Rectangle implements FigureInterface {

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    private int width;

    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this.width = 10;
        this.height = 10;
    }

    @Override
    public int calculateArea(){
        return this.width*this.height;
    }

    @Override
    public int calculatePerimeter(){
        return 2*(this.height+this.height);
    }


}
