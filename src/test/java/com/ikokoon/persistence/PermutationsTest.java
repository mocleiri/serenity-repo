package com.ikokoon.persistence;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PermutationsTest {

	@Test
	public void permutations() {
		Permutations permutations = new Permutations();

		String[] strings = new String[] { "one", "two", "three" };
		List<Object[]> permutationsList = new ArrayList<Object[]>();
		permutations.getPermutations(strings, permutationsList, strings.length);
		// TODO implement the test here
		for (Object[] stringArray : permutationsList) {
			for (Object string : stringArray) {
				System.out.print(string + ":");
			}
			System.out.println();
		}
	}

}
