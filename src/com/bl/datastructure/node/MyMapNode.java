package com.bl.datastructure.node;

public class MyMapNode<K, V> implements INode<K> {

	K key;
	V value;
	INode<K> next;

	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		if (next != null)
			return "MyMapNode{key:" + key + ",value:" + value + "}=>" + next;
		else
			return "MyMapNode{key:" + key + ",value:" + value + "}";
	}
}