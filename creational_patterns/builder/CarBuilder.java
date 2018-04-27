class CarBuilder extends VehicleBuilder {

  public void buildFrame() {
    vehicle.setFrame("Car Frame");
  }

  public void buildEngine() {
    vehicle.setEngine("2500 cc");
  }

  public void buildWheels() {
    vehicle.setWheels("4");
  }

  public void buildDoors() {
    vehicle.setDoors("4");
  }

}
