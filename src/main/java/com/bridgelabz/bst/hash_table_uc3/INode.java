package com.bridgelabz.bst.hash_table_uc3;

public interface INode<K> {
	K getKey();

	void setKey(K key);

	INode<K> getNextNode();

	void setNextNode(INode<K> next);
}