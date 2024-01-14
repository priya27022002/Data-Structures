public class StringManipulation{
    public static void main(String[] args){
        //Using string literal
        String str1="HELLO ";
        System.out.println(str1);

        //using string object
        String str2=new String("WORLD");
        System.out.println(str2);

        //concatenate
        String str3=str1+str2;
        System.out.println(str3);

        //Methods
        System.out.println(str3.length());
        System.out.println(str3.charAt(0));
        System.out.println(str1.concat(str2));
        System.out.println(str3.substring(0,5));
        System.out.println(str1.equals(str2));
        System.out.println(str3.contains("HELLO"));
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str3.trim());
    }
}