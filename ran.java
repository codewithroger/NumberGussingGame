import java.util.Scanner;

public class ran {
    public static void main(String[] args) {
        int target = (int) (Math.random() * 100) + 1;
        int remaining = 10;
        int total = 0;
            //yogesh Hitnalli
        //public account
       // chanfges
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");
        // tejas
        while (remaining > 0) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            scanner.nextLine(); 
            //ashu
//heyy...
            //thud 
            remaining--;
            total++;
//ashutosh 
            //bhaskarhhhhhhh
            if (guess == target) {
                System.out.println("Congratulations! You guessed the correct number!");
                System.out.println("Total guesses made: " + total);
                break;
            } else if (remaining == 0) {
                System.out.println("Game Over! You ran out of guesses. The correct number was " + target + ".");
                System.out.println("Total guesses made: " + total);
            } else if (guess < target) {
                System.out.println(" higher number.");
            } else {
                System.out.println(" lower number.");
            }
        }
    //frbfhsfdbsd sdghgdsffygu f ui

        scanner.close();
    }
}
//end of code
