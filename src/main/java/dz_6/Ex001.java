package dz_6;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import java.security.PrivateKey;
import java.util.*;

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
        myNotebook notebook1 = new myNotebook("Acer", "CD234", "32", "1000", "15.6");
        myNotebook notebook2 = new myNotebook("Sony", "CD222", "64", "500", "17.0");
        myNotebook notebook3 = new myNotebook("HP", "CD333", "32", "1000", "15.6");
        myNotebook notebook4 = new myNotebook("Lenovo", "CD444", "16", "1000", "13.0");
        myNotebook notebook5 = new myNotebook("APPLE", "CD555", "16", "2000", "13.0");
        myNotebook notebook6 = new myNotebook("Lenovo", "CD666", "32", "3000", "16.0");

        Set<myNotebook> set = new HashSet<>();
        set.add(notebook1);
        set.add(notebook2);
        set.add(notebook3);
        set.add(notebook4);
        set.add(notebook5);
        set.add(notebook6);

        Map<String, String> filter = new HashMap<>(); // база параметров фильтрации
        filter.put("1", "Размер ОЗУ");
        filter.put("2", "Размер HDD");
        filter.put("3", "Размер экрана");
        filter.put("4", "Производитель");
        filter.put("5", "Вывести все");


        Map<String, String> ram = new HashMap<>(); // база объема памяти
        ram.put("1", "8");
        ram.put("2", "16");
        ram.put("3", "32");
        ram.put("4", "64");

        Map<String, String> hdd = new HashMap<>(); // база объема HDD
        hdd.put("1", "500");
        hdd.put("2", "1000");
        hdd.put("3", "2000");
        hdd.put("4", "4000");

        Map<String, String> screen = new HashMap<>(); // база размеров экрана
        screen.put("1", "11.0");
        screen.put("2", "13.0");
        screen.put("3", "15.6");
        screen.put("4", "16.0");
        screen.put("5", "17.0");

        Map<String, String> manufacturer = new HashMap<>(); // база производителей
        manufacturer.put("1", "Acer");
        manufacturer.put("2", "Sony");
        manufacturer.put("3", "HP");
        manufacturer.put("4", "Lenovo");
        manufacturer.put("5", "APPLE");


//        System.out.println(set);
//        System.out.println(notebook1.getManufacturer());
//        System.out.println(notebook1.getModel());
//        System.out.println(notebook1.getSize_RAM());
//        System.out.println(notebook1.getSize_HDD());
//        System.out.println(notebook1.getSize_Display());

        find_by_filter(set, filter, ram, hdd, screen, manufacturer);
    }
    static void find_by_filter(Set<myNotebook> set,
                               Map<String, String> filter,
                               Map<String, String> ram,
                               Map<String, String> hdd,
                               Map<String, String> screen,
                               Map<String, String> manufacturer) {

        switch (enter_key(filter)){
            case "1":
                System.out.println("выбор 1"); // for test
                String ram_value = enter_key(ram);
                for (Map.Entry entry: ram.entrySet()){
                    if (entry.getKey().equals(ram_value)){
//                        System.out.println(entry.getValue() + " Гб"); // for test
                        print_notebook_set(set, "size_RAM", entry.getValue().toString());
                    }

                }
                break;
            case "2":
                System.out.println("выбор 2"); // for test
                String hdd_value = enter_key(hdd);
                for (Map.Entry entry: hdd.entrySet()){
                    if (entry.getKey().equals(hdd_value)){
//                        System.out.println(entry.getValue() + " Гб"); // for test
                        print_notebook_set(set, "size_HDD", entry.getValue().toString());
                    }

                }
                break;
            case "3":
                System.out.println("выбор 3"); // for test
                String screen_value = enter_key(screen);
                for (Map.Entry entry: screen.entrySet()){
                    if (entry.getKey().equals(screen_value)){
//                        System.out.println(entry.getValue() + " дюймов"); // for test
                        print_notebook_set(set, "size_Display", entry.getValue().toString());
                    }

                }
                break;
            case "4":
                System.out.println("выбор 4"); // for test
                String manufacturer_value = enter_key(manufacturer);
                for (Map.Entry entry: manufacturer.entrySet()){
                    if (entry.getKey().equals(manufacturer_value)){
//                        System.out.println(entry.getValue()); // for test
                        print_notebook_set(set, "manufacturer", entry.getValue().toString());
                    }

                }
                break;
            case "5" :
                print_notebook_set(set, "Вывести все", "");
                break;

        }

    }
    static void print_notebook_set(Set<myNotebook> set, String param , String value ){
        for (var item: set){
            switch (param){
                case "manufacturer" :
                    if (item.getManufacturer().equals(value))
                        System.out.println(item);
                    break;
                case "size_RAM" :
                    if (item.getSize_RAM().equals(value))
                        System.out.println(item);

                    break;
                case "size_HDD" :
                    if (item.getSize_HDD().equals(value))
                        System.out.println(item);
                    break;
                case "size_Display" :
                    if (item.getSize_Display().equals(value))
                        System.out.println(item);
                    break;
                case "Вывести все":
                        System.out.println(item);
                    break;

            }

        }
    }
    static void print_Map(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }

    static String enter_key(Map<String, String> map) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Выберите параметр: " + "\n");
        print_Map(map);
        String name = iScanner.nextLine();
        System.out.println("ввод - " + name); // for test
//        iScanner.close();
        return name;
    }

}



