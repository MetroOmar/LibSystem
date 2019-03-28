
package libsystem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Catalogue {
    



    public static void main(String[] args) {

       

       BookType1 coverBooks1 = new BookType1();
       coverBooks1.setType("Book");
       BookType1 coverBooks2 = new BookType1();
       coverBooks2.setType("Book");
       BookType1 coverBooks3 = new BookType1();
       coverBooks3.setType("Book");

       BookType2 books = new BookType2();
       books.setType2("Audio Book");
       books.setDuration("90 minutes");

        Author author1 = new Author();
        author1.setAuthorName("Bob Smith");
        Author author2 = new Author();
        author2.setAuthorName("Jake Sims");
        Author author3 = new Author();
        author3.setAuthorName("Brian John");
        Author author4 = new Author();
        author4.setAuthorName("Laura Daniels");
        Author author5 = new Author();
        author5.setAuthorName("Rose Cole");
        
       Items item1 = new Items();
       Items item2 = new Items();
       Items item3 = new Items();
       Items item4 = new Items();
      

       item1.setTitle("Designing Secure Systems");
       item1.getAuthors().add(author1);
       item1.setBorrowed(true);
       item1.setFinePerDay(15.00);




       item2.setTitle("Web Design Unleashed");
       item2.getAuthors().add(author2);
       item2.getAuthors().add(author3);
       item2.setBorrowed(true);




       item3.setTitle("Understanding TCP/IP Networks");
       item3.getAuthors().add(author4);



       item4.setTitle("Quiting a habit in 21 days");
       item4.getAuthors().add(author5);


       item1.getBooks1().add(coverBooks1);
       item2.getBooks1().add(coverBooks2);
       item3.getBooks1().add(coverBooks3);

       item4.getBooks2().add(books);



       //create date objects
        LocalDate fromDate = LocalDate.of(2019,Month.FEBRUARY,2);
        LocalDate toDate = LocalDate.of(2019,Month.FEBRUARY,23);

        LocalDate fromDate1 = LocalDate.of(2019,Month.MARCH,13);
        LocalDate toDate1 = LocalDate.of(2010,Month.APRIL,3);

        LocalDate localDate = LocalDate.now();

       //define users
        Users user1 = new Users();
        user1.setUserName("Nancy Jane");
        Users user2 = new Users();
        user2.setUserName("Carl Hack");



        CheckOut checkout1 = new CheckOut();
        CheckOut checkout2 = new CheckOut();
        checkout1.setItem(item1);
        checkout1.setUser(user1);
        checkout1.setFromDate(fromDate);
        checkout1.setToDate(toDate);
        checkout1.borrow();
        checkout1.setCurrentDate(localDate);
        checkout1.chargeFine();

        checkout2.setItem(item2);
        checkout2.setUser(user2);
        checkout2.setFromDate(fromDate1);
        checkout2.setToDate(toDate1);
        checkout2.borrow();


        item1.getCheckouts().add(checkout1);
        item2.getCheckouts().add(checkout2);
       item1.setOverDue(true);// this line of code is not necessesary but i'll leave it for good measure



        ArrayList<Items> item = new ArrayList<>();

        item.add(item1);
        item.add(item2);
        item.add(item3);
        item.add(item4);



      libReport.libraryList(item);
      libReport.AudioList(item);
      libReport.borrowedList(item);
      libReport.overDue(item);


    

}

}
