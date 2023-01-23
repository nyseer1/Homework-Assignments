// DO NOT MODIFY THIS FILE.

public class TestMonetaryValue {
	public static void main(String[] args) {
        System.out.println(new MonetaryValue() instanceof Comparable); // expected: true

        System.out.println(new MonetaryValue(1.23).compareTo(new MonetaryValue(1.24)) < 0);  // expected: true
        System.out.println(new MonetaryValue(1.24).compareTo(new MonetaryValue(1.23)) > 0);  // expected: true
        System.out.println(new MonetaryValue(1.23).compareTo(new MonetaryValue(1.23)) == 0); // expected: true
        System.out.println(new MonetaryValue(1.23).compareTo(new MonetaryValue(2.22)) < 0);  // expected: true
        System.out.println(new MonetaryValue(2.22).compareTo(new MonetaryValue(1.23)) > 0);  // expected: true
        System.out.println(new MonetaryValue(-1.24).compareTo(new MonetaryValue(1.23)) < 0); // expected: true
    }
}