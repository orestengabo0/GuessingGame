import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Guess random = new Guess();
        int randomNumber = random.generateRandomNum();
        Scanner scanner = new Scanner(System.in);
        byte trials = 0;
        boolean guessedCorrectly = false;

        while(trials < 9){
            System.out.print("Enter number: ");
            int guess = scanner.nextInt();
            if(guess > randomNumber){
                System.out.println("Incorrect! Number too high.");
                trials++;
            } else if (guess < randomNumber) {
                System.out.println("Incorrect! Number too low.");
                trials++;
            }
            else {
                guessedCorrectly = true;
                System.out.println("Correct! You finally got me.......");
            }
        }
        if(!guessedCorrectly){
            System.out.println("Sorry! Your trial is over! The correct guess was: " + randomNumber);
        }
        scanner.close();
    }
}