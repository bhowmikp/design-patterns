// Clonable tells Java that it is okay to copy instances of this class
// The instances of this class will be stored in different locations of memory
// It is a copy but not a reference
public interface Animal extends Cloneable {

  public Animal makeCopy();

}
