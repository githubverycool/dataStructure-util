package DataStructure;

/**
 * 1.实现简单队列 2.实现队列遍历 3.实现阻塞队列 4.实现泛型、任意类型对象的添加 5.实现线程安全
 * 
 * @author Administrator
 *
 */
public class Queue {

	private int maxSize;
	private Long[] queueArray;
	private int head;
	private int rear;
	private int nItems;

	public Queue(int s) {
		this.maxSize = s;
		this.queueArray = new Long[maxSize];
		this.head = 0;
		this.rear = -1;
		this.nItems = 0;
	}

	public void add(long value) {
		if (isFull()) {
			throw new RuntimeException("队列已满！");
		} else {
			if (rear < maxSize - 1) {
				rear++;
			} else {
				rear = 0;
			}
			nItems++;
			queueArray[rear] = value;
		}
	}

	public long remove() {
		if (isEmpty()) {
			throw new RuntimeException("队列为空！");
		} else {
			long temp = queueArray[head++];
			if (head == maxSize) {
				head = 0;
			}
			nItems--;
			return temp;
		}
	}

	public long element() {
		return queueArray[head];
	}

	public boolean isFull() {
		return nItems == maxSize ? true : false;
	}

	public boolean isEmpty() {
		return nItems == 0 ? true : false;
	}

	public int size() {
		return nItems;
	}

}
