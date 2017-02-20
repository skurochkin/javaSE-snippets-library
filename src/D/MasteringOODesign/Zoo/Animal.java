package D.MasteringOODesign.Zoo;

/**
 * Created by VKurochkin on 2/20/2017.
 */
public abstract class Animal {

    int age;
    String gender;
    int weightInLbs;

    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public void talk(){
        System.out.println("I'm a " + age + " yars old");
        System.out.println("I'm a " + gender);
        System.out.println("I'm a " + weightInLbs + " lbs");
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void sleep(){
        System.out.println("sleeeping...");
    }

    public abstract void move();
}
