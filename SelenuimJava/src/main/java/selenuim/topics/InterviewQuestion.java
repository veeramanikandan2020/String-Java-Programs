package selenuim.topics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestion {
	
	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		
		
		
		
		//Char[] input = {'a', 'b', 'b', 'c', 'c', 'c', 'd', 'd', 'd', 'd'};

		String input = "abbcccdddd";
		
		char[] ch = input.toCharArray();
		//output = {a1, b2, c3, d4}


		HashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();


		for(int i = 0; i<ch.length;i++)

		{

			map.put(ch[i],map.containsKey(ch[i])? map.get(ch[i])+1 : 1);


		}
		
		for(Entry<Character, Integer> entryset : map.entrySet())
		{
			System.out.println(entryset.getKey()+" "+" "+entryset.getValue());
		}
		
		
		//List<WebElement> elements = driver.findElements(By.xpath(""));
		
		String elements = "c3";
		
		if(elements.contains("c3")) {
			
			System.out.println("C3 is present and selected");
			
		}
		else
		{
			System.out.println("C3 is not present");
		}
		
		/*
		 * 
		 * for(int j =0; j<elements.size();j++) {
		 * 
		 * if(elements.getText().contains("c3")) { element.click(); break; } }
		 */	}

}
