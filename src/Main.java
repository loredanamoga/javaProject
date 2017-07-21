import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by loredanamoga on 7/17/2017.
 */
public class Main {

    public static void main(String[] args) {

        ReadInput readIn = new ReadInput();
        Quiz exSolver = new Quiz();
        Calculator calculator = new Calculator();
        LogicalOperations logicalOperations = new LogicalOperations();
        Quiz quiz = new Quiz();
        ArrayExercises arrayExercises = new ArrayExercises();
        Menu m = new Menu();
        Login login = new Login();


        if (login.loginValidation()) {

            m.runProgram();
        }

        //Exercise 18
//        int[] array = new int[10];
//        System.out.println("Enter a number:");
//        int number = readIn.readIntNumber();
//        array = arrayExercises.removeElement(number);
//        for(int i = 0; i < 10; i++){
//            System.out.print(array[i]+ " ");
//        }
//
//        //Another solution using List
//        System.out.println(arrayExercises.removeElement2(number));


//        HashMap<String, Integer> hashMap = new HashMap<>();
//
//
//        while(true) {
//            System.out.println("Enter a key");
//            String key = readIn.readText();
//            if(key.equals("exit")) {
//               break;
//
//            }
//            System.out.println("Enter a value");
//            int value = readIn.readIntNumber();
//            if(value == 0){
//                break;
//
//            }
//            hashMap.put(key, value);
//        }
//        System.out.println(hashMap);



    }
}
