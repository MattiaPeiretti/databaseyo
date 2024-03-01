package database.data.binaryTree;

public class Node {
    NodeValueInterface value;

    Node left;
    Node right;

    Node(NodeValueInterface value) {
        this.value = value;
        right = null;
        left = null;
    }
}
