public class AbstractExample{
    public static void main(String[] args){
        Dog myDog = new Dog();   
        myDog.makesound();
        myDog.sleep();
    }
}
abstract class Animal {
     abstract void makesound();

    void sleep(){
        System.out.println("Sleepimg....");

    }
}
final class Dog extends Animal{
     void makesound(){
        System.out.println("Barking....");
    }
}