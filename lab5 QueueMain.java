
public class QueueMain { 

	public static void main(String arg[])
	{
	MyQueue q = new MyQueue();
	q.enQueue(12);q.enQueue(1);q.enQueue(4);
	MyQueue q1 = new MyQueue();
	q1.enQueue(9);q1.enQueue(9);q1.enQueue(8);
    
	MyQueue<MyQueue> q2 = new MyQueue<MyQueue>();
	
	q2.enQueue(q1);q2.enQueue(q);
	MyQueue temp = q2.deQueue();
	temp.deQueue();
	q2.enQueue(temp);
	System.out.println(q2);
	
	}
	
	
}
