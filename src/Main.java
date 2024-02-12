import java.time.DayOfWeek;
import java.time.OffsetDateTime;

public class Main {

    public static String dataString = "2023-03-01T13:00:00Z";

    public static void main(String[] args) {
        OffsetDateTime dataTime = OffsetDateTime.parse(dataString);

        Result result = getResult(dataTime);

        System.out.println("l'anno è: " + result.year());
        System.out.println("il mese è: " + result.month());
        System.out.println("il giorno del mese è: " + result.day());
        System.out.println("il giorno della settimana è: " + result.dayOfWeek());
    }

    static Result getResult(OffsetDateTime dataTime) {
        int year = dataTime.getYear();
        int month = dataTime.getMonthValue();
        int day = dataTime.getDayOfMonth();
        DayOfWeek dayOfWeek = dataTime.getDayOfWeek();
        Result result = new Result(year, month, day, dayOfWeek);
        return result;
    }

    record Result(int year, int month, int day, DayOfWeek dayOfWeek) {
    }
}