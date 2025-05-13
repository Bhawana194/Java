import java.util.Scanner;
public class Box{
    double length =10; 
    double breadth =5; 
    double height =10; 
    public static void main(String[] args){
            Box box= new Box();
            System.out.println("Volume of the box: " +box.volume());
        }
    
    void readData(double length, double breadth, double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    double volume(){
        return length*breadth*height;
    }
        
       }
       