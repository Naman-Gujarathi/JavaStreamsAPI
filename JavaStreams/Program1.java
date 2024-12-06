package JavaStreams;
import java.util.*;

class Program1 {

    int sumOfElements(List<Integer> list){
        return list.stream()
                   .mapToInt(Integer :: intValue)
                   .sum();
        //parallel stream 
        // return list.parallelStream()
        // .mapToInt(Integer :: intValue)
        // .sum()
        
    }

    int sumOfElementsParallelStream(List<Integer> list){
        
        return list.parallelStream()
        .mapToInt(Integer :: intValue)
        .sum();
        
    }

    public static void main(String args[]){
       // sum of all elements in a List using streams 
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Program1 obj = new Program1();
        int result = obj.sumOfElements(list);
        int result1 = obj.sumOfElementsParallelStream(list);
        System.out.println("Result:" +  result);
        System.out.println("Result using Parallel Stream:" +  result1);
    }
}