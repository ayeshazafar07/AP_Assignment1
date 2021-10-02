package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayTest {

		Array arr;
		
		@Test
		public void InsertTest() {
			arr = new Array();
			arr.insert(8,0);
			arr.insert(3,1);
			arr.insert(0,2);
			arr.insert(22,3);
			arr.insert(16,4);
			
			arr.display();
		}

		@Test
		public void NegativeGetValueTest() {
			System.out.println("insert a some value for this function...");
			arr.getValues();
		}

		@Test
		public void DeleteIndexTest() {
			arr.delete(3);
			arr.display();
		}
		
		@Test
		public void PositiveLinearSerchTest() {
			int[] a1 = {5,7,2,9,3};
			assertTrue(arr.linearSearch(a1,3));
		}

		@Test
		public void NegativeLinearSerchTest() {
			int[] a1 = {5,7,2,9,3};
			assertTrue(arr.linearSearch(a1,34));
		}

		@Test
		public void PositiveBubbleSortTest() {
			int[] a1 = {3,7,4,34,19};
			int[] b1;
			b1 = arr.bubbleSort(a1);
			int[] exp = {3,4,7,19,34};
			assertArrayEquals(exp, b1);
			//arr.display();
		}

		@Test
		public void NegativeBubbleSortTest() {
			int[] a1 = {3,7,4,34,19};
			int[] b1;
			b1 = arr.bubbleSort(a1);
			int[] exp = {3,5,7,19,34};
			assertArrayEquals(exp, b1);
			//arr.display();
		}

		@Test
		public void PositiveBinarySearchTest() {
			int[] a1 = {3,7,4,34,19};

			assertTrue(arr.binarySearch(a1,4,0,a1.length));
		}

		@Test
		public void NegativeBinarySearchTest() {
			int[] a1 = {3,7,5,34,19};

			assertTrue(arr.binarySearch(a1,4,0,a1.length));
		}


}
