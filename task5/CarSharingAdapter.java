
public class CarSharingAdapter implements TaxiService {
    private CarSharing carSharing;
    
    public CarSharingAdapter(CarSharing carSharing) {
        this.carSharing = carSharing;
    }
    
    @Override
    public void requestTaxi(Passenger passenger) {

        Driver driver = new Driver();  
        carSharing.rentFreeCar(driver);  
        passenger.setDriver(driver);  
        System.out.println("Car sharing service has been requested for the passenger.");
    }
}
