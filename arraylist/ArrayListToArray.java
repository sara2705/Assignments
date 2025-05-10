package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	ArrayList<String> al = new ArrayList<>();
	        al.add("apple");
	        al.add("banana");
	        al.add("orange");
	        al.add("pineapple");
	        al.add("graphes");

	        String[] arr = al.toArray(new String[0]);

	        System.out.println("Array: " + Arrays.toString(arr));

	        ArrayList<String> newList = new ArrayList<>(Arrays.asList(arr));

	        System.out.println("ArrayList: " + newList);
	}

}
