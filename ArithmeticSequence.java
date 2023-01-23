public class ArithmeticSequence extends Sequence{
    private int difference;

    public ArithmeticSequence(){
        super(0);
        difference = 1;
    }
    public ArithmeticSequence(int difference){
        super(0);
        this.difference = difference;
    }
    public ArithmeticSequence(int start, int difference){
        super(start);
        this.difference = difference;
    }
    @Override
    protected void advance(){
        super.current+= difference;
    }
}
