import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private LocalDateTime dateTime;
    private static final int GIGASECOND = 1000000000;

    Gigasecond(LocalDate birthDate) {
      this(birthDate.atStartOfDay());
      // dateTime = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
      dateTime = birthDateTime.plusSeconds(GIGASECOND);
    }

    LocalDateTime getDateTime() {
      return dateTime;
    }
}
