package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StackLinkedListTest {

	StackLinkedList stk = new StackLinkedList();

	@Test
	public void PositivepushTest() {
		stk.push(20);
		stk.push(15);
		stk.push(10);
		stk.push(5);

		Assert.assertEquals(5,stk.head.key);
	}

	@Test
	public void PositivepopTest() {
		stk.pop();
		stk.pop();
		stk.pop();
		stk.push(234);

		//stk.pop();
		Assert.assertEquals(234,stk.pop());		
	}

	@Test
	public void NegativepushTest() {
		stk.push(20);
		stk.push(15);
		stk.push(10);
		stk.push(5);
		stk.push(0); 
		
		Assert.assertEquals(5,stk.head.key);
	}

	@Test
	public void NegativepopTest() {
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		
		Assert.assertEquals(234,stk.pop());		
	}

}
