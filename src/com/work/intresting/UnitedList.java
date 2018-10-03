package com.work.intresting;

import java.util.ArrayList;

public class UnitedList {
	private static ArrayList<Integer> a = new ArrayList<>();
	private static ArrayList<Integer> b = new ArrayList<>();
	
	public static void fillList() {
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		b.add(2);
		b.add(2);
		b.add(2);
		b.add(2);
	}
	

	public static void main(String[] args) {
		go();

	}


	private static void go() {
		fillList();
		int j = 1;
		for(int i = 0; i < b.size(); i++) {
			a.add(j, b.get(i));
			j+=2;
		}
		
		System.out.println(a);
	}

}
