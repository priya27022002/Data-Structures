import java.util.*;

public class Hashmapex{
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(101,"Priya");
        map.put(102,"Loga");
        map.put(103,"Poonam");

        for(Map.Entry<Integer, String> m:map.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
        System.out.println(map.get(101));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.remove(101));
        System.out.println(map);
        map.clear();
        System.out.println(map);



    }
}