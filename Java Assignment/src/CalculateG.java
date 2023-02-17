public class CalculateG {
    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double square(double x) {
        return x * x;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static void outputResult(double position, double velocity) {
        System.out.println("The object's position after 30 seconds is " + position + " m.");
        System.out.println("The object's velocity after 30 seconds is " + velocity + " m/s.");
    }

    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity = gravity * fallingTime + initialVelocity;
        double initialPosition = 0.0;
        double finalPosition = 0.5 * gravity * square(fallingTime) + initialVelocity * fallingTime + initialPosition;

        outputResult(finalPosition, finalVelocity);
    }
}
