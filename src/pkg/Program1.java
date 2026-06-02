package pkg;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
public class Program1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("PineApple");
		list.add("Orange");
		System.out.println("Original Lists are " + list);
		System.out.println("The size of the Lists are " + list.size());
		System.out.println("The elements at index 2 is "+ list.get(2));
		list.set(1, "Pokemon");
		System.out.println("The List after set is " + list);
		list.remove(1);
		System.out.println("The list after removing index 1 is " + list);
		System.out.println("The List contains Orange ? " + list.contains("Orange"));
		//sort
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("In Decreasing order " + list);
		//Iterate
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//Array
		//Clear
	}

}
