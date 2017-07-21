/**
 * Created by loredanamoga on 7/17/2017.
 */
public class Calculator {

    public static int sum(int a, int b) {
        return (a + b);
    }

    //Exercise 1: Convert a given F temperature in C temperature (C=5/9*(F-32)
    public double convFromCelsiusToFahrenheit(double tempF) {
        return 1.0 * 5 / 9 * (tempF - 32);
    }

    //Exercise 8: If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed,  otherwise, program will show "Not allowed”. (use a switch case for this)
    public void checkIfIsNumber(String input) {
        switch (input) {
            case "0":
                System.out.println("You pressed key 0");
                break;
            case "1":
                System.out.println("You pressed key 1");
                break;
            case "2":
                System.out.println("You pressed key 2");
                break;
            case "3":
                System.out.println("You pressed key 3");
                break;
            case "4":
                System.out.println("You pressed key 4");
                break;
            case "5":
                System.out.println("You pressed key 5");
                break;
            case "6":
                System.out.println("You pressed key 6");
                break;
            case "7":
                System.out.println("You pressed key 7");
                break;
            case "8":
                System.out.println("You pressed key 8");
                break;
            case "9":
                System.out.println("You pressed key 9");
                break;
            default:
                System.out.println("Not allowed");


        }
    }

    //Exercise 10: Write a Java program to determine whether an input number is an even number.
    public String verifyIfNumberIsEven(int inputNo) {
        if (inputNo % 2 == 0) return "The number " + inputNo + " is even";
        else return "The number is odd";
    }

    //Exercise 12: Write a Java program that determines a student’s grade.
    // The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on the following rules:
// -if the average score >=90% =>grade=A
//-if the average score >= 70% and <90% => grade=B
//-if the average score>=50% and <70% =>grade=C
//-if the average score<50% =>grade=F
//    See the example output below:
//
//    Quiz score: 80
//    Mid-term score: 68
//    Final score: 90
//    Your grade is B.

    public String calculateGrade(int quizScore, int midTermScore, int finalScore) {
        int averageScore = (quizScore + midTermScore + finalScore) / 3;
        if (averageScore >= 90) return "A";
        if (averageScore >= 70 && averageScore < 90) return "B";
        if (averageScore >= 50 && averageScore < 70) return "C";
        if (averageScore < 50) return "F";
        return "too small. Keep learning !";
    }
}
