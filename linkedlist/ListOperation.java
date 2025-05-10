package linkedlist;

import java.util.LinkedList;

public class ListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println("Before List Operation :"+list);
		list.remove(2);
		list.removeLast();
		System.out.println("After List Operation :"+list);
		
		
	}

}
