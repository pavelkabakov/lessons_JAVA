package algorithm.sem_4.task_7;


public class Tree7<V extends Comparable<V>> {

    private Node root;

    private class Node {
        private V value;
        private Node left;
        private Node right;

    }

    public boolean contains(V value){
        Node node = root;
        while (node != null){
            if (node.value.equals(value)){
                return true;
            }
            if (node.value.compareTo(value) > 0){
                node = node.left;
            }else {
                node = node.right;
            }
        }
        return false;
    }
}
