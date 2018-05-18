# Strategy

Define a family of algorithms, encapsulates each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

**Frequency of Use** - 4/5

## UML Class Diagram
![Strategy UML](strategy.gif)

## Participants
The classes and objects participating in this pattern are:
- Strategy (Strategy)
  - declares an interface common to all supported algorithms. Context uses this interface to call the algorithm defined by a ConcreteStrategy.
- ConcreteStrategy (OperationAdd, OperationSubtract, OperationMultiply)
  - implements the algorithm using the Strategy interface.
- Context (Context)
  - is configured with a ConcreteStrategy object.
  - maintains a reference to a Strategy object.
  - may define an interface that lets Strategy access its data.

## Applicability
Use the Strategy pattern when:
- many related classes differ only in their behavior. Strategies provide a way to configure a class with many behaviors.
- you need different variants of an algorithm. For example, you might define algorithms reflecting different space/time trade-offs. Strategies can be used when these variants are implemented as a class hierarchy of algorithms.
- an algorithm uses data that clients shouldn't know about. Use the Strategy pattern to avoid exposing complex, algorithm-specific data structures.
- a class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals, move related conditional branches into their own Strategy class.

## Benefits
- **Families of related algorithms**. Hierarchies of Strategy class define a family of algorithms or behaviors for contexts to reuse.
- **An alternative to subclassing**. Inheritance offers another way to support a variety of algorithms or behaviors.
- **Strategies eliminate conditional statements**. The Strategy pattern offers an alternative to conditional statements for selecting desired behavior.
- **A choice of implementations**. Strategies can provide different implementations of the same behavior. The client can choose among strategies with different time and space trade-offs.
