package io.datastruct;

/**
 * Created by z063407 on 7/31/17.
 */
public class BasicLinkedList<X> {

    private Node first;
    private Node last;

    public BasicLinkedList() {
        first = null;
        last = null;
    }

    private class Node {
        private Node nextNode;
        private X nodeItem;

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
