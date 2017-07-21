import java.util.List;

/**
 * Created by loredanamoga on 7/19/2017.
 */
public class Control {

    ReadInput readIn = new ReadInput();
    Quiz exSolver = new Quiz();
    Calculator calculator = new Calculator();
    LogicalOperations logicalOperations = new LogicalOperations();
    Quiz quiz = new Quiz();
    ArrayExercises arrayExercises = new ArrayExercises();

    public void execSum() {

        System.out.println("Introduceti doua numere.");
        int no1 = readIn.readIntNumber();
        int no2 = readIn.readIntNumber();
        Calculator calculator = new Calculator();
        System.out.println("Rezultatul este: ");
        System.out.println(calculator.sum(no1, no2) );

    }

    public void execTemperature(){
        System.out.println("Enter one number:");
        double no = readIn.readNumber();
        double tempF = calculator.convFromCelsiusToFahrenheit(no);
        System.out.println("Temperature in Celsius is: " + tempF);

    }

    public void execGreatestNo(){
        System.out.println("Enter the first number:");
        int no1 = readIn.readIntNumber();
        System.out.println("Enter the second number:");
        int no2 = readIn.readIntNumber();
        System.out.println("The greatest number between " + no1 + " and " + no2 + " is: " + logicalOperations.greatestNumber(no1, no2));
    }

    public void execComparestrings(){
        System.out.println("Enter a text:");
        String inputWord = readIn.readText();
        System.out.println("Result:" + logicalOperations.compareStrings(inputWord, "Evozon"));
    }

    public void execCompareBoBetweenValues(){
        System.out.println("Enter one number:");
        int number = readIn.readIntNumber();
        System.out.println("Result:" + logicalOperations.compareNoBetweenValues(number, 2, 8));
    }

    public void execCompareTextAndValue(){
        System.out.println("enter a text");
        String inputText = readIn.readText();
        System.out.println("Enter one number: ");
        int inputNo = readIn.readIntNumber();
        System.out.println(logicalOperations.compareTextAndValue(inputText, inputNo, "Evozon", 3, 4));
    }

    public void execCompareNoAndShowMessage(){
        System.out.println("Enter one number: ");
        int myNumber = readIn.readIntNumber();
        System.out.println(logicalOperations.compareNumberAndShowMessages(myNumber) + myNumber);
    }

    public void execCompareNoWithValues(){
        System.out.println("Enter one number:");
        int myNo = readIn.readIntNumber();
        System.out.println(logicalOperations.compareNoWithValues(myNo, 3, 4));
    }

    public void execCheckIfIsNumber(){
        System.out.println("enter something:");
        String input = readIn.readText();
        calculator.checkIfIsNumber(input);
    }

    public void execVefiyIfNoIsEven(){
        System.out.println("Enter one number:");
        int numberToVerify = readIn.readIntNumber();
        System.out.println(calculator.verifyIfNumberIsEven(numberToVerify));
    }

    public void execEligibleToVote(){
        System.out.println("Enter your age:");
        int age = readIn.readIntNumber();
        System.out.println(logicalOperations.eligibleToVote(age));
    }

    public void execCalculateGrade(){
        System.out.println("Quiz score:");
        int quizScore = readIn.readIntNumber();
        System.out.println("Mid-term score:");
        int midTermScore = readIn.readIntNumber();
        System.out.println("Final score:");
        int finalScore = readIn.readIntNumber();
        System.out.println(" Your grade is : " + calculator.calculateGrade(quizScore, midTermScore, finalScore));
    }

    public void execQuizQuestion(){
        System.out.println(" What is the correct way to declare a variable to store an integer value in Java?");
        System.out.println("a. int 1x=10;");
        System.out.println("b. int x=10;");
        System.out.println("c. float x=10.0f;");
        System.out.println("d. string x=\"10\";");
        System.out.println("Enter your choice: ");
        String answer = readIn.readText();
        quiz.question(answer);
    }

    public void execSearchElemInArray(){
        System.out.println("Enter the elements of the list separeated by ',' :");
        List<Integer> listElements = readIn.readArray();
        System.out.println("Enter the element that you want to search:");
        int element = readIn.readIntNumber();
        System.out.println(arrayExercises.searchElementInArray(listElements, element));
    }

    public void execPrintStars(){
        System.out.println("Enter a number:");
        int numberOfStars = readIn.readIntNumber();
        arrayExercises.printStars(numberOfStars);
    }

    public void execPrintPattern(){
        System.out.println("Enter a number");
        int num = readIn.readIntNumber();
        arrayExercises.printPattern(num);
    }

    public void execRemoveElem(){
        System.out.println("Enter the elements of the list separeated by ',' :");
        List<Integer> listElements = readIn.readArray();
        System.out.println("Enter a number:");
        int pos = readIn.readIntNumber();
        System.out.println(arrayExercises.removeElement2(listElements, pos));
    }
}
