package classes; 

public class FooBarQix {
	
	public String fooBarQixResult(int number) {
		String chaine = String.valueOf(number);		
		// check if the number is divisible by 3 and 5 and 7
		 
		return fooBarQix(chaine);
		 
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
	public static String nbContains357(String number) {
		String result = "";	
		for(int i=0; i<number.length(); i++) {			
			switch(number.charAt(i)) {  				 
				case '3': result +="Foo";
				break;
				case '5': result +="Bar";
				break;
				case '7': result +="Qix"; 
				break;
			}
		}	
		return result;
	}
	public static  String fooBarQix(String number) {
		String result = "";	
		String zero="";
		String s1 = numberIsdevisible(Integer.parseInt(number));
		String s2 = nbContains357(number);
		if(!s1.isEmpty() ) {  // the number is divisible 
			for(int i=0; i<number.length(); i++) {
				
				if(number.charAt(i) == '0') {  
					zero+="*"; // count the number of 0 and replace 					 
				}
			}	
			result =  s1+zero+s2;
		}else { // the number is not divisible
			if(!s2.isEmpty()) { // the number contains 3 and/or 5 and/or 7
				for(int i=0; i<number.length(); i++) {
					
					if(number.charAt(i) == '0') {  
						zero+="*"; // count the number of 0 and replace 					 
					}
				}	
				result =  zero+s2;
			}else { // the number doesn't contain 3 and/or 5 and/or 7
				for(int i=0; i<number.length(); i++) {
					if(number.charAt(i)=='0'){ // replace 0 by * in the number
						 zero += "*";
					}else {
						zero += number.charAt(i);
					}					
				}
				result =zero;
			} 
		}
		
		return result;
	}
	
	
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceApp ia = new InterfaceApp();
		 
	}

}
