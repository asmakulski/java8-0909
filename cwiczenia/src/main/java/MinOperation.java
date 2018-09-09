import java.util.Collections;
import java.util.List;

public class MinOperation implements MathOperation {

    @Override
    public Integer calculate(List<Integer> ints) {
        //return Collections.min(ints);

//        Collections.sort(ints);
//        return ints.get(0);

        int temp = Integer.MAX_VALUE;
        for (int n : ints) {
            if (n < temp) {
                temp = n;
            }
        }

        return temp;
    }
}
