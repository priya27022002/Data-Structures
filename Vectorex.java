import java.util.*;
public class Vectorex{
    public static void main(String[] args){
    Vector<String> vector=new  Vector<String>();
    System.out.println(vector.size());

    vector.add("Java");
    vector.add(".Net");
    vector.add("Python");
    vector.add("PHP");
    vector.add("JS");

    System.out.println(vector);

    System.out.println(vector.size());

    vector.remove(1);
    System.out.println(vector.size());

    vector.clear();
    System.out.println(vector.size());
    

    }}