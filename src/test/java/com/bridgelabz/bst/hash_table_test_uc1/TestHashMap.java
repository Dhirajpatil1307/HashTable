package com.bridgelabz.bst.hash_table_test_uc1;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.bst.hash_table_uc1.HashMap;

public class TestHashMap {
	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnWorldFrequency() {
		String sentence = "To be or not to be";
		HashMap<String, Integer> hashTable = new HashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = hashTable.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			hashTable.add(word, value);
		}
		int frequency = hashTable.get("or");
		hashTable.linkedList.printNode();
		System.out.println(frequency);
		Assert.assertEquals(1, frequency);
	}
}