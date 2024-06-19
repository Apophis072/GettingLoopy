import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class For_Loops
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Part A
        for (int numA = 0; numA <= 30; numA++)
        {
            System.out.println(numA);
        }
        System.out.println("\n");
        for (int numB = 30; numB >= 0; numB--)
        {
            System.out.println(numB);
        }
        System.out.println("\n");
        for (int numC = 0; numC <= 18; numC += 3)
        {
            System.out.println(numC);
        }
        System.out.println("\n");
        for (int numD = 10; numD >= 0; numD -= 2)
        {
            System.out.println(numD);
        }

        //Part B
        System.out.println("\n");
        for (int numE = 0; numE < 5; numE ++)
        {
            for (int numF = 0; numF <= numE; numF ++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int numG = 5; numG > 0; numG--)
        {
            for (int numH = 0; numH < numG; numH++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int numI = 0; numI < 5; numI++)
        {
            for (int numJ =0; numJ <5; numJ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}