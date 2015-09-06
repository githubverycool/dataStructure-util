package DataStructure;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	
	private Queue queue;

	@Before
	public void setUp() throws Exception {
		queue=new Queue(10);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.remove();
		queue.remove();
		queue.add(5);
	}



	@Test
	public void testElement() {
		while(!queue.isEmpty()){
			System.out.println(queue.remove());
		}
	}

//	@Test
//	public void testIsFull() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testIsEmpty() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSize() {
//		fail("Not yet implemented");
//	}

}
