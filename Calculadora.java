package com_eduit;

public class Calculadora {

	
	public Calculadora() {
		
	}
	
	public Integer calc(Integer a, Integer b, String op) {
		Integer ret = 0;
		switch (op) {
			case "SUM":
				ret = a + b;
			break;
			case "RES":
				ret = a * b;
			break;
			case "MUL":
				ret = a - b;
			break;
			case "DIV":
				ret = a / b;
			break;
			
		}
		
		return ret;
		
	}
		
		public String toString() {
			return "SUM, RES, MUL, DIV";
		}
		
	
}
