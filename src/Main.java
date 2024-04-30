import com.animals.Beaver;
import com.animals.Duck;
import com.animals.Elephant;
import com.zoo.Zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.createAnimal(new Elephant("Elephant",new String[]{"Walker"}));
        zoo.createAnimal(new Beaver("Beaver",new String[]{"Walker", "Swimmer"}));
        zoo.createAnimal(new Duck("Duck", new String[]{"Walker", "Swimmer", "Flyer"}));

//        System.out.println("Animal Category :: "+ zoo.animals.get(1).getAnimalCategoryArray().toString());
        zoo.sleepAllAnimals();
        zoo.wakeAllAnimals();
        zoo.feedAllAnimals();
        zoo.drinkAllAnimals();

        zoo.getAnimalCategory();


    }
}