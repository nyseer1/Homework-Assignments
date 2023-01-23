// DO NOT MODIFY THIS FILE.

public class TestBook {
	public static void main(String[] args) {
        System.out.println(new Book("Odyssey", 5) instanceof Comparable); // expected: true
        System.out.println(new Book("Odyssey", 5).compareTo(new Book("Ulysses", 4)) > 0); // expected: true
        System.out.println(new Book("Ulysses", 4).compareTo(new Book("Odyssey", 5)) < 0); // expected: true
        System.out.println(new Book("Odyssey", 5).compareTo(new Book("Ulysses", 5)) < 0); // expected: true
        System.out.println(new Book("Ulysses", 5).compareTo(new Book("Odyssey", 5)) > 0); // expected: true
        System.out.println(new Book("Odyssey", 5).compareTo(new Book("Odyssey", 5)) == 0);// expected: true
    }
}