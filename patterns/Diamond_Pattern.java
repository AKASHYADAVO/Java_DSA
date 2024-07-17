import java.util.Scanner;

public class Diamond_Pattern {

    public static void Diamonds(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {


         Scanner sc = new Scanner(System.in); //creating the refrence variable

        System.out.println("enter the no of rows");

        int n = sc.nextInt();

        Diamonds(n); //calling the method/function
    }
    
}
