package libraryApp;

abstract class Book{
    String title;
    String author;
    String ISBN;
    Boolean is_checked_out;

    void check_out(){
        this.is_checked_out = true;
    }

    void return_book(){
        this.is_checked_out = false;
    }

    abstract String describe();
}

