import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MathMain {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(32, 5, 43, 9, -4, 100, 2, 3);

        //getResult(new MinOperation(), numbers);
        //getResult(new MaxOperation(), numbers);

        MathOperation max = a -> Collections.max(a);

        getResult(list -> Collections.min(list),
            i -> System.out.println("Wynik (min): " + i),
            numbers);

        getResult(Collections::max,
            i -> System.out.println("Wynik (max*2): " + i*2),
            numbers);
        //getResult(max, numbers);


        List<String> a = Arrays.asList("a", "b", "c");

        List<String> b = new ArrayList<>();
        List<String> c = new ArrayList<>();

        a.forEach(n -> b.add(n));
        a.forEach(b::add);

        a.forEach(n -> staticMethod(n));
        a.forEach(MathMain::staticMethod);
    }

    public static void staticMethod(String s) {
        System.out.println(s);
    }

    public static void getResult(Function<List<Integer>, Integer> o,
        Consumer<Integer> c,
        List<Integer> data) {
        Integer result = o.apply(data);
        c.accept(result);
    }
}
