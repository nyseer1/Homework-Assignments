/**
 * FibonacciSequence
 */
public class FibonacciSequence extends Sequence {
    private int previous;

    public FibonacciSequence(){
        super(0);
        previous = 1;
    }
    public FibonacciSequence(int start, int previous){
        super(start);
        this.previous = previous;
    }
    @Override
    protected void advance(){
        
        if(super.current == 0){
            super.current = previous;
        }
        else if(super.current < previous){
            int temp = super.current;
            super.current = previous;
            previous = temp;

        }
        else if(super.current == previous){
            int temp = super.current;
            super.current = previous;
            previous+= temp;
        }
        else{
            int temp = super.current;
            super.current+= previous;
            previous = temp;
        }
       

    }
    
}