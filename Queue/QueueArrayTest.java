package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class QueueArrayTest {
	QueueArray queue = new QueueArray(10);

	@Test
	public void enqueueTest() {
		queue.enqueue(5);
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
		queue.enqueue(25);

		assertTrue(queue.array[queue.addPointer-1]==25);
	}
	
	@Test 
	public void PositiveDequeueTest() throws Exception  {
		queue.enqueue(65);
		queue.enqueue(70);
		queue.enqueue(75);

		Assert.assertEquals(65,queue.dequeue());
	}

	@Test 
	public void NegativeDequeueTest() throws Exception  {
		queue.enqueue(85);
		queue.enqueue(90);
		queue.enqueue(95);

		Assert.assertEquals(90,queue.dequeue());
	}

}
