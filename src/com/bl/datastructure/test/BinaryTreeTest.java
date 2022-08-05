package com.bl.datastructure.test;

import com.bl.datastructure.MyBinaryTree;

public class BinaryTreeTest {

	public static void main(String[] args) {

		MyBinaryTree<Integer> bst = new MyBinaryTree<>();

		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(22);
		bst.add(40);
		bst.add(60);
		bst.add(95);
		bst.add(11);
		bst.add(65);
		bst.add(3);
		bst.add(16);
		bst.add(63);
		bst.add(67);

		System.out.println(bst.size());

		bst.print();
		
		if(bst.search(63)) {
			System.out.println("63 is present in tree");
		} else {
			System.out.println("63 is absent in tree");
		}
	}

}