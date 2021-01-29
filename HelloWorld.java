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
    }
}