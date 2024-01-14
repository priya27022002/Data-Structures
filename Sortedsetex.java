import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;


public class Sortedsetex {
      public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        SortedSet<Integer> sortset = new TreeSet<Integer>();

        for(int i=0;i<5;i++){
            sortset.add(sc.nextInt());
        }

        Iterator<Integer> iterate =  sortset.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
    }
}
