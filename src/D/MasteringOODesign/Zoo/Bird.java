package D.MasteringOODesign.Zoo;

/**
 * Created by VKurochkin on 2/20/2017.
 */
public class Bird extends Animal {
    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("flapping winds...");
    }
}
