import java.util.*;
public class Treemap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer , String > treemap = new TreeMap<Integer, String>();
        for(int i=0;i<2;i++){
            treemap.put(sc.nextInt(),sc.next());
        }

        for(Map.Entry<Integer,String> m : treemap.entrySet() ){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(treemap);

    }
}


// new methods 

// entrySet() 
// Map.Entry
// getKey()
// getValue()
// KeySet()
// values();