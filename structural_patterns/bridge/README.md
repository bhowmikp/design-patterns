# Bridge

Decouple an abstraction from its implementation so that the two can vary independenty.

**Frequency of Use** - 3/5

## UML Class Diagram
![Bridge UML](bridge.gif)

## Participants
The classes and objects participating in this pattern are:
- Abstraction (Shape)
  - defines the abstraction's interface
  - maintains a reference to an object of type Implementor.
- RefinedAbstraction (Circle)
  - Extends the interface defined by Abstraction.
- Implementor (DrawAPI)
  - defines the interface for implementation classes. This interface doesn't have to correspond exactly to Abstraction's interface; in fact the two interfaces can be quite different. Typically the Implementor interface provides only primitive operations, and Abstraction defines higher-level operations based on these primitives.
- ConcreteImplementor (RedCircle, GreenCircle)
  - implements the Implementor interface and defines its concrete implementation.

## Applicability
Use the Bridge pattern when:
- you want to avoid a permanent binding between an abstraction and its implementation.
- both the abstractions and their implementations should be extensible by subclassing. In this case, the Bridge pattern lets you combine the different abstractions and implementations and extend them independenty.
- changes in the implementation of an abstraction should have no impact on clients; the code should not have to be recompiled.

## Benefits
- **Decoupling interface and implementation**. An implementation is not bound permanently to an interface. The implementation of an abstraction can be configured at run-time.
- **Improved extensibility**. Extend the Abstraction and Implementor hierarchies independenty.
- **Hiding implementation details from clients**.
