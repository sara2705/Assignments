package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<=5;i++)
		{
			al.add(i*10);
		}
		System.out.println("Before : "+al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			if((int)itr.next() > 30) 
			{
				itr.remove();
			}
		}
		System.out.println("After : "+al);
	}

}
