import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    public LocalDateTime dateTime;
    public static final int GIGASECOND = 1000000000;

    Gigasecond(LocalDate birthDate) {
      dateTime = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
      dateTime = birthDateTime;
    }

    LocalDateTime getDateTime() {
      return dateTime.plusSeconds(GIGASECOND);
    }

}
