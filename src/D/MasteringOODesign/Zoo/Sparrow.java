package D.MasteringOODesign.Zoo;

/**
 * Created by VKurochkin on 2/20/2017.
 */
public class Sparrow extends Bird implements Flyable{
    @Override
    public void fly(){
            System.out.println("fly...");
    }


    public Sparrow(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }
}
