import java.util.*;
public class Rectangle{
    public static void main(String args[]){
         int length=20;
         int breadth=30;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length: ");
        length=sc.nextInt();

        System.out.print("Enter the bredth: ");
        breadth=sc.nextInt();
        int A=length*breadth;
        System.out.println("Area of rectangle " +A);
    }
}