// DO NOT MODIFY THIS FILE

public class TestTime24 {
    public static void main(String[] args) {
        testConstructorAndGetters();
        testParse();
        testEquals();
        testToString();
        testImplementsComparable();
    }

    private static void testConstructorAndGetters() {
        System.out.println("testing constructor and getters");

        try {
            new Time24(0, 0, 0);
            new Time24(23, 59, 59);
        } catch (Exception ignored) {
            System.out.println("an exception should not have occurred here");
        }

        try {
            new Time24(-1, 0, 0);
            System.out.println("an exception should have been thrown");
        } catch (IllegalArgumentException ignored) {
            // ignore
        }

        try {
            new Time24(0, -1, 0);
            System.out.println("an exception should have been thrown");
        } catch (IllegalArgumentException ignored) {
            // ignore
        }

        try {
            new Time24(0, 0, -1);
            System.out.println("an exception should have been thrown");
        } catch (IllegalArgumentException ignored) {
            // ignore
        }

        try {
            new Time24(24, 0, 0);
            System.out.println("an exception should have been thrown");
        } catch (IllegalArgumentException ignored) {
            // ignore
        }

        try {
            new Time24(0, 60, 0);
            System.out.println("an exception should have been thrown");
        } catch (IllegalArgumentException ignored) {
            // ignore
        }

        try {
            new Time24(0, 0, 60);
            System.out.println("an exception should have been thrown");
        } catch (IllegalArgumentException ignored) {
            // ignore
        }

        Time24 time = new Time24(1, 2, 3);
        System.out.println(time.getHour()); // expected: 1
        System.out.println(time.getMinute()); // expected: 2
        System.out.println(time.getSecond()); // expected: 3

        System.out.println();
    }

    private static void testParse() {
        System.out.println("testing parse");

        try {
            Time24.parse("00:00:00");
            Time24.parse("23:59:59");
        } catch (Exception ignored) {
            System.out.println("an exception should not have occurred here");
        }

        try {
            Time24.parse("6:11:11");
            System.out.println("an exception should have been thrown");
        } catch (IllegalArgumentException ignored) {
            // ignored
        }

        try {
            Time24.parse("11:6:11");
            System.out.println("an exception should have been thrown");
        } catch (IllegalArgumentException ignored) {
            // ignored
        }

        try {
            Time24.parse("11:11:6");
            System.out.println("an exception should have been thrown");
        } catch (IllegalArgumentException ignored) {
            // ignored
        }

        try {
            Time24.parse("11:11:11:11");
            System.out.println("an exception should have been thrown");
        } catch (IllegalArgumentException ignored) {
            // ignored
        }

        try {
            Time24.parse("11:6m:11");
            System.out.println("an exception should have been thrown");
        } catch (IllegalArgumentException ignored) {
            // ignored
        }

        Time24 time = Time24.parse("03:02:01");
        System.out.println(time.getHour()); // expected: 3
        System.out.println(time.getMinute()); // expected: 2
        System.out.println(time.getSecond()); // expected: 1

        System.out.println();
    }

    private static void testEquals() {
        System.out.println("testing equals");

        System.out.println(new Time24(11, 12, 13).equals(new Time24(11, 12, 13))); // expected: true
        System.out.println(new Time24(11, 12, 13).equals(Time24.parse("11:12:13")));        // expected: true
        System.out.println(Time24.parse("01:02:03").equals(new Time24(1, 2, 3)));           // expected: true
        System.out.println(new Time24(11, 12, 13).equals(new Time24(17, 12, 13))); // expected: false
        System.out.println(new Time24(11, 12, 13).equals(new Time24(11, 17, 13))); // expected: false
        System.out.println(new Time24(11, 12, 13).equals(new Time24(11, 12, 17))); // expected: false
        System.out.println(new Time24(11, 12, 13).equals("a String"));                               // expected: false
        System.out.println(new Time24(11, 22, 13).equals(null));                                     // expected: false

        System.out.println();
    }

    private static void testToString() {
        System.out.println("testing toString");

        System.out.println(new Time24(12, 34, 56)); // expected: 12:34:56
        System.out.println(Time24.parse("11:22:33")); // expected: 11:22:33

        System.out.println(new Time24(5, 6, 7)); // expected: 05:06:07
        System.out.println(Time24.parse("04:05:06")); // expected: 04:05:06

        System.out.println();
    }

    private static void testImplementsComparable() {
        System.out.println("testing implements Comparable");

        System.out.println(Time24.parse("00:00:00") instanceof Comparable); // expected: true
        System.out.println(Time24.parse("09:15:15").compareTo(Time24.parse("10:05:05")) < 0); // expected: true
        System.out.println(Time24.parse("10:05:05").compareTo(Time24.parse("09:15:15")) > 0); // expected: true
        System.out.println(Time24.parse("09:05:15").compareTo(Time24.parse("09:15:05")) < 0); // expected: true
        System.out.println(Time24.parse("09:15:05").compareTo(Time24.parse("09:05:15")) > 0); // expected: true
        System.out.println(Time24.parse("09:05:05").compareTo(Time24.parse("09:05:15")) < 0); // expected: true
        System.out.println(Time24.parse("09:05:15").compareTo(Time24.parse("09:05:05")) > 0); // expected: true
        System.out.println(Time24.parse("09:05:05").compareTo(Time24.parse("09:05:05")) == 0);// expected: true

        System.out.println();
    }
}
