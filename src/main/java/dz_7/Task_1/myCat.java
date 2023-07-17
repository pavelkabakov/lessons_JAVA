package dz_7.Task_1;

public class myCat implements myCatInterface {

    private String name;

    private int age;

    @Override
    public String getCatOwner() {
        return catOwner;
    }

    @Override
    public void setCatOwner(String catOwner) {
        this.catOwner = catOwner;
    }

    private String catOwner;



    public myCat(String name, int age, String catOwner){
        this.name = name;
        this.age = age;
        this.catOwner = catOwner;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public int getAge(){
        return age;
    }

    @Override
    public void setAge(int age){
        this.age = age;
    }

    public void sayHello(){
        System.out.printf("Мяу! Меня зовут %s. Мне %d лет. Мой владелец: %s", name, age, catOwner);
    }

}
