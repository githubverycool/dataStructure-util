package DataStructure;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	
	private Queue<String> queue;

	@Before
	public void setUp() throws Exception {
		queue=new Queue<String>(10);
		queue.add("123");
		queue.add("...");
		queue.add("456");
		queue.add("...");
		queue.remove();
		queue.remove();
		queue.add("789");
	}



	@Test
	public void testElement() {
		while(!queue.isEmpty()){
			System.out.println(queue.remove());
			System.out.println(queue.element());
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
