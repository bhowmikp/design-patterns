# Abstract Factory

Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

**Frequency of Use** - 5/5

## UML Class Diagram
![Abstract Factory UML](abstract.gif)

## Participants
The classes and objects participating in this pattern are:
- AbstractFactory (AbstractFactory)
  - declares an interface for operations that create abstract product objects.
- ConcreteFactory (ShapeFactory, ColourFactory)
  - implements the operations to create concrete product objects.
- AbstractProduct (Shape, Colour)
  - declares an interface for a type of product object.
- ConcreteProduct (Circle, Square, Rectangle, Red, Green, Blue)
  - defines a product object to be created by the corresponding concrete factory.
  - implements the AbstractProduct interface.
- Client (Client)
  - uses only interfaces declared by AbstractFactory and AbstractProduct classes.

## Applicability
Use the Abstract Factory pattern when:
- a system should be independent of how its products are created, composed, and represented.
- a system should be configured with one of multiple families of products.
- a family of related product objects is designed to be used together, and you need to enforce this constraint.
- you want to provide a class library of products, and you want to reveal just their interfaces, not their implementations.

## Benefits
- **Isolates concrete classes**. Helps you control the classes of objects that an application creates.
- **Makes exchanging product families easy**. The class of a concrete factory appears only once.
- **Promotes consistency among products**.
