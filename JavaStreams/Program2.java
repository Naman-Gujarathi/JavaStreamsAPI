package JavaStreams;
import java.util.*;

public class Program2 {
    int findMaxElements(List<Integer> list){
     
            return list.stream()
            .max(Comparator.naturalOrder())
            .orElseThrow(() -> new NoSuchElementException("List is Empty"));
      
       

            // Alternalte way but doesnt handle exception here get take Optional reutrned by max
            // return list.stream()
            // .max(Comparator.naturalOrder())
            // .get();
        
    }
    public static void main(String args[]){
        // find maximum elements in a List using streams 
         List<Integer> list= Arrays.asList(1,2,3,4,5,6);
         List<Integer> emptyList= Arrays.asList();
         Program2 obj = new Program2();
         int result = obj.findMaxElements(list);
         obj.findMaxElements(emptyList);
         System.out.println("Max element Result:" +  result);
       
     }
}
