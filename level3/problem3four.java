import java.util.Scanner;

public class problem3four {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name, fromCity, viaCity, toCity;
        double fromToVia, viaToFinalCity;
        double timeFromToVia, timeViaToFinalCity;

        System.out.print("Enter Name: ");
        name = input.nextLine();

        System.out.print("From City: ");
        fromCity = input.nextLine();

        System.out.print("Via City: ");
        viaCity = input.nextLine();

        System.out.print("To City: ");
        toCity = input.nextLine();

        System.out.print("Distance from FromCity to ViaCity (km): ");
        fromToVia = input.nextDouble();

        System.out.print("Distance from ViaCity to FinalCity (km): ");
        viaToFinalCity = input.nextDouble();

        System.out.print("Time from FromCity to ViaCity (minutes): ");
        timeFromToVia = input.nextDouble();

        System.out.print("Time from ViaCity to FinalCity (minutes): ");
        timeViaToFinalCity = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + 
                           " from " + fromCity + " to " + toCity + 
                           " via " + viaCity + " is " + totalDistance + 
                           " km and the Total Time taken is " + totalTime + " minutes");

        input.close();
    }
}