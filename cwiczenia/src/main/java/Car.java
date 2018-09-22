public interface Car {

    String getName();

    default int getNumOfDoor() {
        return 5;
    }
}
