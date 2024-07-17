import java.util.*;

public class Half_pyramid_number {


    public static void hpn(int row){
        for(int i=1;i<=row;i++){  //outer loop

            for(int j=1;j<=row-i+1;j++){  //inner loop
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //creating the refrence variable

        System.out.println("enter the no of rows");

        int n = sc.nextInt();

        hpn(n); //calling the method/function
        
    }
    
}
