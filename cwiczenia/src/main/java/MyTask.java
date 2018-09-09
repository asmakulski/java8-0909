public class MyTask implements Task {

    @Override
    public void doWork() {
        System.out.println("Hello from: " + this.getClass());
    }
}
