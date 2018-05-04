public class Client {

  public static void main(String[] args) {

    Caretaker caretaker = new Caretaker();
    Originator originator = new Originator();

    originator.setState("State1");
    originator.setState("State2");
    caretaker.addMemento( originator.save() );

    originator.setState("State3");
    caretaker.addMemento( originator.save() );

    originator.setState("State4");

    // Current memento
    originator.getState();

    // First saved memento
    originator.restore( caretaker.getMemento(0) );

    // Second saved memento
    originator.restore( caretaker.getMemento(1) );

  }
}
