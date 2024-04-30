import com.animals.Elephant;
import com.zoo.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.createAnimal(new Elephant("mammals"));

        System.out.println("Animal Category :: "+ zoo.animals.getFirst().getAnimalCategory());

    }
}