import java.util.*;

public class Hellow_RECTANGLE{

    public static void Rectangle(int row , int col){
for(int i=1;i<=row;i++){

    for(int j=1;j<=col;j++){

        if(i==1||i==row||j==1||j==col){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }

    }

    System.out.println();

}
    }

    public static void main(String[] args) {
    System.out.println("enter the row & col");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    Rectangle(a,b);
        
    }
}