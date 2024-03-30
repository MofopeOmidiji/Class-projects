/*
 * Name: Mofopefoluwa Omidiji
 * Overview: This program creates a queue data structure using a linked list 
 * Input: N/A
 * Output: Adds an element to the rear of the queue & removes an element from the front of the queue
 * Variables: front, rear, key, temp, next
 */

public class MOLLQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MOQueue q = new MOQueue();
		  
        q.enqueue(15);
        q.enqueue(25);
        q.dequeue();
        q.dequeue();
        q.enqueue(35);
        q.enqueue(45);
        q.enqueue(55);

        // Display Queue Front and Rear
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);

	}

}
