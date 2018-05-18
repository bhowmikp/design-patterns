# Factory Method

Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclass.

**Frequency of Use** - 5/5

## UML Class Diagram
![Factory Method UML](factory.gif)

## Participants
The classes and objects participating in this pattern are:
- Product (Shape)
  - defines the interface of objects the factory method creates.
- ConcreteProduct (Circle, Square, Rectangle)
  - implements the product interface.
- Creator (Client)
  - declares the factory method, which returns an object of type Product. Creator may also define a default implementation of the factory method that returns a default ConcreteProduct object.
  - may call the factory method to create a Product object.
- ConcreteCreator (ShapeFactory)
  - overrides the factory method to return an instance of a ConcreteProduct.

## Applicability
Use the Factory Method pattern when:
- a class can't anticipate the class of objects it must create.
- a class wants its subclasses to specify the objects it creates.
- classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate.

## Benefits
- **Only deals with the Product interface; therefore it can work with any user-defined ConcreteProduct classes**.
- **Provides hooks for subclasses**. Creating objects inside a class with a factory method is always more flexible than creating an object. Factory Method gives subclasses a hook for providing an extended version of an object.
- **Connects parallel class hierarchies**.
