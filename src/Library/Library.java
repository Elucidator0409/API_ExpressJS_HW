package Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private HashMap<Book, Integer> listBooks = new HashMap<>();
    private HashMap<Member, ArrayList<Book>> borrowBooks = new HashMap<>();

    public void addBook(Book book, int quantity){
        listBooks.put(book, quantity);
    }

    public void listBooks(){
        for(Map.Entry<Book, Integer> set : listBooks.entrySet())
            System.out.println(set.getKey().toString() + " " + set.getValue());
    }

    public HashMap<Book, Integer> getListBooks() {
        return listBooks;
    }

    public void setListBooks(HashMap<Book, Integer> listBooks) {
        this.listBooks = listBooks;
    }

    public boolean borrowBooks(Member m, Book b){
        if(listBooks.containsKey(b) && listBooks.get(b) > 0){
            if(borrowBooks.containsKey(m))
                borrowBooks.get(m).add(b);
            else    
                borrowBooks.put(m, new ArrayList<>(List.of(b)));

            listBooks.put(b, listBooks.get(b) - 1);
            return true;
        }
        return false;
    }

    public boolean returnBooks(Member m, Book b){
        if(borrowBooks.containsKey(m) && borrowBooks.get(m).contains(b)){
            borrowBooks.get(m).remove(b);
            listBooks.put(b, listBooks.get(b) + 1);
            return true;
        }
        return false;
    }
}
