import java.util.*;
public class simple {
public static void main(String[] args) {
    
    int marks [] = new int [8];
    Scanner sc = new Scanner(System.in);
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();
   
    System.out.println("physics :"+marks[0] );
    System.out.println("chemistri :"+marks[1] );

    System.out.println("maths :"+marks[2] );

    float percentages = (marks[0]+marks[2]+marks[1])/3;
    System.out.println("percentage :" +percentages);

System.out.println(marks.length);
}
}