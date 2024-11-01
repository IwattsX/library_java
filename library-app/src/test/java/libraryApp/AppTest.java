package libraryApp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    // @Test
    // public void shouldAnswerWithTrue() {
    //     assertTrue(true);
    // }

    @Test 
    public void test_staff(){
        Staff staff = new Staff();
        Member member = new Member();
        Library lib = new Library();

        NonFiction book = new NonFiction();
        book.title = "Anne Frank";

        staff.register_book(lib, book);

        assertTrue(lib.books.get(0).describe().equals("The book Anne Frank is Non-Fiction"));
        
        member.id = "333";
        member.name = "Joe Biden";
        staff.register_member(lib, member);

        assertTrue(lib.members.get(0).id.equals("333") && lib.members.get(0).name.equals("Joe Biden"));
    }

    @Test
    public void test_member(){
        Member member = new Member();
        member.id = "123";
        member.name = "Jane Doe";

        assertTrue(member.id.equals("123") && member.name.equals("Jane Doe"));
    }

    @Test 
    public void test_library() {
        Library lib = new Library();
    
        String[] names = {"Blade Runner", "Demon Slayer", "One Piece"};
        String[] members = {"Joe Biden", "Donald Trump", "Selena Gomez"};
        String[] staffs = {"Bruce Lee", "Muhammad Ali", "Mike Tyson"};
    
        for (int i = 0; i < 3; i++) {
            Book book = new Fiction();
            book.title = names[i];
            lib.add_book(book);
    
            Member member = new Member();
            Staff staff = new Staff();
    
            staff.name = staffs[i];
            member.name = members[i];
            member.id = String.format("%d", i);
    
            lib.staffs.add(staff);
            lib.register_member(member);
        }
    
        // Create a stream to hold the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        try {
            // Redirect System.out to the output stream
            System.setOut(new PrintStream(outputStream));
    
            // Call the methods to generate output
            lib.List_member();
            lib.List_Books();
            lib.List_staff();
    
            // Convert the outputStream content to a string
            String output = outputStream.toString();
    
            // Temporarily print the output for debugging
            System.out.println("Captured Output:\n" + output);
    
            // Verify the output, using 'contains' to check the contents
            assertTrue(output.contains("Blade Runner"));
            assertTrue(output.contains("Joe Biden"));
            assertTrue(output.contains("Bruce Lee"));
    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // Restore original System.out
            System.setOut(originalOut);
        }
    }
    
}
