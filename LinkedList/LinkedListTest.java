package main;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class LinkedListTest {

	LinkedList list = new LinkedList();

	@Test
	public void pushFrontTest() {
		list.pushFront(20);
		list.pushFront(15);
		list.pushFront(10);
		list.pushFront(5);

		Assert.assertEquals(5,list.head.key);
	}

	@Test
	public void pushBackTest() {
		list.pushBack(30);
		list.pushBack(35);
		list.pushBack(40);
		list.pushBack(45);

		LinkedList.Node temp = LinkedList.head;
		while(temp.next != null){
			temp=temp.next;
		}
		
		Assert.assertEquals(45,temp.key);
	}

	@Test
	public void popBackTest() {
		list.popBack();
		list.popBack();
		list.popBack();
		list.pushBack(50);

		LinkedList.Node temp = LinkedList.head;
		while(temp.next != null){
			temp=temp.next;
		}
		
		Assert.assertEquals(50,temp.key);
	}

	@Test
	public void popFrontTest() {
		list.popFront();
		list.popFront();
		list.popFront();
		list.pushFront(450);

		Assert.assertEquals(450,list.head.key);		
	}

}
