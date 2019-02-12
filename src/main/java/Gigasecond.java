import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    public LocalDateTime dateTime;
    public LocalDateTime dateTimePlusGigasecond;

    Gigasecond(LocalDate birthDate) {
      dateTime = LocalDateTime.of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDayOfMonth(), 00, 00, 00);
    }

    Gigasecond(LocalDateTime birthDateTime) {
      dateTime = birthDateTime;
    }

    LocalDateTime getDateTime() {
      // return dateTimePlusGigasecond = dateTime.plusDays(11574).plusHours(1).plusMinutes(46).plusSeconds(40);
      return dateTimePlusGigasecond = dateTime.plusSeconds(1000000000);
    }

}
