package JavaStreams;
import java.util.*;

public class Program3 {
    long findMatchCount(List<String> list){
        return list.stream().filter((fruit) -> fruit.startsWith("o")).count();
    }
    public static void main(String args[]){
        // given a list of string write program to count the number of string that start with 
        //specific character in streams 
        Program3 obj = new Program3();
        List<String> list= Arrays.asList("apple", "orange", "avacado", "oat milk", "oyster", "banana");
        long result = obj.findMatchCount(list);
        System.out.println("Match count result:" +  result);
       
     }
}
