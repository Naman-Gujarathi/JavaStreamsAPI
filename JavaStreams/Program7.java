package JavaStreams;
import java.util.*;
import java.util.stream.*;

public class Program7 {
    StringBuilder sb = new StringBuilder();
    String concatenate(List<String> list){
       
        return list.stream()
        .reduce("", (a,b) -> a+b );// Appends each string to sb and returns sb itself
        
    }

    String concatenate1(List<String> list){
       
        return list.stream()
        .reduce("", (a,b) -> a+b );// Appends each string to sb and returns sb itself
        
    }

    String concatenate2(List<String> list){
       
        return list.stream()
        .collect(Collectors.joining(","));// Appends each string to sb and returns sb itself
        
    }
    public static void main(String args[]){
        // Given a list of string , WAP to concatenate all the strings using streams
        Program7 obj = new Program7();
        List<String> list= Arrays.asList("Jab ", "Harry ", "Met ", "Sejal");
        String result = obj.concatenate2(list);
       
        System.out.println("concated resultant string:  " +  result);
       
     }
}
