public class OverridingExample{
public static void main(String args[]){
    Parent obj1= new Parent();
    Parent obj2= new Child();
    obj1.show();
    obj2.show();
}
}
class Parent{
    void show(){
        System.out.println("Parent: ");
        System.out.println("This is parent class: ");
    }
}
class Child extends Parent{
    @Override
void show(){
    System.out.println("Child: ");
    System.out.println("This is child class overridden method: ");
}
}