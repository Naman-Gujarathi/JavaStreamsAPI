package JavaStreams;
import java.util.*;

public class Program5 {

    void filterEven(List<Integer> list){
        list.stream().filter(element -> element %2 == 0).forEach(element -> System.out.println(element) );
    }

    long filterEvenCount(List<Integer> list){
        return list.stream().filter(element -> element %2 == 0).count();
    }
    public static void main(String args[]){
        // filter even number from string
        Program5 obj = new Program5();
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        obj.filterEven(list);
        long count =  obj.filterEvenCount(list);
        System.out.println("even element count:" +  count);
       
     }
}
