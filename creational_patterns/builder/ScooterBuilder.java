class ScooterBuilder extends VehicleBuilder {

  public void buildFrame() {
    vehicle.setFrame("Scooter Frame");
  }

  public void buildEngine() {
    vehicle.setEngine("50 cc");
  }

  public void buildWheels() {
    vehicle.setWheels("2");
  }

  public void buildDoors() {
    vehicle.setDoors("0");
  }

}
