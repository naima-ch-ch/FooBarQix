import java.util.Scanner;

public class FooBarQix {
	
	public static String fooBarQix(int number) {
		String result = "";
		if(number % 3 == 0) {
			result = "Foo";
		}else if(number % 5 == 0) {
			result="Bar";			
		}else if(number % 7 == 0) {
			result="Qix";			
		}
		if(!result.isEmpty()) {
			return result;
		}else return String.valueOf(number);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir un nombre :");
			int str = sc.nextInt();
			System.out.println(fooBarQix(str));
		}

	}

}
