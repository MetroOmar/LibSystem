
package libsystem;

import java.util.ArrayList;
public class libReport {
    public static void libraryList(ArrayList<Items> items) {
        System.out.println("=======================");
        System.out.println("LIBRARY CATALOGUE");
        System.out.println("========================");

        for (Items item : items) {
            String name = item.getTitle();

            System.out.println("[Title]: " + name);

            ArrayList<Author> a1 =  item.getAuthors();
            for(Author a: a1)
            {
                String author = a.getAuthorName();

                System.out.println("[Author]: " + author);
            }


            ArrayList<BookType1> bk1 = item.getBooks1();
            for (BookType1 bk : bk1) {
                String type = bk.getType();
                System.out.println("[Type]: " + type);
                System.out.println(" ");

            }
            ArrayList<BookType2> bk2 = item.getBooks2();
            for (BookType2 bks : bk2) {
                String type2 = bks.getType2();
                System.out.println("[type]: " + type2);
            }

        }
            System.out.println(" ");


    }

    public static void AudioList(ArrayList<Items> items) {
        System.out.println("LIST OF AUDIO BOOKS");
        System.out.println("==================");
        for (Items item : items) {
            if (item.getTitle().equals("Quiting a habit in 21 days")) {
                String name = item.getTitle();

                ArrayList<BookType2> bk = item.getBooks2();
                for (BookType2 bks : bk) {
                    String length = bks.getDuration();
                    System.out.println("[title]:" + name);
                    ArrayList<Author> a2 =  item.getAuthors();
                    for(Author a: a2)
                    {
                        String author = a.getAuthorName();

                        System.out.println("[Author]: " + author);
                    }
                    System.out.println("[Duration]: " + length);
                }
                 System.out.println(" ");
            }

        }


    }
    public static void borrowedList(ArrayList<Items>items)
    {
        System.out.println("======================");
        System.out.println("LIST OF BORROWED BOOKS");
        System.out.println("=======================");
             for(Items item: items){
             if(item.isBorrowed()!=false)
       {String name = item.getTitle();
    System.out.println("[Title]: " + name);
         ArrayList<CheckOut>checks = item.getCheckouts();
         for(CheckOut checkout:checks)
         {
             String taken = checkout.getFromDate().toString();
             String due = checkout.getToDate().toString();
             String user1 = checkout.getUser().getUserName();
             System.out.println("[Borrow Date]: " + taken);
             System.out.println("[Due date]: " + due);
             System.out.println("[Borrowed by]: " + user1);
             System.out.println();

         }
      }



}
}
    public static  void overDue(ArrayList<Items>items)
    {
        System.out.println("=======================");
        System.out.println(" LIST OF OVER DUE ITEMS");
        System.out.println("=======================");
        for(Items item: items)
        {
            if(item.isBorrowed()!= false &&item.isOverDue()!= false)
            {

                    String name = item.getTitle();
                    System.out.println("[Title]: " + name);
                 ArrayList<CheckOut> checks = item.getCheckouts();
                    for(CheckOut checkout:checks) {
                        String taken = checkout.getFromDate().toString();
                        String due = checkout.getToDate().toString();
                        String User = checkout.getUser().getUserName();
                        double fine = checkout.getFine();
                        System.out.println("[Borrow date]: " + taken);
                        System.out.println("[Due date]: " + due);
                        System.out.println("[Borrowed by]: " + User);
                        System.out.println("[fine] Kshs " + fine);


                    }
                }

            }
        }
}
