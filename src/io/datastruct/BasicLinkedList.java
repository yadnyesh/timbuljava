package io.datastruct;

/**
 * Created by z063407 on 7/31/17.
 */
public class BasicLinkedList<X> {

    private Node first;
    private Node last;
    private int nodeCount;

    public BasicLinkedList() {
        first = null;
        last = null;
        nodeCount = 0;
    }

    private class Node {
        private Node nextNode;
        private X nodeItem;

        public Node(X item){
            this.nextNode = null;
            this.nodeItem = item;
        }

        public int size() {
            return nodeCount;
        }

        public void add(X item){
            if(first == null){
                first = new Node(item);
                last = first;
            } else {
                Node newLastNode = new Node(item);
                last.setNextNode(newLastNode);
                last = newLastNode;
            }
            nodeCount++;
        }

        public void insert (X item, int position) {
            if (size() < position) {
                throw new IllegalStateException ("Position does not exist on the Linked list");
            }

            Node currentNode = first;

            for (int i = 1; i < position && currentNode != null; i++) {
                currentNode = currentNode.getNextNode();
            }

            Node newNode = new Node(item);
            Node nextNode = currentNode.getNextNode();
            currentNode.setNextNode(newNode);
            newNode.setNextNode(nextNode);
            nodeCount++;
        }

        public X removeAt(int position){
            if (first == null) {
                throw new IllegalStateException("Node does not exist");
            }

            Node currentNode = first;
            Node previosNode = last;

            for (int i = 1; i < position && currentNode != null; i++) {
                previosNode = currentNode;
                currentNode = currentNode.getNextNode();
            }

            X nodeItem = currentNode.getNodeItem();
            previosNode.setNextNode(currentNode.getNextNode());
            nodeCount--;
            return nodeItem;
        }


        public X remove(){
            if (first == null) {
                throw new IllegalStateException("List empty");
            }

            X nodeItem = first.getNodeItem();
            first = first.getNextNode();
            nodeCount--;
            return nodeItem;
        }

        public X get(int position) {
            return null;
        }

        public Node(Node nextNode, X item) {
            this.nextNode = null;
            this.nodeItem = item;
        }
        public void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public X getNodeItem() {
            return nodeItem;
        }
    }
}
