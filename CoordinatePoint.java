public class CoordinatePoint implements Comparable<CoordinatePoint>{
    private int x, y;

    public CoordinatePoint() {
        this(0, 0);
    }

    public CoordinatePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CoordinatePoint) {
            CoordinatePoint other = (CoordinatePoint) o;
            return this.x == other.x && this.y == other.y;
        } else {
            return false;
        }
    }
    @Override
    public int compareTo(CoordinatePoint o){
        if(this.x == o.x){
            return this.y - o.y;
        }
        return this.x - o.x;
    }
}
