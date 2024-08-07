import java.util.*;

public class TreeHeight {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int Count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftcount = Count(root.left);
        int rightcount = Count(root.right);
        return leftcount + rightcount + 1;
    }

    public static int Sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsum = Sum(root.left);
        int rightsum = Sum(root.right);
        return leftsum + rightsum + root.data;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftdiam = diameter(root.left);
        int leftht = height(root.left);
        int rightdiam = diameter(root.right);
        int rightht = height(root.right);
        int selfdiam = leftht + rightht + 1;
        return Math.max(selfdiam, Math.max(rightdiam, leftdiam));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(10);
        System.out.println("Heigth of tree is =" + height(root));
        System.out.println("Number of nodes in tree=" + Count(root));
        System.out.println("Sum of all nodes in given tree is =" + Sum(root));
        System.out.println("diameter if tree is = " + diameter(root));
    }
}
