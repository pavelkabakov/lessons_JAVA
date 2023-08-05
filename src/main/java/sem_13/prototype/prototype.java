package sem_13.prototype;

// Прототип
 abstract class Shape implements Cloneable {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// Конкретная реализация прототипа
 class Circle extends Shape {
    public Circle() {
        setType("Circle");
    }
}

// Конкретная реализация прототипа
 class Square extends Shape {
    public Square() {
        setType("Square");
    }
}
