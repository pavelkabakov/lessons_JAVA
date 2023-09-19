package kids_store;

import java.util.Map;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Toy toy1 = new Toy("123456", "Toy1", 50, 10);
        Toy toy2 = new Toy("123457", "Toy2", 50, 20);
        Toy toy3 = new Toy("123458", "Toy3", 10, 30);
        Toy toy4 = new Toy("123459", "Toy4", 40, 40);
        Toy toy5 = new Toy("123460", "Toy5", 50, 50);
        Toy toy6 = new Toy("123461", "Toy6", 50, 60);
        Toy toy7 = new Toy("123462", "Toy7", 50, 70);
        Toy toy8 = new Toy("123463", "Toy8", 50, 1);
        Toy toy9 = new Toy("123464", "Toy9", 50, 0);

        ToysStorage toysStorage = new ToysStorage();
        ToysStorage prizeStorage = new ToysStorage();

        toysStorage.addToy(toy1.getArticle(), toy1);
        toysStorage.addToy(toy2.getArticle(), toy2);
        toysStorage.addToy(toy3.getArticle(), toy3);
        toysStorage.addToy(toy4.getArticle(), toy4);
        toysStorage.addToy(toy5.getArticle(), toy5);
        toysStorage.addToy(toy6.getArticle(), toy6);
        toysStorage.addToy(toy7.getArticle(), toy7);
        toysStorage.addToy(toy8.getArticle(), toy8);
        toysStorage.addToy(toy9.getArticle(), toy9);

        System.out.println("------- До проведения лотереи --------------");
        System.out.println("toys in storage");
        toysStorage.printToys();
        System.out.println("prize toys");
        prizeStorage.printToys();

        System.out.println("---------- меняем частоту выпадения Toy9 -----------");
        String article = "123464";
        for (Map.Entry<String, Toy> item : toysStorage.getStorage().entrySet()) {
            if (article.equals(item.getValue().getArticle())) {
                item.getValue().setFrequency(5);
            }
        }

        System.out.println("toys in storage");
        toysStorage.printToys();

        System.out.println("старт лотереи 1");
        start_lottery(toysStorage, prizeStorage);
        System.out.println("старт лотереи 2");
        start_lottery(toysStorage, prizeStorage);
        System.out.println("старт лотереи 3");
        start_lottery(toysStorage, prizeStorage);
        System.out.println("старт лотереи 4");
        start_lottery(toysStorage, prizeStorage);

        System.out.println("---------- После лотереи -----------");
        System.out.println("toys in storage");
        toysStorage.printToys();
        System.out.println("prize toys");
        prizeStorage.printToys();


    }

    public static void start_lottery(ToysStorage toysStorage, ToysStorage prizeStorage) {

        boolean result_lottery = true;
        while (result_lottery) {
//            System.out.println("начало тиража");
            int random = (int) (1 + (Math.random() * 100));
//            int random = 60; // for test
//            System.out.println("вероятность выпадания игрушки = " + random);
            int i = 1; // счетчик
            int toy_number = (int) (Math.random() * toysStorage.getStorage().size() + 1);
//            System.out.println("выпала игрушка номер = " + toy_number);
            for (Map.Entry<String, Toy> item : toysStorage.getStorage().entrySet()) {
                if (i == toy_number) {
                    if (random <= (item.getValue().getFrequency())) {
                        System.out.println("выпала игрушка " + item.getValue().getToy_name());
                        prizeStorage.addToy(item.getKey(), item.getValue());
                        toysStorage.removeToy(item.getKey());
                        result_lottery = false;
                        break;
                    }
                }
                i += 1;
            }
        }
    }
}
