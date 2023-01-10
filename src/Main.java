public class Main {
    public static void main(String[] args) {
        // Converts 1.5 kph to mph.
        System.out.println(toMilesPerHour(1.5));

        // Converts 10.25 kph to mph.
        System.out.println(toMilesPerHour(10.25));

        // Converts -5.6 kph to mph.
        System.out.println(toMilesPerHour(-5.6));

        // Converts 25.42 kph to mph.
        System.out.println(toMilesPerHour(25.42));

        // Converts 75.114 kph to mph.
        System.out.println(toMilesPerHour(75.114));

        // Converts 1.5 kph to mph.
        printConversion(1.5);

        // Converts 10.25 kph to mph.
        printConversion(10.25);

        // Converts -5.6 kph to mph
        printConversion(-5.6);

        // Converts 25.42 kph to mph.
        printConversion(25.42);

        // Converts 75.114 kph to mph.
        printConversion(75.114);
    }

    /**
     * Converts kilometers per hour to miles per hour.
     */
    public static long toMilesPerHour(double kilometersPerHour) {
        // Checks for invalid input.
        if (kilometersPerHour < 0) {
            return -1L;
        }

        // Converts kilometers per hour to miles per hour.
        return Math.round(kilometersPerHour / 1.609);
    }

    /**
     * Converts kilometers per hour to miles per hour.
     */
    public static void printConversion(double kilometersPerHour) {
        // Checks for invalid input.
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // Prints the conversion.
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}