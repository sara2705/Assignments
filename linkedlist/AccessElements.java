package linkedlist;

import java.util.LinkedList;

public class AccessElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println("Before Removel :"+ list);
		System.out.println("First Element : "+list.removeFirst());
		System.out.println("Last Element : "+list.removeLast());
		System.out.println("After Removel :"+ list);
		
	}

}
