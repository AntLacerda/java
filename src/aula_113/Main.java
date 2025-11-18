package aula_113;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2025-11-17");
        LocalDateTime d05 = LocalDateTime.parse("2025-11-17T14:25:00");
        Instant d06 = Instant.parse("2025-11-17T14:25:00Z");

//        for (String s : ZoneId.getAvailableZoneIds()) {
//            System.out.println(s);
//        }

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("R01: " + r1);
        System.out.println("R02: " + r2);
        System.out.println("R03: " + r3);
        System.out.println("R04: " + r4);

        System.out.println("D04 dia: " + d04.getDayOfMonth());
        System.out.println("D04 mes: " + d04.getMonthValue());
        System.out.println("D04 ano: " + d04.getYear());

        System.out.println("D05 hora: " + d05.getHour());
        System.out.println("D05 minutos: " + d05.getMinute());
    }
}
