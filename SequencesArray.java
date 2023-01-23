public class SequencesArray {
    public static void main(String[] args) {
        Sequence[] sequences = {
                new ArithmeticSequence(),
                new GeometricSequence(),
                new FibonacciSequence()
        };
        
        // advance each sequence four times
        for (Sequence sequence : sequences) {
            for (int i = 0; i < 4; i++) {
                sequence.getCurrentAndAdvance();
            }
        }
        
        // print the current value (that is, the fifth value) of each sequence
        for (Sequence sequence : sequences) {
            System.out.print(sequence.getCurrentAndAdvance() + " ");
        }
        
        // print the current value (that is, the sixth value) of each sequence
        for (Sequence sequence : sequences) {
            System.out.print(sequence.getCurrentAndAdvance() + " ");
        }
    }
}