package library;

import java.util.Arrays;

public class Book {
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    private String name;
    private Author[] authors;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getAuthorNames(){
        String str="";
        for(int i =0;i<authors.length;i++){
            str+=authors[i].name+", ";
        }
        return str;
    }

    public static void main(String[] args) {
        Author[] authors = new Author[4];
        authors[0] = new Author("Amish Tripathi","at@mail.ru",'m');
        authors[1] = new Author("Paulo Coelho","pc@mail.ru",'m');
        authors[2] = new Author("Abhijit V Banerjee","pc@mail.ru",'m');
        authors[3] = new Author("Amish Tripathi","at@mail.ru",'m');
        Book book = new Book("Arabian Nights",authors,325.50,3);
        System.out.println(book);
        System.out.println(book.getAuthorNames()+"\n");
        System.out.println("Author[1] is equal to author[3] ? "+authors[0].equals(authors[3]));
    }
}
