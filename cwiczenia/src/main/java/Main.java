import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        carryOutWork(new MyTask());

        carryOutWork(new Task() {
            @Override
            public void doWork() {
                System.out.println("Hello from: " + this.getClass());
            }
        });

    carryOutWork(
            () -> System.out.println("Hello from lambda")
    );

    carryOutWork(() -> {
            System.out.println("Hello from lambda 2");
            System.out.println("Hello again");
        });
    }

    public static void carryOutWork(Task task) {
        System.out.println("before");

        task.doWork();

        System.out.println("after");
    }

}
