package tests;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import core.Book;
import core.Shelf;

import java.util.*;

import static org.junit.Assert.*;

public class ShelfTests {

    @Test
    public void capitalizeTest1() {
        String ret = Book.capitalize("titaNIC");
        assertEquals("Titanic", ret);
    }

    @Test
    public void capitalizeTest2() {
        String ret = Book.capitalize("j");
        assertEquals("J", ret);
    }

    @Test
    public void isTitleWordTest1() {
        assertFalse("'a. test failed", Book.isTitleWord("a"));
        assertFalse("'a' test failed", Book.isTitleWord("an"));
        assertFalse("'the' test failed", Book.isTitleWord("The"));
        assertFalse("'and' test failed", Book.isTitleWord("aND"));
        assertFalse("'but' test failed", Book.isTitleWord("bUt"));
        assertFalse("'for' test failed", Book.isTitleWord("for"));
        assertFalse("'nor' test failed", Book.isTitleWord("noR"));
        assertFalse("'or' test failed", Book.isTitleWord("or"));
        assertFalse("'so' test failed", Book.isTitleWord("so"));
        assertFalse("'yet' test failed", Book.isTitleWord("yet"));
        assertFalse("'at' test failed", Book.isTitleWord("at"));
        assertFalse("'by' test failed", Book.isTitleWord("by"));
        assertFalse("'in' test failed", Book.isTitleWord("in"));
        assertFalse("'into' test failed", Book.isTitleWord("into"));
        assertFalse("'near' test failed", Book.isTitleWord("near"));
        assertFalse("'of' test failed", Book.isTitleWord("of"));
        assertFalse("'on' test failed", Book.isTitleWord("on"));
        assertFalse("'to' test failed", Book.isTitleWord("to"));
        assertFalse("'than' test failed", Book.isTitleWord("than"));
        assertFalse("'via' test failed", Book.isTitleWord("via"));
    }

    @Test
    public void isTitleWordTest2() {
        assertTrue("Title word check failed" , Book.isTitleWord("Maruf"));
        assertTrue("Title word check failed" , Book.isTitleWord("Wooden"));
    }

    @Test
    public void setAuthorTest1(){
        Book book = new Book();
        book.setAuthor("mArUf teMirov");
        assertEquals("setAuthorTest failed", "Maruf Temirov",book.getAuthor());
    }

    @Test
    public void setAuthorTest2(){
        Book book = new Book();
        book.setAuthor("jamal");
        assertEquals("setAuthorTest failed", "Jamal",book.getAuthor());
    }

    @Test
    public void emptyAuthorTest(){
        assertEquals("emptyAuthor count failed", 0,Book.getUnknownAuthors());

        Book book = new Book();
        book.setAuthor("");
        assertEquals("emptyAuthorTest failed", "Unknown",book.getAuthor());
        assertEquals("emptyAuthor count failed", 1,Book.getUnknownAuthors());

        Book book2 = new Book();
        book2.setAuthor("");
        assertEquals("emptyAuthorTest failed", "Unknown",book2.getAuthor());
        assertEquals("emptyAuthor count failed", 2,Book.getUnknownAuthors());
    }

    @Test
    public void setTitleTest1(){
        Book book = new Book();
        book.setTitle("wooden spoon");
        assertEquals("Wooden Spoon", book.getTitle());
    }

    @Test
    public void setTitleTest2(){
        Book book = new Book();
        book.setTitle("MaruF The cool");
        assertEquals("Maruf the Cool", book.getTitle());
    }

    @Test
    public void setTitleTest3(){
        Book book = new Book();
        book.setTitle("the Chronicles OF TrumP");
        assertEquals("The Chronicles of Trump", book.getTitle());
    }

    @Test
    public void emptyShelfTest() {
        assertTrue("Shelf was not empty",Shelf.isShelfEmpty());
    }

    @Test
    public void addBook_PositiveTest1() {
        Shelf.clearBookShelf();
        assertTrue(Shelf.addBook(100,"j.K. rowLing","harry potter",556));
        Book book = Shelf.getTheBooks().get(0);
        assertEquals(100, book.getId());
        assertEquals("J.k. Rowling", book.getAuthor());
        assertEquals("Harry Potter", book.getTitle());
        assertEquals(556, book.getPages());

    }

    @Test
    public void addBook_PositiveTest2() {
        Shelf.clearBookShelf();
        assertTrue(Shelf.addBook(101,"Jane austen","pride And prejudiCe",1556));
        assertTrue(Shelf.addBook(102,"gEorge Orwell","ANimaL Farm",656));

        Book book = Shelf.getTheBooks().get(0);
        assertEquals(101, book.getId());
        assertEquals("Jane Austen", book.getAuthor());
        assertEquals("Pride and Prejudice", book.getTitle());
        assertEquals(1556, book.getPages());

        book = Shelf.getTheBooks().get(1);
        assertEquals(102, book.getId());
        assertEquals("George Orwell", book.getAuthor());
        assertEquals("Animal Farm", book.getTitle());
        assertEquals(656, book.getPages());
    }

    @Test
    public void addBook_PositiveTest3() {
        Shelf.clearBookShelf();
        Book book1, book2;
        book1 = new Book(44, "shel silverstein" ,"the Giving tRee",532);
        book2 = new Book(434, "Dan Brown" ,"the da Vinci coDe",1532);

        assertTrue(Shelf.addBook(book1));
        assertTrue(Shelf.addBook(book2));

        Book book = Shelf.getTheBooks().get(0);
        assertEquals(44, book.getId());
        assertEquals("Shel Silverstein", book.getAuthor());
        assertEquals("The Giving Tree", book.getTitle());
        assertEquals(532, book.getPages());

        book = Shelf.getTheBooks().get(1);
        assertEquals(434, book.getId());
        assertEquals("Dan Brown", book.getAuthor());
        assertEquals("The Da Vinci Code", book.getTitle());
        assertEquals(1532, book.getPages());
    }

    @Test
    public void addBook_negative_DuplicateID() {
        Shelf.clearBookShelf();
        assertTrue(Shelf.addBook(100,"j.K. rowLing","harry potter",556));
        assertFalse(Shelf.addBook(100,"rowLing","harry potter",556));

        Book book = Shelf.getTheBooks().get(0);
        assertEquals(100, book.getId());
        assertEquals("J.k. Rowling", book.getAuthor());
        assertEquals("Harry Potter", book.getTitle());
        assertEquals(556, book.getPages());

        assertEquals(1,Shelf.getTheBooks().size());

        Book book1 = new Book(100, "shel silverstein" ,"the Giving tRee",532);

        assertFalse(Shelf.addBook(book1));
        assertEquals(1,Shelf.getTheBooks().size());


    }

    @Test
    public void addBook_negative_EmptyTitle() {
        Shelf.clearBookShelf();

        assertFalse(Shelf.addBook(100,"j.K. rowLing","",556));
        assertEquals(0,Shelf.getTheBooks().size());

        Book book1 = new Book(1010, "shel silverstein" ,"",532);

        assertFalse(Shelf.addBook(book1));
        assertEquals(0,Shelf.getTheBooks().size());
    }

    @Test
    public void addBook_negative_Pages() {
        Shelf.clearBookShelf();
        assertFalse(Shelf.addBook(100,"j.K. rowLing","Hello",-556));

        assertEquals(0,Shelf.getTheBooks().size());

        Book book1 = new Book(1010, "shel silverstein" ,"Pol",-532);

        assertFalse(Shelf.addBook(book1));
        assertEquals(0,Shelf.getTheBooks().size());
    }

    @Test
    public void getTitleByIDTest() {
        Shelf.clearBookShelf();
        Book book1, book2;
        book1 = new Book(44, "shel silverstein" ,"the Giving tRee",532);
        book2 = new Book(434, "Dan Brown" ,"the da Vinci coDe",1532);

        assertTrue(Shelf.addBook(book1));
        assertTrue(Shelf.addBook(book2));

        assertEquals("The Giving Tree",Shelf.getTitleByID(44));
        assertEquals("The Da Vinci Code",Shelf.getTitleByID(434));
        assertEquals("book not found",Shelf.getTitleByID(22));
    }

    @Test
    public void findBookByPartialTitleTest() {
        Shelf.clearBookShelf();
        assertTrue(Shelf.addBook(101,"Jane austen","pride And prejudiCe",1556));
        assertTrue(Shelf.addBook(102,"gEorge Orwell","ANimaL Farm",656));

        Book book = Shelf.findBookByPartialTitle("Pride");
        assertEquals(101, book.getId());
        assertEquals("Jane Austen", book.getAuthor());
        assertEquals("Pride and Prejudice", book.getTitle());
        assertEquals(1556, book.getPages());

        book = Shelf.findBookByPartialTitle("Farm");
        assertEquals(102, book.getId());
        assertEquals("George Orwell", book.getAuthor());
        assertEquals("Animal Farm", book.getTitle());
        assertEquals(656, book.getPages());

        assertNull(Shelf.findBookByPartialTitle(("spoon")));
    }

    @Test
    public void getAllBooksForAuthorTest() {
        Shelf.clearBookShelf();
        assertTrue(Shelf.addBook(1,"Simon Sinek","Start With Why",486));
        assertTrue(Shelf.addBook(2,"Simon Sinek","Leaders Eat Last",477));
        assertTrue(Shelf.addBook(101,"Jane austen","pride And prejudiCe",1556));
        assertTrue(Shelf.addBook(102,"gEorge Orwell","ANimaL Farm",656));

        List<Book> booksOfSinek = Shelf.getAllBooksForAuthor("Simon Sinek");
        assertEquals(2, booksOfSinek.size());
        Book book = booksOfSinek.get(0);
        assertEquals(1, book.getId());
        assertEquals("Simon Sinek", book.getAuthor());
        assertEquals("Start With Why", book.getTitle());
        assertEquals(486, book.getPages());

        book = booksOfSinek.get(1);
        assertEquals(2, book.getId());
        assertEquals("Simon Sinek", book.getAuthor());
        assertEquals("Leaders Eat Last", book.getTitle());
        assertEquals(477, book.getPages());

        assertTrue(Shelf.getAllBooksForAuthor("Maruf").isEmpty());
    }

    @Test
    public void removeBookByIDTest() {
        Shelf.clearBookShelf();
        assertTrue(Shelf.addBook(1,"Simon Sinek","Start With Why",486));
        assertTrue(Shelf.addBook(2,"Simon Sinek","Leaders Eat Last",477));
        assertTrue(Shelf.addBook(101,"Jane austen","pride And prejudiCe",1556));
        assertTrue(Shelf.addBook(102,"gEorge Orwell","ANimaL Farm",656));

        Shelf.removeBook(102);
        assertEquals(3, Shelf.getTheBooks().size());
        assertEquals("book not found", Shelf.getTitleByID(102));
    }

    @Test
    public void removeBookByAuthorTest() {
        Shelf.clearBookShelf();
        assertTrue(Shelf.addBook(1,"Simon Sinek","Start With Why",486));
        assertTrue(Shelf.addBook(2,"Simon Sinek","Leaders Eat Last",477));
        assertTrue(Shelf.addBook(101,"Jane austen","pride And prejudiCe",1556));
        assertTrue(Shelf.addBook(102,"gEorge Orwell","ANimaL Farm",656));

        Shelf.removeBook("Simon Sinek");
        assertEquals(2, Shelf.getTheBooks().size());
        assertTrue(Shelf.getAllBooksForAuthor("Simon Sinek").isEmpty() );
    }

    @Test
    public void clearBookShelfTest() {
        Shelf.clearBookShelf();
        assertTrue(Shelf.addBook(1,"Simon Sinek","Start With Why",486));
        assertTrue(Shelf.addBook(2,"Simon Sinek","Leaders Eat Last",477));
        assertTrue(Shelf.addBook(101,"Jane austen","pride And prejudiCe",1556));
        assertTrue(Shelf.addBook(102,"gEorge Orwell","ANimaL Farm",656));
        assertEquals(4, Shelf.getTheBooks().size());

        Shelf.clearBookShelf();
        assertEquals(0, Shelf.getTheBooks().size());
    }



}
