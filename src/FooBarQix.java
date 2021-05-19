import java.util.Scanner;

public class FooBarQix {
	
	public static String fooBarQix(int number) {
		String result = "";
		if(number % 3 == 0) {
			result += "Foo";
		}if(number % 5 == 0) {
			result +="Bar";			
		}if(number % 7 == 0) {
			result +="Qix";			
		}
		if(!result.isEmpty()) {
			return result;
		}else return String.valueOf(number);
		
	}
	public static  String containsFooBarQix(int number) {
		String result = "";
		String zero="";
		String chaine = String.valueOf(number);
		for(int i=0; i<chaine.length(); i++) {
			switch(chaine.charAt(i)) {
				case '0': zero +="*";
				break;
				case '3': result +="Foo";
				break;
				case '5': result +="Bar";
				break;
				case '7': result +="Qix"; 
				break;
			}
		}
		return zero+result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir un nombre :");
			int str = sc.nextInt();
			System.out.println(fooBarQix(str)+containsFooBarQix(str));
		}

	}

}
