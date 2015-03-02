package mycalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTester {

	@Test
	public void nFactorialTest() {
		
		int x = MyCalculator.nfactorial(5);
		assertEquals(120,x);
	
	}
	@Test
	public void binarySearchTest() {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int num = 4;
		
		int bs = MyCalculator.binarySearch(arr,num);
		
		assertTrue(bs==4);
		
	}

}
