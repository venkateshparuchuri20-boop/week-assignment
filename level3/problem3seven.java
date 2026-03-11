import java.util.Scanner;

public class problem3seven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfChocolates, numberOfChildren;

        System.out.print("Enter number of chocolates: ");
        numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        numberOfChildren = input.nextInt();

        int chocolatesEach = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " 
                           + chocolatesEach + 
                           " and the number of remaining chocolates are " + remaining);

        input.close();
    }
}