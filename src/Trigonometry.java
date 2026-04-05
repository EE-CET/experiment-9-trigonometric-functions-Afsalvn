import java.util.Scanner;
import java.lang.Math;

public class Trigonometry {

    // Method to calculate Sine from degrees
    public static double sine(double angle) {
        // Convert degrees to radians as required by Math.sin
        double radians = Math.toRadians(angle);
        return Math.sin(radians);
    }

    // Method to calculate Cosine from degrees
    public static double cosine(double angle) {
        // Convert degrees to radians as required by Math.cos
        double radians = Math.toRadians(angle);
        return Math.cos(radians);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextDouble()) {
            double angleInDegrees = sc.nextDouble();
            
            // Calling static methods directly using the class name
            double sVal = TrigCalculator.sine(angleInDegrees);
            double cVal = TrigCalculator.cosine(angleInDegrees);
            
            // Output formatting
            System.out.println("Sine: " + sVal);
            System.out.println("Cosine: " + cVal);
        }
        sc.close();
    }
}
