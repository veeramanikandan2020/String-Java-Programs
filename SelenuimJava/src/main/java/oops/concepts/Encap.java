package oops.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encap{
	
	public static void main(String[] args) {
		
		EncapsulationDemo e= new EncapsulationDemo();
		
		e.setA(99);
		
		int c = e.getA();
		
		System.out.println(c);
		
		WebDriver driver = new ChromeDriver();
	}

}
