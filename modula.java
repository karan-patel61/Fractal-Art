package eecs2030.lab3;

import java.util.Scanner;

public class modula {

	public static void main(String[] args) {
		Scanner one = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String input = one.nextLine();
		double number = Double.parseDouble(input);
		double radian = (number*Math.PI)/180.0;
		double result = Math.cos(radian);
		System.out.println(radian+"\n"+String.format("%.2f", result));
		

	}

}
