public class SumTest {
    public static void main(String[] args) {
        Number[] numbers = {
                new Rational("1/2"),
                3,
                2.5
        };

        System.out.println(sum(numbers));
    }
    
    public static double sum(Number[] numbers) {
        double sum = 0.0;

        for (Number number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }
}