package kids_store;

public class Main {

    public static void main(String[] args) {

        Toy toy1 = new Toy("123456", "Toy1", 50, 50);
        Toy toy2 = new Toy("123457", "Toy2", 50, 50);
        Toy toy3 = new Toy("123458", "Toy3", 10, 10);
        Toy toy4 = new Toy("123459", "Toy4", 40, 40);
        Toy toy5 = new Toy("123460", "Toy5", 50, 99);
        Toy toy6 = new Toy("123461", "Toy6", 50, 99);
        Toy toy7 = new Toy("123462", "Toy7", 50, 99);

        ToysStorage toysStorage = new ToysStorage();
        ToysStorage prizeStorage = new ToysStorage();

        toysStorage.addToy(toy1.getArticle(), toy1);
        toysStorage.addToy(toy2.getArticle(), toy2);
        toysStorage.addToy(toy3.getArticle(), toy3);
        toysStorage.addToy(toy4.getArticle(), toy4);
        toysStorage.addToy(toy5.getArticle(), toy5);
        toysStorage.addToy(toy6.getArticle(), toy6);
        toysStorage.addToy(toy7.getArticle(), toy7);

        System.out.println("toys in storage");
        toysStorage.printToys();
        System.out.println("prize toys");
        prizeStorage.printToys();

        System.out.println("перемещаем");

        prizeStorage.addToy(toy2.getArticle(), toy2);
        toysStorage.removeToy(toy2.getArticle());
        prizeStorage.addToy(toy3.getArticle(), toy3);
        toysStorage.removeToy(toy3.getArticle());
        prizeStorage.addToy(toy5.getArticle(), toy5);
        toysStorage.removeToy(toy5.getArticle());

        System.out.println("toys in storage");
        toysStorage.printToys();
        System.out.println("prize toys");
        prizeStorage.printToys();

    }
}
