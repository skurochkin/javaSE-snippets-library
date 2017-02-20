package D.MasteringOODesign.Zoo;

/**
 * Created by VKurochkin on 2/20/2017.
 */
public class Fish extends Animal {

    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("swimming...");
    }

    public void swim(){
        System.out.println("swim...");
    }
}
