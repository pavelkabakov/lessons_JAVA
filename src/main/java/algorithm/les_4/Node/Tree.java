package algorithm.les_4.Node;

import java.util.List;

public class Tree {

    // обход в глубину

    private Node root;

    private class Node {
        private int value;
        private List<Node> children;
    }

    public boolean contains(int value) {
        return contains(value, root);
    }

    private boolean contains(int value, Node node) {
        if (node.value == value) {
            return true;
        } else {
            for (Node child : node.children) {
                boolean result = contains(value, child);
                if (result) {
                    return true;
                }
            }
        }
        return true;

    }



}




