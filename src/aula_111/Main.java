package aula_111;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-11-17");
        LocalDateTime d05 = LocalDateTime.parse("2025-11-17T14:25:00");
        Instant d06 = Instant.parse("2025-11-17T14:25:00Z");
        Instant d07 = Instant.parse("2025-11-17T14:25:00-03:00");

        LocalDate d08 = LocalDate.parse("17/11/2025", fmt1);
        LocalDate d09 = LocalDate.parse("17/11/2025 14:30", fmt2);

        LocalDate d10 = LocalDate.of(2025, 11, 20);
        LocalDateTime d11 = LocalDateTime.of(2025, 11, 20, 14, 37);

        System.out.println("DT01: " + d01);
        System.out.println("DT02: " + d02);
        System.out.println("DT03: " + d03);
        System.out.println("DT04: " + d04);
        System.out.println("DT05: " + d05);
        System.out.println("DT06: " + d06);
        System.out.println("DT07: " + d07);
        System.out.println("DT08: " + d08);
        System.out.println("DT09: " + d09);
        System.out.println("DT10: " + d10);
        System.out.println("DT11: " + d11);
    }
}
