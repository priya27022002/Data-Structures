import java.util.*;

public class ArrayListEx{
    public static void main(String[] args){

        List<String> list=new ArrayList<String>();
        list.add("King");
        list.add("priya");
        list.add("loga");

        System.out.println("Size:"+list.size());
        System.out.println(list);
        list.remove(0);

        System.out.println(list);
        for(String value:list){
            System.out.println(value);
        }

    }
}