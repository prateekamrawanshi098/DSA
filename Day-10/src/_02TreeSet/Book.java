package _02TreeSet;

import java.util.TreeSet;

public class Book implements Comparable<Book> {
    String book_name;
    String author;
    int price;

    public Book(String book_name, String author, int price) {
        this.book_name = book_name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_name='" + book_name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        int x=this.price-o.price;
        if (x!=0){
            return x;
        }
        return this.book_name.compareTo(o.book_name);
    }
}

class Example03{
    public static void main(String[] args) {
        Book b1=new Book("Java","Sachin",1200);
        Book b2=new Book("Python","Kishan",1100);
        Book b3=new Book("Javascript","Ravi",999);
        Book b4=new Book("Typescript","Abdul",980);
        Book b5= new Book("React","Mahi",1100);

        TreeSet<Book> ts = new TreeSet<>();
        ts.add(b1);
        ts.add(b2);
        ts.add(b3);
        ts.add(b4);
        ts.add(b5);
        for (Book b:ts){
            System.out.println(b);
        }


    }
}