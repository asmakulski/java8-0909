import java.util.Optional;

public class CarsMain {

    public static void main(String[] args) {
        Car c1 = new Astra();
        Car c2 = new Starlet();

        print(c1);
        print(c2);


        Optional<Car> o1 = Optional.empty();
        if (o1.isPresent()) {
            System.out.println("Optional ma wartosc");
        } else {
            System.out.println("Optional pusty :(");
        }

        //o1.ifPresent(o -> CarsMain.print(o));
        o1.ifPresent(CarsMain::print);

        print(o1.orElseThrow(() -> new RuntimeException("no car in optional")));
    }

    public static void print(Car c) {
        System.out.println("Name: " + c.getName());
        System.out.println("Number of door: " + c.getNumOfDoor());
    }
}
