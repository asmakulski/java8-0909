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
    }

    public static void carryOutWork(Task task) {
        System.out.println("before");

        task.doWork();

        System.out.println("after");
    }
}
