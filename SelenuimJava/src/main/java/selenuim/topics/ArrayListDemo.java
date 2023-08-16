package selenuim.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		String[] arr = {"Dog","Cat","Elephant"};
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		
		//System.out.println(al);
		
		for (int i = 0; i < al.size(); i++) {

			System.out.println(al.get(i));
		}
		System.out.println("------------------------------------------------------");
		
		
		List<String> li = new ArrayList<String>(Arrays.asList(arr));
		
		//For Each loop
		for (String string : li) {
			
			System.out.println(string);
		}
		
		System.out.println("------------------------------------------------------");
		
		li.add("Dinosores");
		
		li.add("Whale");
		
		//Iterator 
		Iterator it = li.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------------------------------------------------------");
		
		// Contains
		
		System.out.println(li.contains("Whale")); //true
		
		System.out.println("------------------------------------------------------");
		
		System.out.println(li.set(0, "Bull Dog"));
		
		System.out.println(li);
		
		System.out.println(li.get(2)); //Elephant
		
		System.out.println(li.isEmpty()); //false
		
		System.out.println("------------------------------------------------------");
		
		Collections.sort(li);
		
		System.out.println(li); //[Bull Dog, Cat, Dinosores, Elephant, Whale]
		
		System.out.println("------------------------------------------------------");
		
		Collections.sort(li,Collections.reverseOrder());
		
		System.out.println(li); //[Whale, Elephant, Dinosores, Cat, Bull Dog]
		
		System.out.println("------------------------------------------------------");
		
		Collections.shuffle(li);
		
		System.out.println(li); //[Dinosores, Cat, Whale, Bull Dog, Elephant]
		
		System.out.println("------------------------------------------------------");
		
			
		
		
		
		
		
		
		

	}

}
