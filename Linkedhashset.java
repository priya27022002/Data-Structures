import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args) {
        ArrayList<Integer> even=new ArrayList<>();
        even.add(2);
        even.add(4);
        even.add(6);
        System.out.println(even);

        LinkedHashSet<Integer> num=new LinkedHashSet<>();
        num.addAll(even);
        num.add(8);
        System.out.println(num);
    }
}
//Can Perform
//Iterator
//Remove
//Set operations - Union,Intersection,Difference
