package edu.java8.lambda;

import java.util.Arrays;

class Department {
	  String name;
	  
	  Department(String name) {
	    this.name = name;
	  }
	  
	  public static int nameCompare(Department a1, Department a2) {
	    return a1.name.compareTo(a2.name);
	  }
	    
	  public String toString() {
	    return name;
	  }
	}
	 
public class SortLambda {
public static void main(String[] args) {
	Department[] departments  = {
             new Department("IT"),
             new Department("HR"),
             new Department("Finance"),
             new Department("Admin")};
           
         System.out.println("Before Sorting Names: "+Arrays.toString(departments));
         Arrays.sort(departments, Department::nameCompare);
         System.out.println("After Sorting Names "+Arrays.toString(departments));
}
}
