# Iterator

Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

**Frequency of Use** - 5/5

## UML Class Diagram
![Iterator UML](iterator.gif)

## Participants
The classes and objects participating in this pattern are:
- Iterator (Iterator)
  - defines an interface for accessing and traversing elements.
- ConcreteIterator (NameIterator)
  - implements the Iterator interface.
  - keeps track of the current position in the traversal of the aggregate.
- Aggregate (Container)
  - defines an interface for creating an Iterator object.
- ConcreteAggregate (NameRepository)
  - implements the Iterator creation interface to return an instance of the proper ConcreteIterator.

## Applicability
Use the Iterator pattern
- to access an aggregate object's contents without exposing its internal representation.
- to support multiple traversals of aggregate objects.
- to provide a uniform interface for traversing different aggregate structures (that is, to support polymorphic iteration)

## Benefits
- **It supports variations in the traversal of an aggregate**. Complex aggregates may be traversed in many ways. Iterators make it easy to change the traversal algorithm.
- **Iterators simplify the Aggregate interface**. Iterator's traversal interface obviates the need for a similar interface in Aggregate, thereby simplifying the aggregate's interface.
- **More than one traversal can be pending on an aggregate**. An iterator keeps track of its own traversal state. Therefore you can have more than one traversal in progress at once.
