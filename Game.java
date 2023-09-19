import java.util.*;
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        char playAgain = 'y';
        int totalAttempts = 0;
        int totalRounds = 0;
        
        do {
            totalRounds+=1;
            int n = r.nextInt(100)+1;
            int maxAttempts = 10;
            int attempts = 0;
            
            System.out.printf("Round %d\n", totalRounds);
            System.out.printf("I have generated a number between 1 and 100");
            System.out.println("guess what it is?");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;
                
                if (guess == n) {
                    System.out.printf("Congratulations! You've guessed the number "+n+" in "+attempts+" attempts ");
                    totalAttempts += attempts;
                    break;
                } else if (guess < n) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }
            
            if (attempts == maxAttempts) {
                System.out.printf("Oops! You've reached the maximum number of attempts. The correct number was "+n);
            }
            
            System.out.print("Do you want to play again? (y/n): ");
            playAgain=sc.next().charAt(0);
        }while(playAgain=='y');
        
        sc.close();
        System.out.println("Thank you for playing!");
        
    }
}