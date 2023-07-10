package dz_6;

import java.util.HashSet;
import java.util.Set;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map.
// Например: “Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
// можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
public class Ex001 {
    public static void main(String[] args) {
        myNotebook notebook1 = new myNotebook("Acer","CD234", 32, 1000, 15.6);
        myNotebook notebook2 = new myNotebook("Sony","CD222", 64, 500, 17.0);
        myNotebook notebook3 = new myNotebook("HP","CD333", 32, 1000, 15.6);
        myNotebook notebook4 = new myNotebook("Lenovo","CD444", 16, 1000, 13.0);

        Set<myNotebook> set = new HashSet<>();
        set.add(notebook1);
        set.add(notebook2);
        set.add(notebook3);
        set.add(notebook4);

        System.out.println(set);
        System.out.println(notebook1.getManufacturer());
        System.out.println(notebook1.getModel());
        System.out.println(notebook1.getSize_RAM());
        System.out.println(notebook1.getSize_HDD());
        System.out.println(notebook1.getSize_Display());



    }
}
