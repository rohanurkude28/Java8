package edu.java8.functionalinterface;

/** Default methods are allowed since they arent abstract*/
@FunctionalInterface
public interface MyThirdFunctionalInterface {
	public void firstWork();
	default void doSomeMoreWork1(){
	//Method body
	}
	default void doSomeMoreWork2(){
	//Method body
	}
}
