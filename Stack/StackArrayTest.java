package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackArrayTest {
	StackArray stk = new StackArray();

	@Test
	public void PushTest() {
		stk.display();
		stk.push(5);
		stk.push(10);
		stk.push(15);
		stk.push(20);
		stk.push(25);
		
		int top = stk.pop();
		assertTrue(top == 25);
	}
	
	@Test
	public void PositivePopTest() {
		stk.pop();
		stk.pop();
		stk.pop();

		stk.push(231);
		stk.push(908);
		stk.push(345);
		stk.push(765);
		
		int top = stk.pop();
//		System.out.print(top);
		assertTrue(stk.pop()==345);
	}

	@Test
	public void EmptyStackTest() {
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		
		assertTrue(stk.pop()==765);
	}

}
