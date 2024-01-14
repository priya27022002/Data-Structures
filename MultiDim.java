public class MultiDim{
    public static void main(String[] args){
        int marks[][]={
            {1,2,3,0},
            {4,5,6,0},
            {7,8,9,0}};

            for(int i=0;i<3;i++){
                for(int j=0;j<4;j++){
                    System.out.print(marks[i][j]+"\t");
                }
            }
        
    }
}