import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    public LocalDateTime dateTime;
    public LocalDateTime dateTimePlusGigasecond;

    Gigasecond(LocalDate birthDate) {
      dateTime = LocalDateTime.of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDayOfMonth(), 00, 00, 00);
      System.out.println("111 dateTime is: " + dateTime);
    }

    Gigasecond(LocalDateTime birthDateTime) {
      dateTime = birthDateTime;
      System.out.println("222 dateTime is: " + dateTime);

    }

    LocalDateTime getDateTime() {
      dateTimePlusGigasecond = dateTime.plusDays(11574).plusHours(1).plusMinutes(46).plusSeconds(40);
      System.out.println("333 dateTimePlusGigasecond plus is: " + dateTimePlusGigasecond);
      return dateTimePlusGigasecond;
    }

}
