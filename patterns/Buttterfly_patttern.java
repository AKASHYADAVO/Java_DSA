import java.util.*;
public class Buttterfly_patttern {

    public static void Butterfly(int n){
        for(int i=1; i<=n; i++){ //first half
            for(int j=1; j<=i; j++){  // for star
                System.out.print("*");
            }

            for(int j=1; j<=2*(n-i); j++){ //for space
                System.out.print(" "); 
            }

            for(int j=1; j<=i; j++){ //for star
                System.out.print("*");
            }
System.out.println();

        }

        for(int i=n; i>=1; i--){ //second half

            for(int j=1; j<=i; j++){  //for star
                System.out.print("*");
            }

            for(int j=1; j<=2*(n-i); j++){ // for space
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){ //for star
                System.out.print("*");
            }
System.out.println();

        }
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
System.out.println("enter the no  of rows");

int n = sc.nextInt();

Butterfly(n);


        
    }
    
}
