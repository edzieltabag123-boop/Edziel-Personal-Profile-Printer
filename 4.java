
import java.util.Arrays;

public class OverflowReferenceInvestigator {
    public static void main(String[] args) {

        // 1. BYTE OVERFLOW
        byte number = 127;
        number++;

        System.out.println("=== Byte Overflow ===");
        System.out.println("After incrementing 127: " + number);
        // A byte has a maximum value of 127. Incrementing it wraps
        // around to -128 because byte values use 8-bit two's complement.

        // 2. STRING REFERENCE COMPARISON
        String text1 = new String("Hello");
        String text2 = new String("Hello");
        String text3 = "Hello";

        System.out.println("\n=== String Comparison ===");

        System.out.println("text1 == text2: " + (text1 == text2));
        // false: new String creates separate objects in memory.

        System.out.println("text1.equals(text2): " + text1.equals(text2));
        // true: equals() compares the contents of the strings.

        System.out.println("text1 == text3: " + (text1 == text3));
        // false: text1 refers to a new object, while text3 refers to
        // the interned string literal.

        System.out.println("text1.equals(text3): " + text1.equals(text3));
        // true: both strings contain the same characters.

        System.out.println("text2 == text3: " + (text2 == text3));
        // false: text2 is a separate object from the literal.

        System.out.println("text2.equals(text3): " + text2.equals(text3));
        // true: their contents are identical.

        // 3. SHARED ARRAY REFERENCE
        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        System.out.println("\n=== Shared Array Reference ===");
        System.out.println("Before modification: " + Arrays.toString(array2));

        array1[0] = 99;

        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));
        // Both variables refer to the same array object, so modifying
        // the array through array1 is visible through array2.
    }
}
