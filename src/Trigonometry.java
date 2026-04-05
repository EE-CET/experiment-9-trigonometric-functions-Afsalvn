import java.util.Scanner;

// FIX: Renamed from TrigFunctions to Trigonometry to match the filename
public class Trigonometry {

    public static double sine(double angle) {
        // Math.sin expects radians, so we convert it first
        double radians = Math.toRadians(angle);
        return Math.sin(radians);
    }

    public static double cosine(double angle) {
        // Math.cos expects radians, so we convert it first
        double radians = Math.toRadians(angle);
        return Math.cos(radians);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextDouble()) {
            double angle = sc.nextDouble();
            
            // Call the methods directly within the same class
            System.out.println("Sine: " + sine(angle));
            System.out.println("Cosine: " + cosine(angle));
        }
        
        sc.close();
    }
}
