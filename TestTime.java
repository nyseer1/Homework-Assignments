// DO NOT MODIFY THIS FILE.

public class TestTime {
    public static void main(String[] args) {
        testConstructor();
        testToString();
        testEquals();
    }

    private static void testConstructor() {
        System.out.println("testing constructor");

        try {
            Time time1 = new Time(1, 0, 0, "AM");
            Time time2 = new Time(12, 59, 59, "PM");
        } catch (Exception e) {
            System.out.println("an exception should not occur here");
        }

        try {
            Time time = new Time(0, 10, 10, "AM");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // expected: hour must be between 1 and 12
        }

        try {
            Time time = new Time(13, 10, 10, "AM");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // expected: hour must be between 1 and 12
        }

        try {
            Time time = new Time(10, -1, 10, "AM");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // expected: minute must be between 0 and 59
        }

        try {
            Time time = new Time(10, 60, 10, "AM");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // expected: minute must be between 0 and 59
        }

        try {
            Time time = new Time(10, 10, -1, "AM");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // expected: second must be between 0 and 59
        }

        try {
            Time time = new Time(10, 10, 60, "AM");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // expected: second must be between 0 and 59
        }

        try {
            Time time = new Time(10, 10,10, null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage()); // expected: amOrPm cannot be null
        }

        try {
            Time time = new Time(10, 10, 10, "am");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // expected: amOrPm must be either "AM" or "PM"
        }

        try {
            Time time = new Time(10, 10, 10, "pm");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // expected: amOrPm must be either "AM" or "PM"
        }

        System.out.println();
    }

    private static void testToString() {
        System.out.println("testing toString");

        Time time1 = new Time(10, 10, 10, "AM");
        System.out.println(time1); // expected: 10:10:10 AM

        Time time2 = new Time(1, 5, 5, "PM");
        System.out.println(time2); // expected: 1:05:05 PM

        Time time3 = new Time(1, 0, 0, "PM");
        System.out.println(time3); // expected: 1:00:00 PM

        System.out.println();
    }

    private static void testEquals() {
        System.out.println("testing equals");

        Time time = new Time(1, 0, 10, "AM");

        Object other1 = new Time(1, 0, 10, new String("AM"));
        System.out.println(time.equals(other1)); // expected: true

        Time other2 = new Time(1, 10, 0, "AM");
        System.out.println(time.equals(other2)); // expected: false

        Time other3 = new Time(1, 0, 10, "PM");
        System.out.println(time.equals(other3)); // expected: false

        System.out.println(time.equals(null)); // expected: false

        System.out.println(time.equals("a String")); // expected: false

        System.out.println();
    }
}
