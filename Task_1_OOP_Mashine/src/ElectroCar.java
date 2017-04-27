/**
 * Created by Dmytro on 25.04.2017.
 */
public class ElectroCar extends Machine {
    int currentSpeed;
    int weight;
    int numberOfPassengers;
    int numberWheel;

    public ElectroCar() {

    }

    public ElectroCar(String nameCar, int currentSpeed, int weight, int numberOfPassengers, int numberWheel) {
        super(nameCar);
        this.currentSpeed = currentSpeed;
        this.weight = weight;
        this.numberOfPassengers = numberOfPassengers;
        this.numberWheel = numberWheel;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public int getNumberOfPassengers() {
        return this.numberOfPassengers;
    }

    public int getNumberWheel() {
        return this.numberWheel;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setNumberWheel(int numberWheel) {
        this.numberWheel = numberWheel;
    }


    @Override
    public String toString() {
        return "ElectroCar{" +
                "nameCar=" + nameCar +
                ", currentSpeed=" + currentSpeed +
                ", weight=" + weight +
                ", numberOfPassengers=" + numberOfPassengers +
                ", numberWheel=" + numberWheel +
                '}';
    }
}
