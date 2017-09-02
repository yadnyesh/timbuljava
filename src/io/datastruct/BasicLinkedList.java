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
