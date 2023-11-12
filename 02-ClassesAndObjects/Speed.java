public class Speed {

    public static void main(String[] args) {
        int vehicleSpeed = 158;
        boolean isSpeedValid = isSpeedValid(vehicleSpeed);

        System.out.println("Vehicle speed: " + vehicleSpeed);
        System.out.println("Speed is valid: " + isSpeedValid);
    }

    public static boolean isSpeedValid(int speed) {
        return speed >= 40 && speed <= 140;
    }
}