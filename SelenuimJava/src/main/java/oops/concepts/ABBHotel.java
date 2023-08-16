package oops.concepts;

public class ABBHotel implements HotelMenu {
	
	int a,b,c;

	public void friedRiceChiken() {
		System.out.println("Chicken fried Rice Rs 110");

	}

	public void parotta() {
		System.out.println("parotta 3 pieces Rs 45");

	}

	public void gobi() {
		System.out.println("Gobi Plate Rs 120");

	}
	
	ABBHotel(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		int s = 0;
	
		// TODO Auto-generated constructor stub
	}
	
	void perimeter(int a, int b, int c)
	{
		int s = a*b*c;
		
		System.out.println(s);
	}
	
	void perimeter()
	{
		int s = a*b*c;
		
		System.out.println(s);
	}


	public static void main(String[] args) {

		ABBHotel ah = new ABBHotel(5, 2, 2);
		
		ah.perimeter(10, 20, 20);

		ah.perimeter();
		
		ah.friedRiceChiken();

		ah.parotta();

		ah.gobi();

	}

}
