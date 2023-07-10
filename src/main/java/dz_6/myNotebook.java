package dz_6;

import sem_6.Cat.Cat;

import java.util.List;

public class myNotebook {
    private String manufacturer;
    private String model;
    private Integer size_RAM;
    private Integer size_HDD;
    private Double size_Display;
    public myNotebook(String manufacturer, String model, int size_RAM, int size_HDD, double size_Display){
        this.manufacturer = manufacturer;
        this.model = model;
        this.size_RAM = size_RAM;
        this.size_HDD = size_HDD;
        this.size_Display = size_Display;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }
    public Integer getSize_RAM() {
        return size_RAM;
    }
    public Integer getSize_HDD() {
        return size_HDD;
    }
    public Double getSize_Display() {
        return size_Display;
    }
    @Override
    public String toString(){
        return "manufacturer: " + manufacturer + ", model: " + model + ", HDD: " + size_HDD + ", RAM: " + size_RAM +
                ", Display: " + size_Display + "\n";
    }

//    @Override
//    public boolean equals(Object o){
//        if (this == o) return true;
//        if (!(o instanceof Cat)) return false;
//        Cat cat = (Cat)o;
//        return name.equals(cat.name) && owner.equals(cat.owner) && breed.equals(cat.breed) && age == cat.age;
//    }

//    @Override
//    public int hashCode(){
//        return 3*name.hashCode() + 12*age + 5*breed.hashCode() + 8*owner.hashCode();
//    }
}
