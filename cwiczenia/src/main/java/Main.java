import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
//        carryOutWork(new MyTask());
//
//        carryOutWork(new Task() {
//            @Override
//            public void doWork() {
//                System.out.println("Hello from: " + this.getClass());
//            }
//        });

//        carryOutWork(new MyRunnable());
//
//        carryOutWork(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hello from Runnable");
//            }
//        });
//
//        carryOutWork(() -> System.out.println("Hello from lambda"));
//
//        carryOutWork(() -> {
//            System.out.println("Hello from lambda 2");
//            System.out.println("Hello again!!!");
//        });

        List<String> list = new ArrayList<>();
        list.add("Niedziela");
        list.add("     ");
        list.add("");
        list.add("Super String");

        //list.removeIf(s -> s.isEmpty());

        Predicate<String> p = s -> {
            if (s != null) {
                return s.trim().isEmpty();
            }

            return true;
        };

        list.removeIf(p);

        //list.removeIf(s -> (s != null) ? s.trim().isEmpty() : true);

        Consumer<String> c = s -> System.out.println(s.toUpperCase());
        list.forEach(c);
//
//        for (String e : list) {
//            System.out.println(e.toUpperCase());
//        }

        //printList(list);

        // ["Asia", "Ala"] -> [4, 3]

        Function<List<String>, List<Integer>> f = input -> {
            List<Integer> result = new ArrayList<>();
            input.forEach(s -> result.add(s.length()));
            return result;
        };

        System.out.println(list);
        System.out.println(f.apply(list));

        list.forEach(s -> System.out.println(s.toUpperCase()));
        list.forEach(System.out::println);
    }

    public static void printList(List<String> list) {
        for (String s : list) {
            System.out.println("\'" + s + "\'");
        }
    }

    public static void carryOutWork(Runnable task) {
        System.out.println("before");

        task.run();

        System.out.println("after");
    }
}
