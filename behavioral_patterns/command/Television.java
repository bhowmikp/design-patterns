public class Television implements ElectronicDevice {

  private int volume = 0;

  public void on() {
    System.out.println("TV is ON");
  }

  public void off() {
    System.out.println("TV is OFF");
  }

  public void volumeUp() {
    volume++;
    System.out.println("TV Volume is at " + volume);
  }

  public void volumeDown() {
    volume--;
    System.out.println("TV Volume is at " + volume);
  }

}
