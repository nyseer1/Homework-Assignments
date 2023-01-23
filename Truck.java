public class Truck extends Car {
    private int cargoWeight, maxCargoWeight;

    public Truck(int maxCargoWeight){
        super(2,5);
        cargoWeight = 0;
        this.maxCargoWeight = maxCargoWeight;
    }
    public Truck(int numSeats, int maxCargoWeight){
            super(numSeats, 5);
            this.maxCargoWeight = maxCargoWeight;

    }
    public int getMaxCargoWeight(){
        return maxCargoWeight;
    }
    public int getCargoWeight(){
        return cargoWeight;
    }
    public boolean addCargo(int weight){
        if(cargoWeight + weight < maxCargoWeight){
            cargoWeight += weight;
            return true;
        }
        return false;
    }
}
