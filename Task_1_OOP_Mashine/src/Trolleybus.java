/**
 * Created by Dmytro on 27.04.2017.
 */
public class Trolleybus extends ElectroCar {

    int numberOfLapsADay;

    public Trolleybus() {

    }

    public Trolleybus(String nameCar, int currentSpeed, int weight, int numberOfPassengers, int numberWheel, int numberOfLapsADay) {
        super(nameCar, currentSpeed, weight, numberOfPassengers, numberWheel);
        this.numberOfLapsADay = numberOfLapsADay;
    }

    @Override
    public String toString() {
        return "Trolleybus{" +
                "nameCar=" + nameCar +
                ", currentSpeed=" + currentSpeed + "km/h" +
                ", weight=" + weight + "kilogram" +
                ", numberOfPassengers=" + numberOfPassengers +
                ", numberWheel=" + numberWheel +
                ", numberOfLapsADay=" + numberOfLapsADay +
                '}';
    }
}
