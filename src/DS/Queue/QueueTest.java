package DS.Queue;

public class QueueTest {

	public static void main(String[] args) {
		//QueueArray queue =new QueueArray(3);
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println(queue.size());
		System.out.println(queue.dequeue());
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue.dequeue());
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue.dequeue());
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());

	}

}
