package selenuim.topics;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		
		ht.put(101,"Ram");
		
		String[] names = {"Gopal","Ravi","Maharaja","komal"};
		
		int[] nums = {102,103,104,105};
		
		for (int i = 0; i < nums.length; i++) {
			
			ht.put(nums[i], names[i]);
		}
		
		System.out.println(ht);
		
		for (Entry<Integer,String> entryset : ht.entrySet()) {
			
			System.out.println("Key :"+entryset.getKey()+" Value :"+entryset.getValue());
			
		}
		
		System.out.println(ht.containsKey(103));
		
		System.out.println(ht.containsKey(106));
		
		System.out.println(ht.keySet());
		
		System.out.println(ht.values());
		
		
	}

}
