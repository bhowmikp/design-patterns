class MotorCycleBuilder extends VehicleBuilder {

  public void buildFrame() {
    vehicle.setFrame("MotorCycle Frame");
  }

  public void buildEngine() {
    vehicle.setEngine("500 cc");
  }

  public void buildWheels() {
    vehicle.setWheels("2");
  }

  public void buildDoors() {
    vehicle.setDoors("0");
  }

}
