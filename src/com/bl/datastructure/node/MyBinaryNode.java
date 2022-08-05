package com.bl.datastructure.node;

public class MyBinaryNode<K extends Comparable<K>> {

	public K key;
	public MyBinaryNode<K> left;
	public MyBinaryNode<K> right;

	public MyBinaryNode(K key) {
		this.key = key;
		left = null;
		right = null;
	}

	@Override
	public String toString() {
		StringBuffer strBuffer = new StringBuffer();
		if (left != null) {
			strBuffer.append(left);
		}
		strBuffer.append("<=" + key + "=>");
		if (right != null) {
			strBuffer.append(right);
		}
		return strBuffer.toString();
	}

}