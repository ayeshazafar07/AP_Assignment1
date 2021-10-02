package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CircularLinkedListTest {

	CircularLinkedList list = new CircularLinkedList();
	
	@Test
	public void PushFrontTest() {
		list.pushFront(5);
		list.pushFront(10);
		list.pushFront(15);
		list.pushFront(20);
		list.pushFront(25);
		list.pushFront(30);
		
		assertTrue(CircularLinkedList.head.key == 30);
	}
	
	@Test
	public void PushBackTest() {
		
		list.pushBack(35);
		list.pushBack(40);
		list.pushBack(45);
		list.pushBack(50);
		list.pushBack(55);
		list.pushBack(60);
		
		CircularLinkedList.Node temp = CircularLinkedList.head;
		while(temp.next != CircularLinkedList.head){
			temp=temp.next;
		}
		
		Assert.assertEquals(60,temp.key);
	}

	@Test
	public void PopBackTest() {
		
		list.popBack();
		list.popBack();
		list.popBack();
		list.pushBack(345);
		
		CircularLinkedList.Node temp = CircularLinkedList.head;
		while(temp.next!=CircularLinkedList.head){
			temp=temp.next;
		}
		
		Assert.assertEquals(345,temp.key);		
	}
	
	@Test
	public void PopFrontTest() {
		list.popFront();
		list.popFront();
		list.popFront();
		list.pushFront(777);
		
		assertTrue(CircularLinkedList.head.key == 777);
	}

}
