import java.util.*;

public class Setex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<4;i++){
            set.add(sc.nextInt());
        }
        System.out.println(set);
        
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}