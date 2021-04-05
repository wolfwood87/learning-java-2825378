import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }

    public static double calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
//        System.out.println("Your total meal price is " + result);
        return result;
    }

    public static void main(String[] args) {
//        int studentAge = 15;
//        double studentGPA = 3.45;
//
//        boolean hasPerfectAttendance = true;
//        String studentFirstName = "Kayla";
//        String studentLastName = "Hammon";
//        char studentFirstInitial = studentFirstName.charAt(0);
//        char studentLastInitial = studentLastName.charAt(0);
//
//        System.out.println(studentAge);
//        System.out.println(studentGPA);
//        System.out.println(studentFirstInitial);
//        System.out.println(studentLastInitial);
//        System.out.println(hasPerfectAttendance);
//        System.out.println(studentFirstName);
//        System.out.println(studentLastName);
//        System.out.println(studentFirstName + " " + studentLastName + "has a GPA of " + studentGPA);
//        System.out.println("What do you want to update it to?");
//        Scanner input = new Scanner(System.in);
//        studentGPA = input.nextDouble();
//        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);

//        System.out.println("Pick a number between 1 and 10");
//        Scanner scanner = new Scanner(System.in);
//        int inputtedNum = scanner.nextInt();
//
//        if (inputtedNum < 5) {
//            System.out.println("Enjoy the good luck a friend brings you");
//        } else {
//            System.out.println("Your shoe selection will make you very happy today.");
//        }
//        Scanner input = new Scanner(System.in);
//        boolean isOnRepeat = true;
//        while(isOnRepeat) {
//            System.out.println("Playing current song");
//            System.out.println("Would you like to take this song off of repeat? If so, answer yes");
//            String userInput = input.next();
//
//            if(userInput.equals("yes") || userInput.equals("Yes")) {
//                isOnRepeat = false;
//            }
//        }
//        System.out.println("Playing next song");
//        String question = "What is your favorite color?";
//        String choiceOne = "African swallow";
//        String choiceTwo = "Yellow";
//        String choiceThree = "Blue";
//
//        String correctAnswer = choiceTwo;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(question);
//        System.out.println(choiceOne);
//        System.out.println(choiceTwo);
//        System.out.println(choiceThree);
//        String guess = scanner.next();
//        if (guess.equals(correctAnswer.toLowerCase())) {
//            System.out.println("Congrats! You were correct!");
//        } else{
//            System.out.println("Sorry the correct answer was " + correctAnswer);
//        }

//        System.out.println("Let's calculate the area of a triangle");
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Please input the base of the triangle(in inches).");
//
//        double base = input.nextDouble();
//
//        while (base <= 0) {
//            System.out.println("That's invalid. Please input the base of the triangle (in inches)");
//            base = input.nextDouble();
//        }
//
//        System.out.println("Please input the height of the triangle(in inches).");
//        double height = input.nextDouble();
//        while (height <= 0) {
//            System.out.println("That's invalid. Please input the height of the triangle (in inches).");
//            height = input.nextDouble();
//        }
//        double area = (base * height) / 2;
//        System.out.println("The area is " + area);
//        System.out.println("Welcome to your new job");
//
//        announceDeveloperTeaTime();
//        System.out.println("Write code");
//        System.out.println("Review code");
//
//        announceDeveloperTeaTime();
//        System.out.println("Get promoted!");
//        calculateTotalMealPrice(15, .2, .08);
//        calculateTotalMealPrice(25, .18, .08);
        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .08);
        System.out.println(groupTotalMealPrice);

        double individualTotalMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualTotalMealPrice);
    }
}
