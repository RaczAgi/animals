public class Chicken implements Animal{
    int eggPerSec;
    double weight;

    public Chicken(int eggPerSec, double weight) {
        this.eggPerSec = eggPerSec;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "eggPerSec=" + eggPerSec +
                ", weight=" + weight +
                '}';
    }
}
