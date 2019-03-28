
package libsystem;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CheckOut {
     private Items  item;
    private Users user;
    private LocalDate fromDate;
    private LocalDate toDate;
    private LocalDate currentDate;
    private Double fine ;



   public void borrow()
   {

       getItem().setBorrowed(true);

   }
   public void chargeFine()
   {
       long difference = ChronoUnit.DAYS.between(toDate, currentDate);
        setFine(difference * getItem().getFinePerDay());

       getItem().setBorrowed(true);
       getItem().setOverDue(true);
   }






    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }


    private Items getItem() {
        return item;
    }

    public void setItem(Items item) {
        this.item = item;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }




    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }






    public Double getFine() {
        return fine;
    }

    private void setFine(Double fine) {
        this.fine = fine;
    }
}
