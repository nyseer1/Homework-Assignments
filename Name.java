public class Name {
    private String first, last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public Name(Name original) {
        this.first = original.first;
        this.last = original.last;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    @Override
    public String toString() {
        return first + " " + last;
    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Name)){
            return false;
        }
        Name nameO = (Name)o;
        return this.first.equals(nameO.first) && this.last.equals(nameO.last);
    }
}
