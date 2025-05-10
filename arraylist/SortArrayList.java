package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			Random r= new Random();
			al.add(r.nextInt(100));
			
		}

		System.out.println("Before Sorting "+al);
//		usingSortMethod(al);
//		usingManualSort(al);
		usingComparator(al);
		
	}

	private static void usingComparator(ArrayList<Integer> al) {
		// TODO Auto-generated method stub
		al.sort(Comparator.naturalOrder());
		System.out.println("After Sorting :"+al);
		
	}

	private static void usingManualSort(ArrayList<Integer> al) {
		// TODO Auto-generated method stub
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)>al.get(j)) {
					int temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j,temp);
				}
			}
		}
		System.out.println("After Sorting :"+al);
		
	}

	private static void usingSortMethod(ArrayList<Integer> al) {
		// TODO Auto-generated method stub
		Collections.sort(al);
		System.out.println("After Sorting :"+al);
	}

}
