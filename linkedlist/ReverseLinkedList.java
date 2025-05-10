package linkedlist;

import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> list = new LinkedList<>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');
		
		System.out.println("Before reverse : " + list);

		LinkedList<Character> revlist = toReverse(list);	
		
		System.out.println("After reverse : " + revlist);
	}

	private static LinkedList<Character> toReverse(LinkedList<Character> list) {
		// TODO Auto-generated method stub
		LinkedList<Character> revlist = new LinkedList<>();
		int len = list.size();
		
		for(int i = 0; i < len; i++)
			revlist.add(list.removeLast());
		
		return revlist;
	}

}
