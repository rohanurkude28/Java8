package edu.java8.functionalinterface;
/**Only object class methods are allowed*/
@FunctionalInterface
public interface MyFifthFunctionalInterface extends Test{
	public void firstWork();
	@Override
	public String toRun();                //Overridden from Object class
}
