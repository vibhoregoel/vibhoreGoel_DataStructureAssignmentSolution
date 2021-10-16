package com.vibhoreGoel.problem2;

import com.vibhoreGoel.problem2.Operations.Node;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operations opn = new Operations();
		//Allocating memory to nodes
		Node root = new Node(50);
		Node node1 = new Node(30);
		Node node2 = new Node(60);
		Node node3 = new Node(10);
		Node node4 = new Node(40);
		
		//Linking nodes
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		
		opn.flattenBTToSkewed(root);
		opn.traverseRightSkewed(opn.nextNode);
	}
}
