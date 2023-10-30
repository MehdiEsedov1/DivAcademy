import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //LocalDate

        LocalDate localDateNow = LocalDate.now(); // Bu hal hazırki zamanı verir .
        LocalDate localDateOf = LocalDate.of(2005, 6, 24); //Bu isə daxil etdiyimiz zamanı verir .

        System.out.println(localDateNow.getYear()); //Bu tarixin ilini verir .
        System.out.println(localDateNow.getMonth()); //Bu tarixin ayın verir .
        System.out.println(localDateNow.getDayOfMonth()); //Bu tarixin günün verir .

        System.out.println(localDateNow.plusYears(1)); //Verilen tarixin ilini artırır .
        System.out.println(localDateNow.plusMonths(2)); //Verilen tarixin aynını artırır .
        System.out.println(localDateNow.plusDays(3)); //Verilen tarixin gününü artırır .

        System.out.println(localDateOf.atTime(23, 59, 59)); //Verilən tarixə zaman əlavə edir .

        //LocalTime

        LocalTime localTimeNow = LocalTime.now(); //Hazırki saatı verir
        LocalTime localTimeOf = LocalTime.of(23, 50, 31); //Bu isə daxil etdiyimiz zamanı verir .

        System.out.println(localTimeNow.getHour()); //Verilən zamanın saatın verir .
        System.out.println(localTimeNow.getMinute());//Verilən zamanın dəqiqəsin verir .
        System.out.println(localTimeNow.getSecond());//Verilən zamanın saniyəsin verir .

        System.out.println(localTimeNow.plusHours(1)); //Verilən zamanın saatın artırır .
        System.out.println(localTimeNow.plusMinutes(2)); //Verilən zamanın dəqiqəsin artırır .
        System.out.println(localTimeNow.plusSeconds(3)); //Verilən zamanın saniyəsin artırır .

        System.out.println(localTimeOf.atDate(localDateOf)); //Verilən zamana tarix  əlavə edir .

        System.out.println(localTimeNow.withNano(0)); //with ilə hansı dəqiqliyə qədər zamanın veriləcəyini təyin edirik .

        //LocalDateTime
        //LocalDate və LocalTimeda olan metodlar burada da keçərlidir .
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        LocalDateTime localDateTimeOf0 = LocalDateTime.of(localDateNow, localTimeNow); //LocalDate ve LocalTime obyektin bura mənimsədə bilərik .
        LocalDateTime localDateTimeOf1 = LocalDateTime.of(2023, 12, 1, 23, 59, 31); //Bir-bir girə bilərik .

        //DateTimeFormatter

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy.MM-dd"); // Bu kod ilə tarixin hansı sıralama ilə və hansı simvollar ilə
        // yazılmalı olduğunu təyin edirik .

        System.out.println(dateTimeFormatter.format(localDateNow));

        //ZonedDateTime

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.systemDefault()); //Sistemin default məkanına görə zamanı deyir .

//      ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of()); Bu isə verdiyimiz id-ə uyğun olarağ ölkənin zamanını verir .

        System.out.println(zonedDateTime);

        //Period

        Period period = Period.between(localDateOf, localDateNow); // İki zaman arasındakı müddəti verir .
        System.out.println(period);

    }
}