package com.vibhoreGoel.problem1;

import java.util.Collections;

import java.util.LinkedList;

public class OrderOfConstruction {
//Creating new temporary linked list to copy all elements from original linked list
	LinkedList<Integer> tempList = new LinkedList<>();

	public void orderConstruction(LinkedList<Integer> ls_original) {
		for (int i = 0; i < ls_original.size(); i++) {
			tempList.add(ls_original.get(i));// adding elements to templist
		}
		// Arranging all elements of templist in decreasing order.
		Collections.sort(tempList, Collections.reverseOrder());
		int j = 0;
		// Comparing floor size of each day with templist.
		for (int i = 0; i < ls_original.size(); i++) {
			if (ls_original.get(i) != tempList.get(j))
				System.out.println("Day: " + (i + 1));
			else if (ls_original.get(i) == tempList.get(j)) {
				System.out.print("Day: " + (i + 1) + " ---> " + tempList.get(j) + ", ");
				j++;
				try {
					for (int k = 0; k < i; k++) {
						if (ls_original.get(k) == tempList.get(j)) {
							System.out.print(tempList.get(j) + ", ");
							j++;
							k = -1;
						}
					}
				} catch (IndexOutOfBoundsException e) {
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
