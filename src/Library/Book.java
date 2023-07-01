package Library;

public class Book {
    private String name;
    private String Author;

    public Book(String name, String Author) {
        this.name = name;
        this.Author = Author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", Author=" + Author + "]";
    }

    
}
