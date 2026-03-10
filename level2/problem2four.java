import java.util.Scanner;

public class problem2four {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double distanceInFeet;
        
        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();
        
        // 1 yard = 3 feet
        double yards = distanceInFeet / 3;
        
        // 1 mile = 1760 yards
        double miles = yards / 1760;
        
        System.out.println("The distance in yards is " + yards +
                           " while the distance in miles is " + miles);
        
        input.close();
    }
}