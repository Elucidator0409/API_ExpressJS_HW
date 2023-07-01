package Library;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Mrs. S", "Patrick");
        Book b2 = new Book("Loot", "Tania");
        Book b3 = new Book("Lucky Red", "Cravens");

        Member m1 = new Member("ali");
        Member m2 = new Member("Bela");
        Member m3 = new Member("Canta");

        Library library = new Library();
        library.addBook(b1, 10);
        library.addBook(b2, 10);
        library.addBook(b3, 10);
        library.listBooks();

        ArrayList<Member> listMember = new ArrayList<>();
        listMember.add(m1);
        listMember.add(m2);
        listMember.add(m3);
        for(Member m : listMember)
            System.out.println(m.toString());
        // brrow book
        System.out.println("\nthe quantity of book before borrow: " + library.getListBooks().get(b1));
        System.out.println("Borrow book: " + library.borrowBooks(m1, b1));
        System.out.println("the quantity of book after borrow: "+library.getListBooks().get(b1));

        // return book
        System.out.println("Return book: " + library.returnBooks(m1, b1));
        System.out.println("the quantity of book after return: "+library.getListBooks().get(b1));

    }
}
