package dz_7.Task_1;

public class myCat {

    private String name;

    private int age;

    public String getCatOwner() {
        return catOwner;
    }

    public void setCatOwner(String catOwner) {
        this.catOwner = catOwner;
    }

    private String catOwner;



    public myCat(String name, int age, String catOwner){
        this.name = name;
        this.age = age;
        this.catOwner = catOwner;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void sayHello(){
        System.out.printf("Мяу! Меня зовут %s. Мне %d лет. Мой владелец: %s", name, age, catOwner);
    }

}
