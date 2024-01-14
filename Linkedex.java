import java.util.*;
public class Linkedex{
    public static void main(String[] args){
        LinkedList<String> linkedlist=new LinkedList<String>();
        System.out.println(linkedlist.size());

        linkedlist.add("Python");
        linkedlist.add("Java");
        linkedlist.add("Javascript");
        linkedlist.add("C#");

        System.out.println(linkedlist);

         linkedlist.add(2,"C++");
         
         linkedlist.remove(0);
         linkedlist.remove("Javascript");

         System.out.println(linkedlist);
         System.out.println(linkedlist.size());

    }
}