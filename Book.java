public class Book{
    String bookName ="Java Programming";
    String ISBN="1789";
    String author="John Doe";
    int price=500;
    public static void main(String [] args){
        Book book=new Book();
        book.displayBookDetails();
    }

    void displayBookDetails(){
        System.out.println("Book Name: "+bookName);
        System.out.println("ISBN: "+ISBN);
        System.out.println("author: "+author);
        System.out.println("price:  "+price);
    } 
}

    
