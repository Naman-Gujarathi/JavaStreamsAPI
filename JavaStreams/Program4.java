package JavaStreams;
import java.util.*;
import java.util.stream.*;
public class Program4 {

    List<String> convertUpperCase(List<String> list){
        return list.stream().map(String:: toUpperCase).collect(Collectors.toList());
        // return list.stream().map(String:: toUpperCase).collect(Collectors.toList());
       
    }

    void convertTotUpperCase(List<String> list){
        //Alternate Method 1
    //   list.stream().map(String:: toUpperCase).forEach(word -> System.out.print(word + " "));

    //Alternate Method 2
    //   list.stream().map(String:: toUpperCase).forEach(System.out :: println);

    //Alternate Method 3
    list.parallelStream().map(word -> word.toUpperCase()).forEach(word -> System.out.print(word + " "));
    }
    public static void main(String args[]){
        // convert list of string to uppercase 
        Program4 obj = new Program4();
        List<String> list= Arrays.asList("apple", "orange", "avacado", "oat milk", "oyster", "banana");
        // List<String> result = 
        obj.convertTotUpperCase(list);
        // System.out.println("Match count result:" +  result);
       
     }
}
