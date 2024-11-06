package libraryApp;

public class Staff extends Person {
    
    /** 
     * Adds a member to a library
     * @param library
     * @param member
     */
    void register_member(Library library, Member member){
        library.members.add(member);        
    }

    /**
     * Adds a book to a library
     * @param library
     * @param book
     */
    void register_book(Library library, Book book){
        library.books.add(book);
    }
}
