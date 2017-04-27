/**
 * Created by Dmytro on 27.04.2017.
 */
public class FreightCar extends ElectroCar {
    int loadCapacity;

    public FreightCar() {

    }

    public FreightCar(String nameCar, int currentSpeed, int weight, int numberOfPassengers, int numberWheel, int maxLoadCapacity) {
        super(nameCar, currentSpeed, weight, numberOfPassengers, numberWheel);
        this.loadCapacity = maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "FreightCar{" +
                "nameCar=" + nameCar +
                ", currentSpeed=" + currentSpeed + "km/h" +
                ", weight=" + weight + "kilogram" +
                ", numberOfPassengers=" + numberOfPassengers +
                ", numberWheel=" + numberWheel +
                ", loadCapacity=" + loadCapacity + "kilogram" +
                '}';
    }
}
