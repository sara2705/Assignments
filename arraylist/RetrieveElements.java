package arraylist;

import java.util.ArrayList;

public class RetrieveElements {
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("apple");
		al.add("banana");
		al.add("orange");
		al.add("pineapple");
		al.add("graphes");
		System.out.println(al);
		System.out.println("1 st element : "+al.get(0));
		System.out.println("2 nd element : "+al.get(1));
		System.out.println("3 rd element : "+al.get(2));
		
	}
}
