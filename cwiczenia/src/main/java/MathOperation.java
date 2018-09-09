import java.util.List;

public interface MathOperation {

    //  (List<Integer> ints) -> Collections.min(ints)
    //  ints -> Collections.min(ints)
    //  ints -> { return Collections.min(ints); }
    // (List<Integer> ints) -> Collections.min(ints)

    Integer calculate(List<Integer> ints);
}
