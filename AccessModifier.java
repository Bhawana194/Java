public class AccessModifier {
    public static void main (String args[]){
        Student student= new Student();
        student.display();
        System.out.println("Age is: "+student.getAge());
        }
    }
class Person{
    public String Name = "Bhawana Kumari";
    String Stream= "Bachelor";
    private int Age= 19;
    
    protected long Number=9810022916L;
    public int getAge(){
        return Age;
    }
    public void setAge(int age){
        this.Age=age;
    }
}
class Student extends Person{
    public void display(){
    System.out.println(" Name: " +Name);
    System.out.println("Stream: " +Stream);
    System.out.println("Number: " +Number);   
    }
}