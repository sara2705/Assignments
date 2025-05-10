package linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBehaviour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> li=new LinkedList<>();
		li.add("Alice");
		li.add("Bob");
		li.add("Charlie");
		li.add("Diana");
		System.out.println("Before : " + li);
		li.poll();
		li.poll();
		System.out.println("After : "+li);
		
	}

}
