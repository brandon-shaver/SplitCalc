package com.nullpointer.SplitCalc;

public class Calculator {
	
	
	public static String evalExpression(String input){
		
		String output;
		//check parenthesis
		//check exponents
		//check mult/div
		
		
		//check AS
		
		if (isNumber(input)){
			output = input;
		}else{
			output = "Error!";
		}
		
		return output;
	}
	
	
	public static boolean isNumber(String item){
		
		try {
			Integer.parseInt(item);
			return true;
			
		}catch (NumberFormatException e){
			return false;
		}
		
		
		
	}

}
