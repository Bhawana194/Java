public class ThisExample{
    double length;
    double breadth;
    double height;
    ThisExample(double length, double breadth, double height)
    {
    this.length= length;
    this.breadth= breadth;
    this.height= height;
    }
    double baseArea(){
        return this.length*this.breadth;
    }
    double volume(){
        return this.baseArea()*this.height;
    }
    public static void main(String args[]){
        ThisExample myBox= new ThisExample(2.5, 4.5, 6.5);
        System.out.println("Base area is: "+myBox.baseArea());
        System.out.println("volume is: "+myBox.volume());
    }
}