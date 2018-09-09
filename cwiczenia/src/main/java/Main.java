import java.util.Collections;
import java.util.Comparator;

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

        carryOutWork(new MyRunnable());

        carryOutWork(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from Runnable");
            }
        });

        carryOutWork(() -> System.out.println("Hello from lambda"));

        carryOutWork(() -> {
            System.out.println("Hello from lambda 2");
            System.out.println("Hello again!!!");
        });
    }

    public static void carryOutWork(Runnable task) {
        System.out.println("before");

        task.run();

        System.out.println("after");
    }
}
