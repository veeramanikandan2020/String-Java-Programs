package selenuim.topics;

import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class BrowserNotifications {
	
	public static void main(String[] args) {
		
		/*
		 * ChromeOptions option = new ChromeOptions();
		 * 
		 * option.addArguments("--disable-notifications");
		 * 
		 * ChromeDriver driver = new ChromeDriver(option);
		 * 
		 * driver.get("https://www.justdial.com/");
		 */
		
		String str= "I am expert in Automation";                           
				//frequency of e character 
			//	output-e=2


				char[] Array = str.toCharArray();

				int count = 0;

				for(int i =0 ; i< Array.length; i++)

				{

					if( Array[i] == 'e')
					{
						count += 1;

					}

				}

				System.out.println("Count of e is : "+count);
				
				
			HashMap<Character, Integer> mapl = new HashMap<Character, Integer>();
			
			for (int i = 0; i < Array.length; i++) {
				
				mapl.put(Array[i], mapl.containsKey(Array[i])? mapl.get(Array[i])+1 : 1);
			}
			
			for(Entry<Character,Integer>entryset : mapl.entrySet())
			{
				if(entryset.getKey()=='e')
				{
				  
				  
				  System.out.println(entryset.getValue());
				}
			}
				
				
		
	}

}
