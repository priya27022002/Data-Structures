
public class BufferBuilder{
    public static void main(String[] args){
        long starttime=System.currentTimeMillis();
        StringBuffer buffer=new StringBuffer("Hello ");
        System.out.println(buffer.capacity());
        //buffer.append("World");
        //System.out.println(buffer); 
        

        for(int i=0;i<10000;i++){
            buffer.append("World");}
        
        System.out.println("Time taken by String Buffer="+(System.currentTimeMillis()-starttime));


        StringBuilder builder=new StringBuilder("Hello ");
       System.out.println(builder.capacity());
        //builder.append("World");
        //System.out.println(builder);

        for(int i=0;i<10000;i++){
           builder.append("World");}
        
        System.out.println("Time taken by String Builder="+(System.currentTimeMillis()-starttime));
    }
}