package ru.foleg.sandbox;

public class MySecond {

	public static void main(String[] args) {
		hello("world");
		hello("User");

		double len = 5;
		System.out.println("Площадь " + len + " = " + area(len));

		double a = 4;
		double b = 6;
		System.out.println("Gkjofnm ghzvjeujkmybrf cj сторонами " + a + " и " + b + " = " + area(a, b));
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area(double l) {
		return l * l;
	}

	public static double area(double a, double b) {
		return a * b;
	}

}