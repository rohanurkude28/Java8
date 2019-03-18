package edu.java8.defaultmethods;

public interface Moveable {
	default void move() {
		System.out.println("I am moving");
	}
	
	default void roar() {
		System.out.println("Parent : Roarrrrrrrr");
	}
	
}