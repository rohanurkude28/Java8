package edu.java8.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilders {
public static void main(String[] args) {
	System.out.println("******************** stream Start************************");
	stream();
	System.out.println("******************** stream End************************");
	
	System.out.println("******************** streamArrays Start************************");
	streamArrays();
	System.out.println("******************** streamArrays End************************");
	
	System.out.println("******************** streamList Start************************");
	streamList();
	System.out.println("******************** streamList End************************");
	
	System.out.println("******************** streamGenerateIterate Start************************");
	streamGenerateIterate();
	System.out.println("******************** streamGenerateIterate End************************");
}

public static void stream() {
	Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
    stream.forEach(p -> System.out.println(p));
}

public static void streamArrays() {
	 Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
     stream.forEach(p -> System.out.println(p));
}

public static void streamList() {
	List<Integer> list = new ArrayList<Integer>();
	 
    for(int i = 1; i< 10; i++){
        list.add(i);
    }

    Stream<Integer> stream = list.stream();
    stream.forEach(p -> System.out.println(p));
}

public static void streamGenerateIterate() {
	/* Stream<Date> stream = Stream.generate(() -> { return new Date(); });
     stream.forEach(p -> System.out.println(p));*/	
     
     System.out.println(Stream.iterate(0, i -> i + 2));
}
}
