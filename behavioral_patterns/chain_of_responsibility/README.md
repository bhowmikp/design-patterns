# Chain of responsibility

Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

**Frequency of Use** - 2/5

## UML Class Diagram
![Chain UML](chain.gif)

## Participants
The classes and objects participating in this pattern are:
- Handler (Chain)
  - defines an interface for handling requests.
  - (optional) implements the successor link.
- ConcreteHandler (AddNumbers, SubtractNumbers, MultNumbers, DivideNumbers)
  - handles requests it is responsible for.
  - canaccess its successor.
  - if the ConcreteHandler can handle the request, it does so; otherwise it forwards the request to its successor.
- Client (Client)
  - initiates the request to a ConcreteHandler object on the chain.

## Applicability
Use Chain of Responsibility when:
- more than one object may handle a request, and the handler isn't known a priori. The handler should be ascertained automatically.
- you want to issue a request to one of several objects without specifying the receiver explicitly.
- the set of objects that can handle a request should be specified dynamically.

## Benefits
- **Reduced coupling**. The pattern frees an object from knowing which other object handles a request.
- **Added flexibility in assigning responsibilities to objects**. Can add or change responsibilites for handling a request by adding to or otherwise changing the chain at run-time.
