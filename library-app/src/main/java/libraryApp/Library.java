package libraryApp;
import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books = new ArrayList<Book>();
    public ArrayList<Member> members = new ArrayList<Member>();
    public ArrayList<Staff> staffs = new ArrayList<Staff>();

    void add_book(Book book){
        books.add(book);
    }

    void register_member(Member member){
        members.add(member);
    }

    void List_Books(){
        for(int i = 0; i<books.size(); i++){
            Book book = books.get(i);
            System.out.println(book.describe());
        }
    }

    void List_member(){
        for(int i = 0; i<members.size(); i++){
            Member member = members.get(i);
            System.out.println(member.id + ": " + member.name);
        }
    }

    void List_staff(){
        for(int i = 0; i<staffs.size(); i++){
            Staff staff = staffs.get(i);
            System.out.println(staff.id + ": " + staff.name);
        }
    }
}
