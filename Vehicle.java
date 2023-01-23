/**
 * Vehicle
 */
public class Vehicle {

    private int numSeats, numPassengers;

    public Vehicle(int numSeats){
        this.numSeats = numSeats;
        numPassengers = 0;
    }

    public int getNumSeats(){
        return numSeats;
    }
    public int getNumPassengers(){
        return numPassengers;
    }
    public boolean addPassenger(){
        if(numPassengers < numSeats){
            numPassengers++;
            return true;
        }
        return false;
    }


}