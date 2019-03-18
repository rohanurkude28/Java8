package edu.java8.functionalinterface;

/**Object class methods are allowed Like in Comparator*/
@FunctionalInterface
public interface MyFourthFunctionalInterface {
	public void firstWork();
	@Override
	public String toString();                //Overridden from Object class
	@Override
	public boolean equals(Object obj);        //Overridden from Object class
}
