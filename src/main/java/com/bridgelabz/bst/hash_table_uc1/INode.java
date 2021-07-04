package com.bridgelabz.bst.hash_table_uc1;

public interface INode<K> {
	K getKey();

	void setKey(K key);

	INode<K> getNextNode();

	void setNextNode(INode<K> next);
}