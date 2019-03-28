
package libsystem;

import java.util.ArrayList;
public class Items {
    
    private String Title;

    private ArrayList<BookType1> books1 = new ArrayList<>();
    private ArrayList<BookType2> books2 = new ArrayList<>();
    private ArrayList<Author>authors = new ArrayList<>();

    private boolean isBorrowed;
    private boolean overDue;
    private double finePerDay;


    private ArrayList<CheckOut> checkouts = new ArrayList<>();


    String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }


    public ArrayList<BookType2> getBooks2() {
        return books2;
    }

    // public void setBooks2(ArrayList<BookType2> books2) {
    //  this.books2 = books2;
    // }

    public ArrayList<BookType1> getBooks1() {
        return books1;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public ArrayList<CheckOut> getCheckouts() {
        return checkouts;
    }


    // public void setBooks1(ArrayList<BookType1> books1) {
    // this.books1 = books1;
    //}

    public boolean isOverDue() {
        return overDue;
    }

    public void setOverDue(boolean overDue) {
        this.overDue = overDue;
    }


    public double getFinePerDay() {
        return finePerDay;
    }

    public void setFinePerDay(double finePerDay) {
        this.finePerDay = finePerDay;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }
}
