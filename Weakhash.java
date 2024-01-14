import java.util.*;

public class Weakhash {
    public static void main (String args[]){
       WeakHashMap<String,Integer> num=new WeakHashMap<String,Integer>();
       num.put("ONE",1);
       num.put("TWO",2);
       num.put("THREE",3);
       System.out.println(num);
      
       String four=new String("Four");
       Integer fourvalue=4;

       num.put(four,fourvalue);
       System.out.println(num);

       four=null;

       System.gc();
       
       System.out.println(num);

    }}
