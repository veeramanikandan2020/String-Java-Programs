package selenuim.topics;

public class Parseing {

	public static void main(String[] args) {


			String str = "876539$";
			
			str = str.replace("$", "");
			
			System.out.println(str);
			
			int num = Integer.parseInt(str);
			
			System.out.println(num+1);

	}

}
