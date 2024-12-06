package JavaStreams;
import java.util.*;
public class Program9 {
    
    boolean allEven(List<Integer> list){
        return list.stream().allMatch(element -> element % 2 == 0);
       
    }
    public static void main(String args[]){
        // check if all elements are even
        Program9 obj = new Program9();
        List<Integer> list= Arrays.asList(2, 4, 6, 8, 9);
        boolean result = obj.allEven(list);
        // long count =  obj.filterEvenCount(list);
        System.out.println("All even  " +  result);
       
     }
}
