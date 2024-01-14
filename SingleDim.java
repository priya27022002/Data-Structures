public class SingleDim {
    public static void main(String[] args) {
        // Declaring Array
        int[] marks;
        marks=new int[5];
        //or

        int[] m=new int[5];
        //or
        
        //Initializing Array
        int[] grades=new int[]{4,5,6,7,8,9};

        //Declare and assign
        int[] mark=new int[3];
        mark[0]=5;
        mark[1]=6;
        mark[2]=7;

        //Traditional FOR LOOP
        for(int i=0;i<mark.length;i++){
            System.out.println(mark[i]+" ");
        }
        System.out.println("***************");

       //FOR EACH LOOP
       for(int value:grades){
        System.out.println(value+" ");
       }
    }
}