package database.data.binaryTree;

import javax.swing.tree.TreeNode;

public class BinaryTree {
    Node root;

    BinaryTree(Node root) {
        this.root = root;
    }

    public void Add(NodeValueInterface value) {
        this.root = this.addRecursive(root, value);
    }

    private Node addRecursive(Node current, NodeValueInterface value) {
        if (current == null) {
            return new Node(value);
        }

        if (current.value.isLess(value)) {
            current.left = addRecursive(current.left, value);
        } else if (current.value.isMore(value)) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public static void printBinaryTree(Node root, int level) {
        if (root == null)
            return;
        printBinaryTree(root.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t");
            System.out.println("|-------" + root.value);
        } else
            System.out.println(root.value);
        printBinaryTree(root.left, level + 1);
    }

}
