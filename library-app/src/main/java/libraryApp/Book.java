package libraryApp;


abstract class Book{ 
	String title;
    String author;
    String ISBN;
    Boolean is_checked_out;

    /**Changes the book to checkout out */
    void check_out(){
        this.is_checked_out = true;
    }

    /**Returns the book by changing checkout to false */
    void return_book(){
        this.is_checked_out = false;
    }

    /**
     * Describes a book on whether it is nonfiction or not (depending on class see Fiction.java and NonFiction.java)
     * @return String
     */
    abstract String describe();
}

