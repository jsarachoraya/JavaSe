package com_eduit;

public class MainAppCalc {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		Integer resp = calc.calc(2, 4, "SUM");
		System.out.println(resp);
		Integer resp2 = calc.calc(8, 6, "RES");
		System.out.println(resp2);
		Integer resp3 = calc.calc(20, 3, "MUL");
		System.out.println(resp3);
		Integer resp4 = calc.calc(10, 2, "DIV");
		System.out.println(resp4);
		

	}

}
