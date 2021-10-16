package com.vibhoreGoel.problem2;

public class Operations {
	
	static class Node {
		int val;
		Node left, right;

		Node(int item) {
			val = item;
			left = right = null;
		}
	}
	
	public static Node preNode = null;
	public static Node nextNode = null;

	public void flattenBTToSkewed(Node root) {

		// Base Case
		if (root == null)
			return;

		flattenBTToSkewed(root.left);

		Node rightNode = root.right;

        // Condition to check if the root Node of the skewed tree is defined or not
		if (nextNode == null) {
			nextNode = root;
			root.left = null;
			preNode = root;
		} else {
			preNode.right = root;
			root.left = null;
			preNode = root;
		}
		flattenBTToSkewed(rightNode);  //Recursive call for right sub tree
	}

	public void traverseRightSkewed(Node root) {
		if (root == null)
			return;

		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}
}
