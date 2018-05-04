public class Originator {

  private String state;
 /* lots of memory consumptive private data that is not necessary to define the
  * state and should thus not be saved. Hence the small memento object. */

  public void setState(String state) {
    System.out.println("Originator: Setting state to " + state);
    this.state = state;
  }

  public void getState() {
    System.out.println("Originator: Current memento is " + state);
  }

  public Memento save() {
    System.out.println("Originator: Saving to Memento.");
    return new Memento(state);
  }

  public void restore(Memento m) {
    state = m.getState();
    System.out.println("Originator: State after restoring from Memento: " + state);
  }
}
