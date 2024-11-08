package Pakages1;

public class Book {
    public String name;
    public String author_name;
    public int price;
    public String publicationyear;

    public Book(String name, String author_name, int price, String publicationyear) {
        this.name = name;
        this.author_name = author_name;
        this.price = price;
        this.publicationyear = publicationyear;
    }

    void display() {
        System.out.println("Ths book name is " + name);
        System.out.println("Ths author name is " + author_name);
        System.out.println("Ths price of the book is " + price);
        System.out.println("Ths publication year of the book is " + publicationyear);
    }
}
