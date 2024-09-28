import java.util.Random;

public class randNumber {

    public int getRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);

        return randomNumber;


    }
}
