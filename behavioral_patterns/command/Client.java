import java.util.ArrayList;
import java.util.List;

public class Client {

  public static void main(String [] args) {

    ElectronicDevice device = TVRemote.getDevice();

    // ----- Turn TV On
    TurnOn onCommand = new TurnOn(device);

    DeviceButton onPressed = new DeviceButton(onCommand);

    onPressed.press();

    // ----- Turn TV Off
    TurnOff offCommand = new TurnOff(device);

    onPressed = new DeviceButton(offCommand);

    onPressed.press();

    // ---------Turn Volume Up
    TurnUp volUpCommand = new TurnUp(device);

    onPressed = new DeviceButton(volUpCommand);

    onPressed.press();
    onPressed.press();
    onPressed.press();

    // --------------Turn off all devices
    Television tv = new Television();

    Radio radio = new Radio();

    List <ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
    allDevices.add(tv);
    allDevices.add(radio);

    TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);

    DeviceButton turnDevicesOff = new DeviceButton(turnOffDevices);
    turnDevicesOff.press();

    // ----------------------
    turnDevicesOff.undo();
  }

}
