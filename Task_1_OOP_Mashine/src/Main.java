/**
 * Created by Dmytro on 27.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Trolleybus trolleybus = new Trolleybus("Skoda",30,3000,70,4,15);
        FreightCar freightCar = new FreightCar("Caterpillar",70,5000,3,6,5000);
        System.out.println(trolleybus);
        System.out.println(freightCar);

    }
}
