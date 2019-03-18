package edu.java8.lambda;

public class ThreadLambda {
public static void main(String[] args) {
	System.out.println("Hello Lambda");
	new Thread(
		    () -> System.out.println("My Runnable")
		).start();
	System.out.println("Bye Lambda");
}
}
