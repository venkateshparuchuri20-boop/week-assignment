import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double fee;
        double discountPercent;
        
        System.out.print("Enter the Student Fee: ");
        fee = input.nextDouble();
        
        System.out.print("Enter the Discount Percentage: ");
        discountPercent = input.nextDouble();
        
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
        
        input.close();
    }
}