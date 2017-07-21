import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by loredanamoga on 7/17/2017.
 */
public class ReadInput {

    Scanner scanner = new Scanner(System.in);

    public double readNumber() {
        return scanner.nextDouble();
    }

    public int readIntNumber(){
        return scanner.nextInt();
    }

    public String readText(){
        return scanner.next();
    }

    public List<Integer> readArray(){

        String[] listElements = scanner.next().split(",");
        List<Integer>  intList = new ArrayList<>();
        for(String s : listElements){
            intList.add(Integer.parseInt(s));
        }
        return intList;
    }

}
