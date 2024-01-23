import java.util.Random;

public class DieSimulator {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(6) + 1;
        System.out.println("Welcome to Die Simulator");
        System.out.println(randomNumber);
    }
}