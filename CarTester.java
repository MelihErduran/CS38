public class CarTester
{
    public static void main(String[] args)
    {
        /* object 1 */
        Car SamCar = new Car(100, 1000);


        // tests the addGas method
        SamCar.addGas (20);

        // tests the setPassengers method
        SamCar.setPassengers(4000);

        //tests the getPassengers output
        int passengers = SamCar.getPassengers();

        //tests the drive method
        double distance = 1000;
        SamCar.drive(distance);

        //tests the getGasLevel method
        double gallonsLeft = SamCar.getGasLevel();

        //output
        System.out.printf("You drove %.2f miles and have %.2f gallons left in your tank \n", distance, gallonsLeft);
        System.out.printf("SamCar now has %d passengers \n", passengers);

        /* object 2 */
        Car MelihCar = new Car(24, 5);


        // tests the addGas method
        MelihCar.addGas (5);

        // tests the setPassengers method
        MelihCar.setPassengers(3);

        //tests the getPassengers output
        passengers = MelihCar.getPassengers();

        //tests the drive method
        distance = 30;
        MelihCar.drive(distance);

        //tests the getGasLevel method
        gallonsLeft = MelihCar.getGasLevel();

        //output
        System.out.printf("You drove %.2f miles and have %.2f gallons left in your tank \n", distance, gallonsLeft);
        System.out.printf("MelihCar now has %d passengers \n", passengers);
    }
}