import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MathMain {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(32, 5, 43, 9, -4, 100, 2, 3);

        getResult(new MinOperation(), numbers);
        getResult(new MaxOperation(), numbers);

        MathOperation max = a -> Collections.max(a);

        getResult(list -> Collections.min(list), numbers);
        getResult(max, numbers);

        // to samo co z lambda powyzej
        getResult(new MathOperation() {
            @Override
            public Integer calculate(List<Integer> ints) {
                return Collections.min(ints);
            }
        }, numbers);
    }

    public static void getResult(MathOperation o, List<Integer> data) {
        Integer result = o.calculate(data);
        System.out.println("Wynik: " + result);
    }
}
