package edu.java8.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredicateSample {
public static void main(String[] args) {
	Person e1 = new Person(1,23,"M","Rick","Beethovan");
    Person e2 = new Person(2,13,"F","Martina","Hengis");
    Person e3 = new Person(3,43,"M","Ricky","Martin");
    Person e4 = new Person(4,26,"M","Jon","Lowman");
    Person e5 = new Person(5,19,"F","Cristine","Maria");
    Person e6 = new Person(6,15,"M","David","Feezor");
    Person e7 = new Person(7,68,"F","Melissa","Roy");
    Person e8 = new Person(8,79,"M","Alex","Gussin");
    Person e9 = new Person(9,15,"F","Neetu","Singh");
    Person e10 = new Person(10,45,"M","Naveen","Jain");
     
    List<Person> persons = new ArrayList<Person>();
    persons.addAll(Arrays.asList(new Person[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
    PersonPredicates predicate=new PersonPredicates();     
    System.out.println( predicate.filterPersons(persons, predicate.isAdultMale()) );
     
    System.out.println( predicate.filterPersons(persons, predicate.isAdultFemale()) );
     
    System.out.println( predicate.filterPersons(persons, predicate.isAgeMoreThan(35)) );
     
    //Employees other than above collection of "isAgeMoreThan(35)"
    //can be get using negate()
}
}
