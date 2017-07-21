import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by loredanamoga on 7/17/2017.
 */
public class ArrayExercises {

    //Exercise 15: Write a Java program to search for an element of an integer array of 10 elements.
    public String searchElementInArray(List<Integer> listElements, int searchedElem) {

        for (int i = 0; i < listElements.size(); i++) {
            if (listElements.get(i) == searchedElem)
                return "Your searched element is in the array !";

        }
        return "Your searched element isn't in the array !";
    }

    //Exercise 16: Write a Java program by using two for loops to produce the output shown below:

    //        *******
//
//        ******
//
//        *****
//
//        ****
//
//        ***
//
//        **
//
//        *
    public void printStars(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("*");

            }
            System.out.println();
            System.out.println();
        }

    }

    //Exercise 17: Write a Java program by using three for loops to print the following pattern:
//
//        1******
//
//        12*****
//
//        123****
//
//        1234***
//
//        12345**
//
//        123456*
//
//        1234567
    public void printPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);

            }
            for (int k = 0; k < size - i - 1; k++) {
                System.out.print("*");

            }
            System.out.println();
            System.out.println();
        }


    }

    //Exercise 18: Write a function that takes an input list and an interval n and returns a new list with all the elements
    // of the original list, in order, except that every nth item has been removed.
    // For instance, given the input list (1 2 3 4 5 6 7 8 9 10) and n = 4, the function should return the list (1 2 3 5 6 7 9 10).
    // revise... list should be ordered
    public int[] removeElement(int elementToRemove) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArray = new int[10];
        for (int i = 0, j = 0; i < 10; i++) {
            if (i % elementToRemove != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    public List<Integer> sortList(List<Integer> listToSort){
        boolean swap = true;
        int j = 0;
        int aux;
        while (swap) {
            swap = false;
            j++;
            for (int i = 0; i < listToSort.size() - j; i++) {
                if (listToSort.get(i) > listToSort.get(i + 1)) {
                    aux = listToSort.get(i);
                    listToSort.set(i, listToSort.get(i + 1));
                    listToSort.set(i + 1, aux);
                    swap = true;
//                    System.out.println(listElements);
                }
            }
        }
        return listToSort;
    }
    public List<Integer> removeElement2(List<Integer> listElements, int elementToRemove) {



        List<Integer> finalList = new ArrayList<Integer>();
        List<Integer> newList = sortList(listElements);
        for (int i = 0; i < newList.size(); i++) {
            if ((i+1) % elementToRemove != 0) {
                finalList.add(newList.get(i));

            }
        }
        return finalList;
    }



}
