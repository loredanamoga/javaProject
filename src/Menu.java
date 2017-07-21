/**
 * Created by loredanamoga on 7/18/2017.
 */
public class Menu {

    ReadInput readInput = new ReadInput();
    Control control = new Control();


    public void printOptions() {
        System.out.println("The options are: \n" +
                "1. Sum of two numbers\n" +
                "2. Convert temperature from F to C\n" +
                "3. Print the greatest number\n" +
                "4. Given a text input, if it is \'Evozon\', then print \'Learning text comparison\'. If not, print \'Got to try some more\'\n" +
                "5. Given a number, if it\'+s equal to or higher than 2 and equal to or lower than 8, print the number\n" +
                "6. Given a text input and a number input, if the text is equal to \'Evozon\' AND the number is equal to or lower\n" +
                "than 3, print the text and the number. If the text is not \'Evozon\' AND the number is equal to or higher than 4, print\n" +
                "the number and the text, in this order\n" +
                "7. Given a number input, if it is higher than 8 OR equal to 6, print \'The amount of snow this winter was(cm):\'\n" +
                "and the given number. Else print \'The forecast snow is(cm):\'\n" +
                "8. Given a number input, if the number is greater than 3 but not equal to 4, print \'The number is greater than 3\n" +
                "and not equal to 4\'. Else if the number is equal to 4 print \'The number is equal to 4\'. Else if the number is lower\n" +
                "than 3 print \'The number is lower than 3\'\n" +
                "9. If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed,  otherwise,\n" +
                "program will show \'Not allowed\'\n" +
                "10. Write a Java program to determine whether an input number is an even number\n" +
                "11. Write Java program to allow the user to input his/her age. Then the program will show if the person is\n" +
                "eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old\n" +
                "12. Write a Java program that determines a student\'s grade.\n" +
                "The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade\n" +
                "13. Write a Java program that allows the user to choose the correct answer of a question\n" +
                "14. Write a Java program to search for an element of an integer array of 10 elements\n" +
                "15. Write a Java program by using two for loops to produce the output shown\n" +
                "16. Write a Java program by using three for loops to print the patter shown\n" +
                "17. Write a function that takes an input list and an interval n and returns a new list with all the elements of\n" +
                "the original list, in order, except that every nth item has been removed\n" +
                "0. LogOut");

    }

    public boolean chooseOption(int option) {

        switch (option) {

            case 0:
                System.out.println("Exit");
                return false;
            case 1:
                control.execSum();
                break;

            case 2:
                control.execTemperature();
                break;

            case 3:
                control.execGreatestNo();
                break;

            case 4:
                control.execComparestrings();
                break;

            case 5:
                control.execCompareBoBetweenValues();
                break;

            case 6:
                control.execCompareTextAndValue();
                break;

            case 7:
                control.execCompareNoAndShowMessage();
                break;

            case 8:
                control.execCompareNoWithValues();
                break;

            case 9:
                control.execCheckIfIsNumber();
                break;

            case 10:
                control.execVefiyIfNoIsEven();
                break;

            case 11:
                control.execEligibleToVote();
                break;

            case 12:
                control.execCalculateGrade();
                break;

            case 13:
                control.execQuizQuestion();
                break;

            case 14:
                control.execSearchElemInArray();
                break;

            case 15:
                control.execPrintStars();
                break;

            case 16:
                control.execPrintPattern();
                break;

            case 17:
                control.execRemoveElem();
                break;

            default:
                System.out.println("");


        }
        return true;
    }

    public void runProgram() {
        int option;
        do {
            printOptions();
            System.out.println("Please choose an option: ");

            option = readInput.readIntNumber();

        }
        while (chooseOption(option));


    }


//    public void chooseExercise(int exerciseNo) {
//        ReadInput readIn = new ReadInput();
//        Quiz exSolver = new Quiz();
//        Calculator calculator = new Calculator();
//        LogicalOperations logicalOperations = new LogicalOperations();
//        Quiz quiz = new Quiz();
//        ArrayExercises arrayExercises = new ArrayExercises();
//
//
//        switch (exerciseNo) {
//            case 1:
//
//
//            case 18:
//                int[] array = new int[10];
//                System.out.println("Enter a number:");
//                int position = readIn.readIntNumber();
//                array = arrayExercises.removeElement(position);
//                for (int i = 0; i < 10; i++) {
//                    System.out.print(array[i] + " ");
//                }
//                break;
//            case 19:
//
//                break;
//            case 0:
//                return;
//            default:
//                System.out.println("Wrong input");
//
//        }
//    }
}
