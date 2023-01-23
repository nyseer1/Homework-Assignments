// DO NOT MODIFY THIS FILE.

public class TestCoordinatePoint {
	public static void main(String[] args) {
        System.out.println(new CoordinatePoint() instanceof Comparable); // expected: true

        // this.x != other.x
        System.out.println(new CoordinatePoint(5, 10).compareTo(new CoordinatePoint(6, 9)) < 0);  // expected: true
        System.out.println(new CoordinatePoint(6, 10).compareTo(new CoordinatePoint(5, 10)) > 0);  // expected: true
        System.out.println(new CoordinatePoint(5, 10).compareTo(new CoordinatePoint(-6, 10)) > 0); // expected: true
        System.out.println(new CoordinatePoint(6, 10).compareTo(new CoordinatePoint(-5, 10)) > 0); // expected: true

        // this.x == other.x
        System.out.println(new CoordinatePoint(5, 10).compareTo(new CoordinatePoint(5, 11)) < 0);  // expected: true
        System.out.println(new CoordinatePoint(5, 11).compareTo(new CoordinatePoint(5, 10)) > 0);  // expected: true
        System.out.println(new CoordinatePoint(5, 10).compareTo(new CoordinatePoint(5, -11)) > 0);  // expected: true
        System.out.println(new CoordinatePoint(5, 11).compareTo(new CoordinatePoint(5, -10)) > 0); // expected: true

        System.out.println(new CoordinatePoint(5, 10).compareTo(new CoordinatePoint(5, 10)) == 0); // expected: true
    }
}