package com.bl.datastructure;

import com.bl.datastructure.node.MyBinaryNode;

public class MyBinaryTree<K extends Comparable<K>> {

	MyBinaryNode<K> root;

	public void add(K key) {
		root = addRecusrsively(root, key);
	}

	private MyBinaryNode<K> addRecusrsively(MyBinaryNode<K> current, K key) {
		if (current == null) {
			return new MyBinaryNode<K>(key);
		}
		int compareResult = current.key.compareTo(key);
		if (compareResult == 0)
			return current;

		if (compareResult < 0) {
			current.right = addRecusrsively(current.right, key);
		} else {
			current.left = addRecusrsively(current.left, key);
		}
		return current;
	}

	public int size() {
		return getSizeRecursively(root);
	}

	private int getSizeRecursively(MyBinaryNode<K> current) {
		return current == null ? 0
				: 1 + getSizeRecursively(current.left)
						+ getSizeRecursively(current.right);
	}

	public void print() {
		System.out.println(root);
	}

	public boolean search(K key) {
		return searchRecursively(root, key);
	}

	private boolean searchRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return false;
		int compareResult = current.key.compareTo(key);
		if (compareResult == 0) {
			return true;
		}
		if (compareResult < 0) {
			return searchRecursively(current.right, key);
		} else {
			return searchRecursively(current.left, key);
		}
	}
}