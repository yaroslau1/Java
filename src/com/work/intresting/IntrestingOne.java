package com.work.intresting;

public class IntrestingOne {

	public static void main(String[] args) {
		System.out.println(args.length);
		int sNew = 1;
		int sOld = 1;
		int sF;
		while(sNew < 1000) {
			sF = sNew + sOld;			
			System.out.println(sF);
			sOld = sNew;
			sNew = sF;
		}

	}

}
