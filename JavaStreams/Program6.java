package JavaStreams;
import java.util.*;

public class Program6 {

    double findAvg(List<Double> list){
        double value = list.stream().mapToDouble(Double :: doubleValue).sum();
        double count = list.stream().count();
        return value/count;
    }
    public static void main(String args[]){
        // find average of a List of floating-point number using streams
        Program6 obj = new Program6();
        List<Double> list= Arrays.asList(1.5,2.1,3.8,4.7);
        double avg = obj.findAvg(list);
        // long count =  obj.filterEvenCount(list);
        System.out.println("average: " +  avg);
       
     }
}
