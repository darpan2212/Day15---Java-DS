package com.bl.datastructure;

import com.bl.datastructure.node.INode;
import com.bl.datastructure.node.MyMapNode;

public class MyHashMap<K, V> {

	MyLinkedList<K> myLinkedList;

	public MyHashMap() {
		myLinkedList = new MyLinkedList<>();
	}

	public void add(K key, V value) {
		INode<K> itemNode = myLinkedList.search(key);
		if(itemNode == null) {
			itemNode = new MyMapNode<K, V>(key, value);
			myLinkedList.append(itemNode);	
		} else {
			((MyMapNode<K, V>)itemNode).setValue(value);
		}
		
	}

	public void print() {
		myLinkedList.print();
	}

	public V get(K key) {
		MyMapNode<K,V> itemNode = (MyMapNode<K, V>) myLinkedList.search(key);
		return itemNode != null ? itemNode.getValue() : null;
	}
}