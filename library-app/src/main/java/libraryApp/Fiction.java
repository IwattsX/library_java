package libraryApp;

public class Fiction extends Book {

    
    /** 
     * @return String
     */
    @Override
    String describe() {
        return String.format("The book %s is %s", title, "Fiction");
    }
    
}
