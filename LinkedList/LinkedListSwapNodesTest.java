package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class LinkedListSwapNodesTest {
	
	LinkedListSwapNodes list = new LinkedListSwapNodes();
	
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

		LinkedListSwapNodes.Node temp = LinkedListSwapNodes.head;
		while(temp.next != null){
			temp=temp.next;
		}
		
		Assert.assertEquals(45,temp.key);
	}
	
	@Test
	public void PositiveswapTest() {
		list.pushFront(723);
		list.pushBack(691);

		list.swap();
		
		assertTrue(LinkedListSwapNodes.head.key == 691);
	}

	@Test
	public void NegativeswapTest() {
		list.pushFront(893);
		list.pushBack(231);

		list.swap();
		assertTrue(LinkedListSwapNodes.head.key == 893);
	}


}
