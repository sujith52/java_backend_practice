package com.sujith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testException {

	@Test
	void test() {
//		try {
//		arrayExceptionmain ae = new arrayExceptionmain();
//		int unsorted[] = null;
//		int sortedarrays[] = ae.sortingArray(unsorted);
////		for(int i=0;i<=6;i++) {
////			System.out.print(i);
////		}
//		}
//		catch(NullPointerException e) {
//			System.out.println("Exception generated");
//		}
		
		arrayExceptionmain ae = new arrayExceptionmain();
//		int unsorted[] = {2,8,6,3,1};
		int unsorted[] = null;
		assertThrows(NullPointerException.class, ()-> ae.sortingArray(unsorted));
	}

}
