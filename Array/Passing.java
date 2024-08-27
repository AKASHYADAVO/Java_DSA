
public class Passing{

    public static void Add(int  marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] =  marks[i]+1;

        }

    }
public static void main(String args[]) {

    int marks [] = {10,20,30,40};
    Add(marks);


for(int j=0;j<marks.length;j++){
    System.out.println(marks[j]);
}
    
    
}
}