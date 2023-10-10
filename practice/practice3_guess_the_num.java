import java.util.Random;
import java.util.Scanner;

class Num {
    private int no;
    private int guess;
    private Random rand = new Random();
    private Scanner inp;

    public Num(Scanner po) {
        this.inp = po;
    }

    public void newNo() {
        this.no = rand.nextInt(50);
    }

    public void takeInput() {
        System.err.print("Guess the number: ");
        guess = inp.nextInt();

    }

    public void showAnswer() {
        System.out.println("The correct answer is: " + this.no);
        System.out.println("Better luck next time!!");
    }

    public boolean checkAnswer() {
        if (guess < no) {
            System.out.println("The number is greater than " + this.guess);
            return false;
        }

        else if (guess > no) {
            System.out.println("The number is smaller than " + this.guess);
            return false;
        }

        else {
            System.out.println("You guessed correct!!");
            return true;
        }
    }
}

public class practice3_guess_the_num {
    public static void main(String[] args) {

        Scanner inp2 = new Scanner(System.in);
        Num num = new Num(inp2);

        System.out.println("GUESS THE NUMBER!!");
        System.out.println("You have 5 tries");
        // num.showAnswer();
        num.newNo();

        for (int i = 0; i != 5; i++) {
            num.takeInput();
            boolean correct = num.checkAnswer();
            if (correct) {
                break;
            }

            if (i == 4) {
                num.showAnswer();
            }
        }

    }
}