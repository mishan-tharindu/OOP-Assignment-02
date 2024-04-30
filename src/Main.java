import com.animals.Elephant;
import com.zoo.Zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.createAnimal(new Elephant("walker"));
        zoo.createAnimal(new Elephant("walker"));
        zoo.createAnimal(new Elephant("walker"));

//        System.out.println("Animal Category :: "+ zoo.animals.getFirst().getAnimalCategory());
        zoo.sleepAllAnimals();
        zoo.wakeAllAnimals();
        zoo.feedAllAnimals();
        zoo.drinkAllAnimals();


    }
}