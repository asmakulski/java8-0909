import static java.time.temporal.ChronoUnit.HOURS;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;

public class DateTimeMain {

    public static void main(String[] args) {

//        LocalDate ld = LocalDate.of(2018, 2, 14);
//        System.out.println("Day: " + ld.getDayOfMonth());
//        System.out.println("Day of Week: " + ld.getDayOfWeek());
//        System.out.println("Month: " + ld.getMonth());
//        System.out.println("Year: " + ld.getYear());
//        System.out.println(ld);
//        System.out.println(LocalDate.parse("2019-09-22"));

//        LocalTime lt = LocalTime.of(7, 15);
//        System.out.println("Hour: " + lt.getHour());
//        System.out.println("Minute: " + lt.getMinute());
//        System.out.println("Second: " + lt.getSecond());
//        System.out.println(lt);
//
//        System.out.println(LocalTime.parse("23:59:12"));
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmm");
//        System.out.println(lt.format(dtf));

//        LocalDateTime ldt = LocalDateTime.of(2018,
//            01, 19, 8, 0);
//        System.out.println(ldt.toLocalDate());
//        System.out.println(ldt.toLocalTime());
//        System.out.println(ldt);

//        LocalDateTime ldt = LocalDateTime.now();
//        ZoneId zoneId = ZoneId.of("Australia/Darwin");
//        ZonedDateTime zdt = ldt.atZone(zoneId);
//        System.out.println(zdt);

        System.out.println(Instant.now());

        Duration d = Duration.of(8, HOURS);
        System.out.println(d);

        System.out.println(LocalTime.now().plus(d));

        LocalDate now = LocalDate.now();
        System.out.println(now.with(TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY)));
    }
}
