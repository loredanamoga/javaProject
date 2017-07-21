/**
 * Created by loredanamoga on 7/17/2017.
 */
public class Quiz {

    //Exercise 13: Write a Java program that allows the user to choose the correct answer of a question.
//    See the example below:
//    What is the correct way to declare a variable to store an integer value in Java?
//    a. int 1x=10;
//    b. int x=10;
//    c. float x=10.0f;
//    d. string x="10";
//    Enter your choice: c

    public void question(String answer){

        switch(answer){
            case ("a"):
                System.out.println("Wrong answer !");
                break;
            case ("b"):
                System.out.println("Wrong answer !");
                break;
            case ("c"):
                System.out.println("Correct answer ! ");
                break;
            case ("d"):
                System.out.println("Wrong answer !");
                break;
            default :
                System.out.println("Invalid input !");
        }
    }



}
