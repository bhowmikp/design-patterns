# Builder

Seperates the construction of a complex object from its representation so that the same construction process can create different representations. Pattern used to create objects that are made from a bunch of other objects.

**Frequency of Use** - 2/5

## UML Class Diagram
![Builder UML](builder.gif)

## Participants
The classes and objects participating in this pattern are:
- Builder (VehicleBuilder)
  - specifies an abstract interface for creating parts of a Product object.
- ConcreteBuilder (MotorCycleBuilder, CarBuilder, ScooterBuilder)
  - constructs and ssembles parts of the product by implementing the Builder interface.
  - defines and keeps track of the representation it creates.
  - provides an interface for retrieving the product.
- Director (Shop)
  - constructs an object using the Builder interface.
- Product (Vehicle)
  - represents the complex object under constructiom. ConcreteBuilder builds the product's internal representation and defines the process by which it's assembled.
  - includes classes that define the constituent parts, including interfaces for assembling the parts into the final result.

## Applicability
Use the Builder pattern when:
- the algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled.
- the construction process must allow different representation for the object that's constructed.

## Benefits
- **Lets you vary a product's internal representation**. The interface letes the builder hide the representation and internal structure of the product. Also hides how the product is assembled.
- **Isolates code for construction and representation**. Improves modularity by encapsulating the way a complex object is constructed and represented.
- **Gives finer control over the construction process**. Builder pattern constructs the product step by step under the director's control. Only when the product is finished does the director retrieve it from the builder.
