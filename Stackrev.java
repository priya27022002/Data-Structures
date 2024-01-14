import java.util.*;

class StringReverser{
    public String reverse(String input){
        Stack<Character> stack=new  Stack<Character>();
        for(char ch:input.toCharArray()){
            stack.push(ch);}
        String reversed="";
        while(!stack.empty()){
            reversed+=stack.pop();
        }
        
        return reversed;
    }
}
public class Stackrev{
    public static void main(String[] args){
        String str="abcd";
        StringReverser reverser=new StringReverser();
        String result=reverser.reverse(str);
        System.out.println(result);
        
}}