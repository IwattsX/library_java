package libraryApp;

public class Staff extends Person {
    void register_member(Library library, Member member){
        library.members.add(member);        
    }

    void register_book(Library library, Book book){
        library.books.add(book);
    }
}
