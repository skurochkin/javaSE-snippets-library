package D.MasteringOODesign.Zoo;

/**
 * Created by VKurochkin on 2/20/2017.
 */
public class Zoo {

    public static void main(String[] args) {
       Animal sparrow1 = new Sparrow(12, "M", 23);
        sparrow1.move();

        Animal fish1 = new Fish(2, "F", 13);
        fish1.move();

        moveAnimals(fish1);

        moveAnimals(sparrow1);
    }

    public static void moveAnimals(Animal animal){
        animal.move();
    }
}
