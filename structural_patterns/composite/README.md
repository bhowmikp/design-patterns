# Composite

Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

**Frequency of Use** - 4/5

## UML Class Diagram
![Composite UML](composite.gif)

## Participants
The classes and objects participating in this pattern are:
- Component (SongComponent)
  - declares the interface for objects in the composition.
  - implements default behavior for the interface common to all classes, as appropriate.
  - declares an interface for accessing and managing its child components.
  - (optional) defines an interface for accessing a component's parent in the recursive structure, and implements it if that's appropriate.
- Leaf (Song)
  - represents leaf objects in the composition. A leaf has no children.
  - defines behavior for primitive objects in the composition.
- Composite (SongGroup)
  - defines behavior for components having children.
  - stores child components.
  - implements child-related operations in the Component interface.
- Client (Client)
  - manipulates objects in the composition through the Component interface.

## Applicability
Use the Composite pattern when:
- you want to represent part-whole hierarchies of objects.
- you want clients to be able to ignore the difference between compositions of objects and individual objects. Clients will treat all objects in the composite structure uniformly.

## Benefits
- **defines class and hierarchies consisting of primitive objects and composite objects**. Primitive objects can be composed into more complex objects, which in turn can be composed, and so on recursively.
- **make the client simple**. Clients can treat the composite structures and individual objects uniformly.
- **makes it easier to add new kinds of components**.
