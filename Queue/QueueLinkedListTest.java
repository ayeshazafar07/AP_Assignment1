package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class QueueLinkedListTest {
	QueueLinkedList queue = new QueueLinkedList();
	
	@Test
	public void enqueueTest() {
		queue.enqueue(5);
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
		queue.enqueue(25);

		assertTrue(queue.head.key==5);
	}
	
	@Test
	public void PositivedequeueTest() throws Exception{		
		queue.enqueue(65);
		queue.enqueue(70);
		queue.enqueue(75);

		Assert.assertEquals(65,queue.dequeue());
	}

	@Test
	public void NegativedequeueTest() throws Exception{		
		queue.enqueue(80);
		queue.enqueue(85);
		queue.enqueue(90);

		Assert.assertEquals(85,queue.dequeue());
	}

}
