public class SampleClass{
     int x;
     int y;

   void display1(){
        System.out.println("Data: " +x);
   }
   void display2(){ 
        System.out.println("Data: " +y);
    }
    public static void main(String[] args){
        SampleClass obj= new SampleClass();
        obj.x= 10; 
        obj.y= 30;
        obj.display1();
        obj.display2();
    }
}