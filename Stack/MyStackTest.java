package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyStackTest {

	MyStack stk = new MyStack(10);
	
	@Test
	public void PositivepushTest() throws Exception {
		stk.push(20);
		stk.push(15);
		stk.push(10);
		stk.push(50);
		stk.push(145);
		stk.push(130);
		stk.push(175);
		stk.push(180);
		stk.push(125);
		stk.push(100);

        assertEquals(stk.top(), 100);       
        try {
			stk.push(60);
		} 
        catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	@Test
	public void PositivepopTest() throws Exception{
		stk.push(908);
		stk.push(666);
		//stk.pop();
		assertEquals(666,stk.pop());		
        try {
       	 for (int i=0;i<5;++i) {
            	stk.pop();
            }
		} 
        catch (Exception e) {
				System.out.print(e.getMessage());
		}

	}

	@Test
	public void NegativepopTest() throws Exception{
		stk.push(678);
		//stk.pop();
//		stk.pop();
		Assert.assertEquals(666,stk.pop());		
	}
	
    @Test
    public void testTop() throws Exception {
        
        stk.push(77);
        stk.push(56);
        stk.push(11);
        stk.push(36);
        stk.push(12);
        
        assertEquals(12, stk.top());
        
        for (int i=0; i<5; ++i) {
        	stk.pop();
        }
        try {
        	stk.top();
        } 
        catch (Exception e) {
        	System.out.print(e.getMessage());
        }
    }

    @Test
	public void PositiveTopTest() throws Exception {
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		
		assertTrue(stk.top() == 40);
	}

	
}
