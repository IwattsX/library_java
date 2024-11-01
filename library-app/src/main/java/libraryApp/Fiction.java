package libraryApp;

public class Fiction extends Book {

    @Override
    String describe() {
        return String.format("The book %s is %s", title, "Fiction");
    }
    
}
