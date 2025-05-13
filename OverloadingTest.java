public class OverloadingTest{
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        OverloadingTest over= new OverloadingTest();
        System.out.println("the sum of two numbers is:" +over.sum(20,40));
        System.out.println("the sum of three numbers is:" +over.sum(20,40,60));
        }
        }