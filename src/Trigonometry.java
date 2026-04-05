import java.util.Scanner;

public class TrigFunctions {

    // Method to calculate the sine of an angle given in degrees
    public static double sine(double angle) {
        // Math.sin expects radians, so we convert it first
        double radians = Math.toRadians(angle);
        return Math.sin(radians);
    }

    // Method to calculate the cosine of an angle given in degrees
    public static double cosine(double angle) {
        // Math.cos expects radians, so we convert it first
        double radians = Math.toRadians(angle);
        return Math.cos(radians);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the angle in degrees from the first line
        if (sc.hasNextDouble()) {
            double angle = sc.nextDouble();
            
            // Print the sine and cosine values in the exact format required
            System.out.println("Sine: " + sine(angle));
            System.out.println("Cosine: " + cosine(angle));
        }
        
        sc.close();
    }
}
