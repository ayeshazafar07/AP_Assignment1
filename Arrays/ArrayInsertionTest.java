package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayInsertionTest {

	ArrayInsertion arr_obj;
	int [] array = new int[10];	
	
	@Before
	public void Insert() {
		arr_obj.insert(array,13, 0);
		arr_obj.insert(array, -1, 1);
		arr_obj.insert(array, 42, 2);
		arr_obj.insert(array, 90, 3);
		arr_obj.insert(array, 75, 4);
	}
	
	@Test
	public void InsertTest() {
		
		int[] expected = {13,-1,42,90,75};

		for(int i=0;i<expected.length;i++)
			assertEquals(expected[i],array[i]);
	}

/*	@Test
	public void InsertTestPositive() {

		arr_obj.insert(array,100,0);
		arr_obj.insert(array,24,2);
		arr_obj.insert(array,-8,9);
		arr_obj.insert(array,-13,1);
		arr_obj.insert(array,49,4);
		arr_obj.insert(array,-35,6);
		arr_obj.insert(array,86,3);
		arr_obj.insert(array,77,7);
	
		int[] expected = {100,-13,0,86,24,49,0,77,-35,-8};
		assertArrayEquals(expected,array);
	}*/

}
