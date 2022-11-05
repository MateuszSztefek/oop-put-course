public class Main
{
    public static void main(String[] args) {
        Author author = new Author("John", "Smith");
        Book book = new Book(author, 6, "EH324324HEDHE325GW", "Sci-fi", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras vel aliquet urna. Morbi sit amet dui quam. Donec erat erat, elementum eget quam nec, tincidunt mollis orci. Suspendisse fermentum mollis eros, ut iaculis nunc. Aliquam non malesuada enim. Morbi scelerisque eu erat vitae bibendum. Curabitur mattis malesuada nisi, ut viverra.");
        
        System.out.println(book.toString());
    }
}
