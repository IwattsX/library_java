package libraryApp;

public class NonFiction extends Book {

    @Override
    String describe() {
        return String.format("The book %s is %s", title, "Non-Fiction");
    }
    
}
