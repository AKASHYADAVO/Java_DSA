
import java.util.*;
public class Half_pyramid {

    public static void hf(int row){
        for(int i = 1; i<=row;i++){
            for(int j=1; j<=row-i;j++ ){
                //empty space
                System.out.print(" ");
            }
            for(int j=1; j<i;j++){
                // star
                System.out.print("*");
            }

            System.out.println(); //new line
        }
        
    }

    
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter the no of rows");
int n = sc.nextInt();
        hf(n);

        
        
    }
    
}
