public static void main(String[] args) {
    Passenger passenger = new Passenger();

    Car car = new Car("Toyota");
    CarSharing carSharing = new CarSharing(car);
    
    TaxiService taxiService = new CarSharingAdapter(carSharing);

    taxiService.requestTaxi(passenger);
}
