import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Navigableset {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);    
        NavigableSet<Integer> sets = new TreeSet<Integer>() ;
        for(int i=0;i<3;i++)
        sets.add(sc.nextInt());

        NavigableSet<Integer> set1 = new TreeSet<Integer>();
        set1.add(8);
        //union
        set1.addAll(sets);
        //reverse set 
        
        NavigableSet<Integer> reversedset =  sets.descendingSet();
        //check whether elemet above 2 is present in the given set
        NavigableSet<Integer> tailset = sets.tailSet(2, true); 
       
        System.out.println(sets);
        System.out.println(set1);
        System.out.println(reversedset);
        System.out.println(tailset);

    }
}
