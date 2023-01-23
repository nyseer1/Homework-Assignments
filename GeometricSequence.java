/**
 * GeometricSequence
 */
public class GeometricSequence extends Sequence {
    private int ratio;

    public GeometricSequence(){
        super(1);
        ratio = 2;
    }
    public GeometricSequence(int ratio){
        super(1);
        this.ratio = ratio;
    }
    public GeometricSequence(int start, int ratio){
        super(start);
        this.ratio = ratio;
    }
    @Override
    protected void advance(){
        super.current*= ratio;
    }

    
}