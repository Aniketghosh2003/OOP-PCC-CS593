// 1. Write a Java program to create a package for Book details giving Book name,Author name,price and year of publishing.Create the

// class of your package.
// In the
// main program

// import the created package into
// the program
// and create
// instances of the

// class in the package
package Pakages1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 500, "1988");
        Book book2 = new Book("The Da Vinci Code", "Dan Brown", 700, "2003");
        
        book1.display();
        System.out.println("\n");
        book2.display();
        
    }
}
