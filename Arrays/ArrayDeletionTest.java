package main;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayDeletionTest {

	ArrayDeletion arr_obj;
	
	@Test
	public void DeleteFromStartTest() {
		int[] array = {9,5,2,8,0,1,3,4,6,7};	
		int[] result = arr_obj.delete(array, 0);		
		int[] expected = {5,2,8,0,1,3,4,6,7,-1};
	
		assertArrayEquals(expected,result);
	}

	@Test
	public void DeleteFromEndTest() {
		int[] array = {9,5,2,8,0,1,3,4,6,7};	
		int[] result = arr_obj.delete(array, 9);		
		int[] expected = {9,5,2,8,0,1,3,4,6,-1};
	
		assertArrayEquals(expected,result);
	}

	@Test
	public void DeleteFromMidTest() {
		int[] array = {9,5,2,8,0,1,3,4,6,7};	
		int[] result = arr_obj.delete(array, 4);		
		int[] expected = {9,5,2,8,1,3,4,6,7,-1};
	
		assertArrayEquals(expected,result);
	}

	@Test
	public void ForNegativeValuesTest() {
		int[] array = {9,-5,2,-8,0,1,-3,-4,-6,-7};	
		int[] result = arr_obj.delete(array, 1);		
		int[] expected = {9,2,-8,0,1,-3,-4,-6,-7,-1};
	
		assertArrayEquals(expected,result);
	}

	@Test
	public void NegativeTest1() {
		int[] array = {9,-5,2,-8,0,1,-3,-4,-6,-7};	
		int[] result = arr_obj.delete(array, -1);		
		int[] expected = {9,-5,2,-8,0,1,-3,-4,-6,-7,-1};
	
		assertArrayEquals(expected,result);
	}

	@Test
	public void NegativeTest2() {
		int[] array = {9,-5,2,-8,0,1,-3,-4,-6,-7};	
		int[] result = arr_obj.delete(array, 10);		
		int[] expected = {9,-5,2,-8,0,1,-3,-4,-6,-7,-1};
	
		assertArrayEquals(expected,result);
	}

}
