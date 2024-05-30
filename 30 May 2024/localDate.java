import java.time.LocalDate;
public class localDate {
    public static  void main (String[] args){
        LocalDate date = LocalDate.now();
        System.out.println();
        System.out.println( "Today :"+date);
        LocalDate yesterDay = date.minusDays(1);
        LocalDate tommorrow = date.plusDays(1);
        System.out.println("Yesterday Date :"+yesterDay);
        System.out.println("Tommorrow: "+tommorrow);
        //find leapyear
        System.out.println("Leap year :"+date.isLeapYear());
        //parse
        String today = "2024-05-30";
        LocalDate date1 = LocalDate.parse(today);
        System.out.println(date1);
    }
    
}
