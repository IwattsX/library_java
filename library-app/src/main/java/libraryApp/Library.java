package libraryApp;
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    ArrayList<Member> members;
    ArrayList<Staff> staffs;

    void add_book(Book book){
        books.add(book);
    }

    void register_member(Member member){
        members.add(member);
    }

    void List_Books(){
        System.out.println(books);
    }

    void List_member(){
        System.out.println(members);
    }

    void List_staff(){
        System.out.println(staffs);
    }

}
