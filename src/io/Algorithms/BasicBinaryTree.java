package io.Algorithms;

/**
 * Created by z063407 on 11/27/17.
 */
public class BasicBinaryTree<X extends Comparable<X>>{

    private Node root;
    private int size;

    public BasicBinaryTree() {
        this.root = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public BasicBinaryTree(Node root) {
        this.root = root;
    }

    public void add(X item){
        Node node = new Node(item);

        if(root == null){
            this.root = node;
            System.out.println("Set Root: " + node.getItem());
            this.size++;
        } else {
            insert(this.root, node);
        }

    }

    public void contains(X item) {

    }

    public void getNode(X item) {
        Node currentNode = this.root;
    }

    private void insert(Node parent, Node child) {
        if(child.getItem().compareTo(parent.getItem()) < 0){
            if(parent.getLeft() == null) {
                parent.setLeft(child);
                child.setParent(parent);
                this.size++;
            } else {
                insert(parent.getLeft(), child);
            }
        }
        else if(child.getItem().compareTo(parent.getItem()) > 0) {
            if(parent.getRight() == null) {
                parent.setRight(child);
                child.setParent(parent);
                this.size++;
            } else {
                insert(parent.getRight(), child);
            }
        }
    }

    private class Node {
        private Node left;
        private Node right;
        private Node parent;
        private X item;

        public Node(X item) {
            this.item = item;
            this.left = null;
            this.right = null;
            this.parent = null;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public X getItem() {
            return item;
        }

        public void setItem(X item) {
            this.item = item;
        }
    }

}
