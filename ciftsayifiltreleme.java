import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ciftsayifiltreleme {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        HashSet<Integer> evenNumbers = new HashSet<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(20);
            randomNumbers.add(randomNumber);
            if (randomNumber % 2 == 0) {
                evenNumbers.add(randomNumber);
            } else {
                oddNumbers.add(randomNumber);
            }
        }

        System.out.println("Random numbers: " + randomNumbers);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}