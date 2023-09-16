package kids_store;

import java.util.HashMap;
import java.util.LinkedList;

public class ToysStore {

    public HashMap<String, Toy> getStorage() {
        return storage;
    }

    public void setStorage(HashMap<String, Toy> storage) {
        this.storage = storage;
    }

    public ToysStore(HashMap<String, Toy> storage) {
        this.storage = storage;
    }

    private HashMap<String, Toy> storage;

}
