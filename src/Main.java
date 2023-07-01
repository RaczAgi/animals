
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = FileReader.fileReadHandler("dog.txt");
        List<Dog> dogs = new ArrayList<>();

        for (var line : lines) {

            String[] linesAsArray = line.split(",");

            dogs.add(new Dog(linesAsArray[0],
                    Integer.parseInt(linesAsArray[1]),
                    linesAsArray[2]));
        }
        for (var actual:dogs) {
            System.out.println(actual);
        }
        List<String> linesofChicken = FileReader.fileReadHandler("chicken.txt");
        List<Dog> chicken = new ArrayList<>();

        for (var line : linesofChicken) {

            String[] linesAsChickenArray = line.split(",");

           // chicken.add(new Chicken(Integer.parseInt(linesAsChickenArray[0]),
            //        Double.parseDouble(linesAsChickenArray[1])));

        }
        for (var actual:chicken) {
            System.out.println(actual);
        }

        List<String> linesAnimal = FileReader.fileReadHandler("res/vegyes.txt");
        List<Animal> animals = new ArrayList<>();

        for (var line : linesAnimal){
            String[] linesAnimalArray = line.split(",");
            if (linesAnimalArray[0].equals("csirke")){
                animals.add(new Chicken(Integer.parseInt(linesAnimalArray[1]),
                        Double.parseDouble(linesAnimalArray[2])));
            }
            if (linesAnimalArray[0].equals("kutya")){
                animals.add(new Dog(
                        linesAnimalArray[1],
                        Integer.parseInt(linesAnimalArray[2]),
                        linesAnimalArray[3]));
            }
            for (var actual:animals) {
                System.out.println(actual);

            }
        }

    }
}
