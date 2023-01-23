public class ColorWithAlpha extends Color {
    private int alpha;

    public ColorWithAlpha(){
        super(255,255,255);
        this.alpha = 255;
    }
    public ColorWithAlpha(int red, int green, int blue, int alpha){
        super(red, green, blue);
        this.alpha = alpha;
    }
    public int getAlpha() {
        return alpha;
    }
    public void increment(){
        increment();
        if(this.alpha < 255){
            this.alpha++;
        }
            
    }
    public void decrement(){
        decrement();
        if(this.alpha > 0){
            this.alpha--;
        }
            
    }
    public String toString(){
        return "rgba( " + getRed() + ", " + getGreen() + ", " + getBlue() + ", " + getAlpha() + ")";
    }
}
