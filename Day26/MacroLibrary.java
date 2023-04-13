/*Library Management System: Create classes for "Book" and "Author" that represent books and authors in a library. The Book class should have properties such as title, author, ISBN, and publisher, and methods such as getTitle, getAuthor, and setAuthor. The
 Author class should have properties such as name, email, and a list of books, and methods such as getName, getEmail, and addBook.*/
import java.util.ArrayList;

class Book {
  private String title;
  private Author author;
  private String ISBN;
  private String publisher;

  public Book(String title, Author author, String ISBN, String publisher) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.publisher = publisher;
  }

  public String getTitle() {
    return title;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public String getISBN() {
    return ISBN;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
}

class Author {
  private String name;
  private String email;
  private ArrayList<Book> books;

  public Author(String name, String email) {
    this.name = name;
    this.email = email;
    this.books = new ArrayList<Book>();
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public ArrayList<Book> getBooks() {
    return books;
  }
}

class LibraryManagementSystem {
  public static void main(String[] args) {
    Author author1 = new Author("J.K. Rowling", "jkrowling@gmail.com");
    Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, "978-0747532743",
        "Bloomsbury Publishing");
    author1.addBook(book1);

    Author author2 = new Author("George R.R. Martin", "grrm@gmail.com");
    Book book2 = new Book("A Game of Thrones", author2, "978-0553381689", "Bantam Books");
    Book book3 = new Book("A Clash of Kings", author2, "978-0553381696", "Bantam Books");
    author2.addBook(book2);
    author2.addBook(book3);

    System.out.println(book1.getTitle() + " by " + book1.getAuthor().getName() + ", ISBN: " + book1.getISBN()
        + ", published by " + book1.getPublisher());
    System.out.println("Books by " + author2.getName() + ":");
    for (Book book : author2.getBooks()) {
      System.out.println("- " + book.getTitle());
    }

    author1.setEmail("newemail@gmail.com");
    System.out.println("Author " + author1.getName() + "'s new email: " + author1.getEmail());
  }
}
