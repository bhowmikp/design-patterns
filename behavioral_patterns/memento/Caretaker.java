import java.util.ArrayList;

public class Caretaker {

  private ArrayList<Memento> mementosList = new ArrayList<>();

  public void addMemento(Memento memento) {
    mementosList.add(memento);
  }

  public Memento getMemento(int index) {
    return mementosList.get(index);
  }
}
