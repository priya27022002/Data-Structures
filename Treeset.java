import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Set;

public class Treeset {
    public static void main(String[] args) {
        NavigableSet<String> set=new TreeSet<String>() ;
            set.add("A");
            set.add("B");
            set.add("C");
            set.add("C");
            System.out.println(set);

            System.out.println(set.contains("D"));
            System.out.println(set.first());
            System.out.println(set.last());
            System.out.println(set.higher("B"));
            System.out.println(set.lower("B"));
            System.out.println(set.pollFirst());
            System.out.println(set.pollLast());

        }
        }
    

