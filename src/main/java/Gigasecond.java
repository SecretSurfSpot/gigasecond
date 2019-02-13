import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    public LocalDateTime dateTime;
    public LocalDateTime dateTimePlusGigasecond;
    public static final int GIGASECOND = 1000000000;

    Gigasecond(LocalDate birthDate) {
      dateTime = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
      dateTime = birthDateTime;
    }

    LocalDateTime getDateTime() {
      // return dateTimePlusGigasecond = dateTime.plusDays(11574).plusHours(1).plusMinutes(46).plusSeconds(40);
      return dateTimePlusGigasecond = dateTime.plusSeconds(GIGASECOND);
    }

}
