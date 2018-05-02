public class Radio implements ElectronicDevice {

  private int volume = 0;

  public void on() {
    System.out.println("Radio is ON");
  }

  public void off() {
    System.out.println("Radio is OFF");
  }

  public void volumeUp() {
    volume++;
    System.out.println("Radio Volume is at " + volume);
  }

  public void volumeDown() {
    volume--;
    System.out.println("Radio Volume is at " + volume);
  }

}
