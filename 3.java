
public class UnitCastingConverter {
    public static void main(String[] args) {
        double centimeters = 275.8;

        // Explicit casting converts double to int, removing decimal values.
        int wholeMeters = (int) centimeters / 100;

        double remainingCentimeters = centimeters - (wholeMeters * 100);

        System.out.println("=== Unit Casting Converter ===");
        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole meters: " + wholeMeters);
        System.out.println("Remaining centimeters: " + remainingCentimeters);

        // Implicit widening: int becomes double automatically.
        int number = 25;
        double widenedNumber = number;

        System.out.println("Implicit widening (int to double): " + widenedNumber);

        // Explicit narrowing: decimal digits are lost when double becomes int.
        double decimalValue = 12.75;
        int narrowedValue = (int) decimalValue;

        System.out.println("Original double: " + decimalValue);
        System.out.println("Narrowed int: " + narrowedValue);
    }
}
