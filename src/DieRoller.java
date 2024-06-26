import com.sun.source.tree.WhileLoopTree;

import javax.xml.transform.Source;
import java.util.Random;
import java.util.Scanner;

public class DieRoller
{
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);


        int dieA = 0;
        int dieB = 0;
        int dieC = 0;
        int numOfRoll = 0;
        int sum;
        String equal = "";
        String playAgain = "Y";
        do {
            System.out.println("--------------------------------------------------------------------------");
            do {
                dieA = rnd.nextInt(6) + 1;
                dieB = rnd.nextInt(6) + 1;
                dieC = rnd.nextInt(6) + 1;
                numOfRoll++;
                sum = dieA + dieB + dieC;
                int factor = 0;


                System.out.println("Number of rolls       Die A       Die B       DieC       Sum");
                System.out.printf("%15s %10s %10s %10s %10s", numOfRoll, dieA, dieB, dieC, sum);
                System.out.println();
                if (dieA == dieB && dieB == dieC) {
                    equal = "T";
                } else {
                    equal = "F";
                }
            } while (equal.equals("F"));
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Type Y to go again. Type any other letter to exit.");
            playAgain = in.nextLine();
            numOfRoll = 0;
        } while (playAgain.equalsIgnoreCase("Y"));

    }
}
