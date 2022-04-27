package ru.foleg.sandbox;

public class MySecond {

	public static void main(String[] args) {
		hello("world");
		hello("User");

		Square s = new Square(5);
		System.out.println("Площадь " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Gkjofnm ghzvjeujkmybrf cj сторонами " + r.a + " и " + r.b + " = " + r.area());
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

}