import java.util.*;

public class Enumex {

    enum Size{
        SMALL,MEDIUM,LARGE,EXTRALARGE
    }

    public static void main (String args[]){
       EnumMap<Size,Integer> num=new EnumMap(Size.class);
       num.put(Size.SMALL,20);
       num.put(Size.MEDIUM,30);
       num.put(Size.LARGE,40);
       num.put(Size.EXTRALARGE,50);
       System.out.println(num);
       System.out.println(num.keySet());
       System.out.println(num.values());
       System.out.println(num.entrySet());
       System.out.println(Size.MEDIUM);

    
    }}