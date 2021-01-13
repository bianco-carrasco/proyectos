package com.example.demo.util;

public class Util {

	public boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	
	public boolean isPalindrome(String cadena) {		
		String cadenaInvertida = "";
		for (int x=cadena.length()-1;x>=0;x--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(x);
		}		
		if(cadena.equals(cadenaInvertida)) {
			return true;
		}		
		return false;
	}
	
	public Integer calculateHalfPrice(Integer price) {		
		double value = price *0.5;		
		return (int) Math.round(value);
	}
}
