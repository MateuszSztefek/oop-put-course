public class Book{
    private Author author;
    private int numberOfPages;
    private String isbn;
    private String genre;
    private String content;
    
    Book(Author author, int numberOfPages, String isbn, String genre, String content){
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.isbn = isbn;
        this.genre = genre;
        this.content = content;
    }
    
    public String toString(){
        return "Author of this book: " + author + ".\nISBN number: " + isbn + ".\nGenre: " + genre + ".\nNumber of pages: " + numberOfPages + ".\nEntire content of this book: "+ content;
    }
    
}