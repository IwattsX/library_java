package libraryApp;
import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books = new ArrayList<Book>();
    public ArrayList<Member> members = new ArrayList<Member>();
    public ArrayList<Staff> staff = new ArrayList<Staff>();

    
    /** 
     * Adds a book to the ArrayList books
     * @param book
     */
    void add_book(Book book){
        books.add(book);
    }

    /**
     * Adds a member to the ArrayList members
     * @param member
     */
    void register_member(Member member){
        members.add(member);
    }

    /**Prints all the books descriptions */
    void List_Books(){
        for(int i = 0; i<books.size(); i++){
            Book book = books.get(i);
            System.out.println(book.describe());
        }
    }

    /**Prints all the members id and name */
    void List_member(){
        for(int i = 0; i<members.size(); i++){
            Member member = members.get(i);
            System.out.println(member.id + ": " + member.name);
        }
    }

    /**Prints all the staffs id and names */
    void List_staff(){
        for(int i = 0; i<staff.size(); i++){
            Staff staff1 = staff.get(i);
            System.out.println(staff1.id + ": " + staff1.name);
        }
    }
}
