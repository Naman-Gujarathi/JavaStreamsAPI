package JavaStreams;
import java.util.*;
import java.util.stream.Collectors;;

public class Program8 {

    void removeDuplicate(List<Integer> list) {
        list.stream().distinct().forEach(element -> System.out.println(element));
    }

   List<Integer> removeDuplicate1(List<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }
    public static void main(String args[]){
        // from give list return only unique elements
         List<Integer> list= Arrays.asList(1,2,2,4,5,6,6,8,11, 11, 1,2);
         Program8 obj = new Program8();
         List<Integer> result = obj.removeDuplicate1(list);
        //  int result1 = obj.sumOfElementsParallelStream(list);
         System.out.println("Result:" +  result);
        //  System.out.println("Result using Parallel Stream:" +  result1);
     }
}
