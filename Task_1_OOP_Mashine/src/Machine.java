import intefaces.Run;

/**
 * Created by Dmytro on 25.04.2017.
 */
abstract class Machine implements Run {
    final int MinSpeed = 0;
    final int MaxSpeed = 300;
    final int MinNamberOfPassengers = 1;
    final int MaxNamberOfPassengers = 50;
    String nameCar;

    public Machine(){
    }

    public Machine(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public String getName(){
        return this.nameCar;
    }

}
