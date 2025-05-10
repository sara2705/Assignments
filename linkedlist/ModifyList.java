package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class ModifyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println("Before modifying : " + list);
		ListIterator<String> itr=list.listIterator();
		while(itr.hasNext())
		{
			String temp=itr.next();
			if(temp.equals("three"))
			{
				itr.set("THREE");
			}
		}
		System.out.println("After modifying : "+ list);
		
	}

}
