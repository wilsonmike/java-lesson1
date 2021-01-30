import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Lesson One Console App");
        // data types
        int studentAge = 17;
        double gpa = 3.8;
        char firstInitial = 'm';
        char lastInitial = 'w';
        boolean perfectAttendance = true;
        System.out.println(studentAge);
        String newString = "java string ref";
        System.out.println(newString);
        char stringCharacter = newString.charAt(0);
        System.out.println(stringCharacter);
        System.out.println(newString + " " + firstInitial);
        System.out.println("What is your GPA?");
        Scanner input = new Scanner(System.in);
        gpa = input.nextDouble();
        System.out.println("Your gpa is " + gpa);
        // start of lesson 3
        // relational operators
        // >, < , == , >= , <=, and !=
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        int inputtedNum = scanner.nextInt();
        if (inputtedNum < 5) {
            System.out.println("You won 1,000 shares of $GME");
        } else {
            System.out.println("You picked the wrong number, you are short 1,000 shares of $GME");
        }
        // while loops in java
        Scanner song = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
            String userInput = input.next();
            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
        // multiple choice code block
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "earth";
        String choiceTwo = "jupiter";
        String choiceThree = "saturn";

        String correctAnswer = choiceTwo;
        System.out.println(question);
        System.out.println("Choose one of the following... " + choiceOne + ' ' + choiceTwo + ' ' + choiceThree);
        Scanner answer = new Scanner(System.in);
        String userAnswer = answer.next();
        if (correctAnswer.equals(userAnswer.toLowerCase())) {
            System.out.println("Congrats, you got it right!");
        } else {
            System.out.println("Sorry you got this one wrong :( The correct answer is " + correctAnswer);
        }

    }
}