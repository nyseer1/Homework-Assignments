public class Car extends Vehicle {
    private int numDoors;

    public Car(){
        super(5);
        numDoors = 4;
    }
    public Car(int numSeats, int numDoors){
        super(numSeats);
        this.numDoors = numDoors;

    }
    public int getNumDoors() {
        return numDoors;
    }
        
}
