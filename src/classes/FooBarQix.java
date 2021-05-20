package classes;
import java.util.Scanner;

public class FooBarQix {
	
	public static String fooBarQixResult(int number) {
		String chaine = String.valueOf(number);		
		// check if the number is divisible by 3 and 5 and 7
		 
		return contains357(chaine);
		 
	}
	
	public static String numberIsdevisible(int number) {
		if(number == 0) {
			return "";
		}
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
		}else return String.valueOf("");
		
	}
	public static  String contains357(String number) {
		String result = "";	
		String zero="";
		String s1 = numberIsdevisible(Integer.parseInt(number));
		if(!s1.isEmpty()) {
			for(int i=0; i<number.length(); i++) {
				
				switch(number.charAt(i)) {  
					case '0': zero+="*";
					break;
					case '3': result +="Foo";
					break;
					case '5': result +="Bar";
					break;
					case '7': result +="Qix"; 
					break;
				}
			}	
			result =  s1+zero+result;
		}else {
			for(int i=0; i<number.length(); i++) {
				if(number.charAt(i)=='0'){
					 zero += "*";
				}else {
					zero += number.charAt(i);
				}
				switch(number.charAt(i)) {  				 
					case '3': result +="Foo";
					break;
					case '5': result +="Bar";
					break;
					case '7': result +="Qix"; 
					break;
				}
			}
			result =s1+zero+result;
		}
		
		return result;
	}
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceApp ia = new InterfaceApp();
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir un nombre :");
			int str = sc.nextInt();
			System.out.println(fooBarQixResult(str)+    "           "+numberIsdevisible(str));
		}

	}

}
