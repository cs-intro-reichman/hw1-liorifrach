public class Bill3 {
    public static void main(String[] args) {

		
        // Read the names of the diners
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        
        // Read the total bill amount
        double totalBill = Double.parseDouble(args[3]);
        
        // Calculate the amount each diner needs to pay, rounding up using Math.ceil
        double amountPerDiner = Math.ceil(totalBill / 3);
        
        // Print the formatted output
        System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + amountPerDiner + " Shekels each.");
    }
}
