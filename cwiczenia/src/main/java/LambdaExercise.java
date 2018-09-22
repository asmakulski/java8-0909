import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExercise {


    public static void main(String[] args) {

        List<String> s = Arrays.asList("Ela",
            "Sandra",
            "Marek",
            "Adam",
            "Grzesiek");

        List<Integer> i = Arrays.asList(5, 7, 2, 3, 9);

        List<ExchangeRate> rates = Arrays.asList(
            new ExchangeRate("USD", "PLN", new BigDecimal("3.67"), LocalDate.now())
        );

        // Predicate

        // liczba podzielna przez
        Predicate<Integer> p = num -> (num % 2 == 0);
//        System.out.println(p.test(3));
//        System.out.println(p.test(12));

        // czy string jest dluzsze niz 5 znakow
        Predicate<String> p2 = o -> { return o.length() > 5; };
//        System.out.println(p2.test("Ania"));
//        System.out.println(p2.test("Bartlomiej"));

        // czy podany obiekt dotyczy pary USD -> GBP
        Predicate<ExchangeRate> p3 = o -> {
            return o.getFrom().equals("USD") && o.getTo().equals("GBP");
        };
//        System.out.println(p3.test(new ExchangeRate("USD", "GBP", null, null)));
//        System.out.println(p3.test(new ExchangeRate("GBP", "USD", null, null)));

        // Supplier

        // losowa liczba
        Supplier<Integer> randInt = () -> new Random().nextInt();
        //System.out.println(randInt.get());

        // supplier ktory dostarczy ExchangeRate
        Supplier<ExchangeRate> ser = () -> new ExchangeRate("PLN",
            "EUR", new BigDecimal("3.02"), LocalDate.now());
        //System.out.println(ser.get());

        // Function

        // pobiera int, zwraca jego kwadrat
        Function<Integer, Integer> f1 = o -> o*o;
//        System.out.println(f1.apply(13));

        // pobiera string, zwraca jego upperCase
//        Function<String, String> f2 = o -> o.toUpperCase();
        Function<String, String> f2 = String::toUpperCase;
//        System.out.println(f2.apply("Kuba"));

        // pobiera string, zwraca jego dlugosc
//        Function<String, Integer> f3 = o -> o.length();
        Function<String, Integer> f3 = String::length;
        System.out.println(f3.apply("Pikachu"));

        // pobiera exchange rate, zwraca exchange rate w druga strone
        Function<ExchangeRate, ExchangeRate> f4 = we ->
            new ExchangeRate(we.getTo(), we.getFrom(),
                new BigDecimal(1.0).setScale(2).divide(we.getRate(), BigDecimal.ROUND_HALF_DOWN).setScale(2, RoundingMode.DOWN),
                we.getDate());

        ExchangeRate exchangeRate = new ExchangeRate(
            "EUR", "PLN", new BigDecimal("4.25"), LocalDate.now());
        System.out.println(exchangeRate);
        System.out.println(f4.apply(exchangeRate));
    }
}


class ExchangeRate {

    private String from;

    private String to;

    private BigDecimal rate;

    private LocalDate date;

    public ExchangeRate() {
    }

    public ExchangeRate(String from, String to, BigDecimal rate, LocalDate date) {
        this.from = from;
        this.to = to;
        this.rate = rate;
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ExchangeRate{");
        sb.append("from='").append(from).append('\'');
        sb.append(", to='").append(to).append('\'');
        sb.append(", rate=").append(rate);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}