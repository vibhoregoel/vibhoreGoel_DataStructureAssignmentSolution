package com.vibhoreGoel.problem1;

import java.util.LinkedList;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		OrderOfConstruction oc = new OrderOfConstruction();

		// Creation on original linked list to store floor size from user.
		LinkedList<Integer> ls_original = new LinkedList<>();

		System.out.println("Enter the total number of floors in building");
		int num = sc.nextInt();
		// Adding floor size to original linked list.
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the floor size given on day " + (i + 1));
			ls_original.add(sc.nextInt());
		}
		oc.orderConstruction(ls_original);
		sc.close();
	}
}
