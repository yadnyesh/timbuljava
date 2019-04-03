package io.datastruct;

class Node {
	int key;
	
	Node left, right;
	
	public Node (int item) {
		key = item;
		left = right = null;
	}
}

public class BinaryTree {
	
	Node root;
	
	BinaryTree (int key) {
		root = new Node(key);
	}
	
	BinaryTree() {
		root = null;
	}
	
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		
		binaryTree.root = new Node(1);
		
		binaryTree.root.left = new Node(2);
		
		binaryTree.root.right = new Node(3);
		
	}
}
