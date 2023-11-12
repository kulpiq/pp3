public class TimeCalculator {

    public static void main(String[] args) {
        int hours = 14;
        int minutes = 27;

        int totalMinutes = hours * 60 + minutes;
        int totalSeconds = totalMinutes * 60;


        System.out.printf("time: %02d:%02d%n", hours, minutes);

        // Display the number of minutes and seconds from midnight
        System.out.println("minutes from midnight: " + totalMinutes);
        System.out.println("seconds from midnight: " + totalSeconds);
    }
}
