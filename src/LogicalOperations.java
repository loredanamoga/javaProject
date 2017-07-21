/**
 * Created by loredanamoga on 7/17/2017.
 */
public class LogicalOperations {

    //Exercise 2: Given two numbers, see which one is the greatest and print it
    public int greatestNumber(int no1, int no2) {
        if (no1 >= no2) return no1;
        else return no2;
    }

    //Exercise 3: Given a text input, if it is “Evozon”, then print “Learning text comparison”. If not, print “Got to try some more”
    public String compareStrings(String stringInput, String stringToCompare) {
        if (stringInput.equals(stringToCompare)) return "Learning text comparison";
        else return "Go to try some more";
    }

    //Exercise 4: Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number
    public int compareNoBetweenValues(int number, int noToCompareWith1, int noToCompareWith2) {
        if (number >= noToCompareWith1 && number <= noToCompareWith2) return number;
        else return 1; //if the no isn't between [2, 8)
    }

    //Exercise 5: Given a text input and a number input, if the text is equal to "Evozon” AND the number is equal to or lower than 3, print the text and the number.
    // If the text is not “Evozon” AND the number is equal to or higher than 4, print the number and the text, in this order.
    public String compareTextAndValue(String inputText, int inputNo, String comparedText, int comparedNo1, int comparedNo2) {
        if (inputText.equals(comparedText) && inputNo <= comparedNo1) return inputText + " " + inputNo;
        if (!inputText.equals(comparedText) && inputNo >= comparedNo2) return inputNo + " " + inputText;
        else return "Fail";
    }

    //Exercise 6: Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”
    public String compareNumberAndShowMessages(int inputNo) {
        if (inputNo > 8 | inputNo == 6) return "The amount of snow this winter was(cm):";
        else return "The forecast snow is(cm):";
    }

    //Exercise 7: Given a number input, if the number is greater than 3 but not equal to 4,
    // print “The number is greater than 3 and not equal to 4”. Else if the number is equal to 4 print ”The number is equal to 4”. Else if the number is lower than 3 print “The number is lower than 3”
    public String compareNoWithValues(int inputNo, int valueToCompare1, int valueToCompare2) {
        if (inputNo > valueToCompare1 && inputNo != valueToCompare2)
            return "The number is greater than " + valueToCompare1 + " and not equal to " + valueToCompare2;
        else if (inputNo == valueToCompare2) return "The number is equal to " + valueToCompare2;
        else if (inputNo < valueToCompare1) return "The number is lower than " + valueToCompare1;
        return "Fail!";
    }

    //Exercise 11: Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.
    //Enter your age: 18
    //You are eligible to vote.
    public String eligibleToVote(int age) {
        if (age >= 18) return "You are eligible to vote";
        return "You are not eligible to vote";

    }

}
