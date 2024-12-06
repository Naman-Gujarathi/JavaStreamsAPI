package JavaStreams;
import java.util.*;
import java.util.Comparator;
import java.util.stream.*;


public class Person  {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // @Override
    // public int compareTo(Person p){
    //     return  p.name.compareTo(this.name);
    // }

    public static void main(String args[]){
        // sort object based on specific attribute using stream
       
        List<Person> people= Arrays.asList(

            new Person("Carla", 41) ,   
            new Person("Alice", 29),
            new Person("Rahul", 28),
            new Person("Anna", 31),
            new Person("Bob", 25)
           
         );

        //  Collections.sort(list, Comparator.comparing(person -> person.age, Comparator.reverseOrder()));

        

        // using stream

       List<Person> sortedPeople = people.stream().sorted(Comparator.comparing(person -> person.name, Comparator.reverseOrder())).collect(Collectors.toList());
       
        for(Person p : sortedPeople){
            System.out.println(p.name + " " + p.age);
         }
     
     }
}
