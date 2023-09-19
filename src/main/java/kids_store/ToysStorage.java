package kids_store;


import java.util.HashMap;
import java.util.Map;

public class ToysStorage {



    public Map<String, Toy> getStorage() {
        return storage;
    }

    public void setStorage(HashMap<String, Toy> storage) {
        this.storage = storage;
    }

    public void addToy(String article, Toy item){
        this.storage.put(article, item );
    }

    public void removeToy(String article){
        this.storage.remove(article);
    }

    public void printToys(){
        for (Map.Entry<String, Toy> item: storage.entrySet()){
            System.out.printf("article is: %s, Toy: %s, Quantity: %d, Frequency: %d \n", item.getKey(), item.getValue().getToy_name(), item.getValue().getQuantity(), item.getValue().getFrequency());
        }
    }

    public ToysStorage() {
        this.storage = storage;
    }

//    public ToysStorage(Map<String, Toy> storage) {
//        this.storage = storage;
//    }


    private Map<String, Toy> storage = new HashMap<String, Toy>();



}
