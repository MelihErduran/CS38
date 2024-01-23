public class Car {
    private double fuelEfficiency;
    private double fuelAmount;
    private int passengers;

    public Car(double efficiency, double fuelLevel) {
        fuelEfficiency = efficiency;
        fuelAmount = fuelLevel;
        passengers = 0;
    }

    public void drive(double distance) {
        fuelAmount -= (distance / fuelEfficiency);
    }
    public double getGasLevel() {
        return fuelAmount;
    }
    public void addGas(double addedFuel) {
        fuelAmount += addedFuel;
    }
    public void setPassengers(int passengerAmount)
    {
        passengers += passengerAmount;
    }
    public int getPassengers()
    {
        return passengers;
    }
}
