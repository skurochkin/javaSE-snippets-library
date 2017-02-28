package D.MasteringOODesign.Cars;

/**
 * Created by VKurochkin on 2/20/2017.
 */
public class App {

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle();
        Vehicle anotherCar = new Vehicle();

        myCar.accelerate();
        anotherCar.accelerate();
    }
}
