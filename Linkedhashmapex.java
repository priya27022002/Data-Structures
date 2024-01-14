import java.util.*;

public class Linkedhashmapex {
    public static void main (String args[]){
       LinkedHashMap<String,Integer> even=new LinkedHashMap<String,Integer>();
       even.put("TWO",2);
       even.put("FOUR",4);
       System.out.println(even);

       LinkedHashMap<String,Integer> num=new LinkedHashMap<String,Integer>(even);
       num.put("SIX",6);
       System.out.println(num);

       num.putIfAbsent("SIX",6);
       num.putIfAbsent("EIGHT",8);
       System.out.println(num);


    
    }}