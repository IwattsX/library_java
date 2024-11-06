package libraryApp;

public class NonFiction extends Book {

    
    /** 
     * @return String
     */
    @Override
    String describe() {
        return String.format("The book %s is %s", title, "Non-Fiction");
    }
    
}
