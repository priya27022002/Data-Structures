import java.util.*;

public class Hashsetex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<4;i++){
            set.add(sc.nextInt());
        }
        System.out.println(set);
        
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(100);
        set2.add(200);
        set2.add(300);
        set2.add(500);

        set1.addAll(set2);
        System.out.println(set1);

        set1.retainAll(set2);
        System.out.println(set1);

        set2.removeAll(set1);
        System.out.println(set2);
    }
}