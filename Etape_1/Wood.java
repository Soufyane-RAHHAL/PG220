import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public abstract class Wood implements IValidate{
    int id;
    int number;
    String date;
    double price;
    Dimension dimension;
    Wood(int id, int number,String date, double price,Dimension dimension) {
        this.id = id;
        this.number = number;
        this.date = date;
        this.price = price;
        this.dimension = dimension;
    }


    @Override
    public boolean isValid(Object o) {
      //Date
      String DeadlineText = ((Wood)o).date;
      DateTimeFormatter formatterDeadline = DateTimeFormatter.ofPattern("dd.MM.yy");
      LocalDate Deadline = LocalDate.parse(DeadlineText, formatterDeadline);
      //System.out.println("Deadline: " + Deadline);

      //currentDate
      LocalDate currentDate = LocalDate.now();
      //System.out.println("currentDate: " + currentDate);


    return Deadline.isAfter(currentDate);
    //return true;
    }
}
