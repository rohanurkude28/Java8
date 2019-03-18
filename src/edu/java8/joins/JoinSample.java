package edu.java8.joins;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JoinSample {
public static void main(String[] args) {
	stringJoin();
	stringListJoin();
	stringArrayJoin();
	stringJoiner();
	collectorJoining();
}

/* String join(CharSequence delimiter, CharSequence... elements) */
public static void stringJoin() {
	String joinedString = String.join(", ", "How", "To", "Do", "In", "Java");
	System.out.println("String Join: "+joinedString);
	}

/* String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) */
public static void stringListJoin(){
	List<String> strList = Arrays.asList("How", "To", "Do", "In", "Java");
    
	String joinedString = String.join(", ", strList);
	 
	System.out.println("String List Join: "+joinedString);
}

public static void stringArrayJoin(){
	String[] strArray = { "How", "To", "Do", "In", "Java" };
    
	String joinedString = String.join(", ", strArray);
	 
	System.out.println("String Array Join: "+joinedString);
}

/*StringJoiner(CharSequence delimiter)
StringJoiner(CharSequence delimiter, CharSequence prefix, CharSequence suffix)*/
public static void stringJoiner() {
	StringJoiner joiner = new StringJoiner(", ", "[", "]");
	 
	joiner.add("How")
	        .add("To")
	        .add("Do")
	        .add("In")
	        .add("Java");
	
	System.out.println("String Joiner: "+joiner);
}

public static void collectorJoining() {
	List<String> numbers = Arrays.asList("How", "To", "Do", "In", "Java");
	 
	String joinedString =   numbers
	                        .stream()
	                        .collect(Collectors.joining(", ","[","]"));
	 
	System.out.println("Collector Join: "+joinedString);
}


/*Can also be done using StringUtils.join() and StringUtils.join(stringArray,delimeter) commons-lang3*/

}
