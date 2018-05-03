# Mediator

Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

**Frequency of Use** - 2/5

## UML Class Diagram
![Mediator UML](mediator.gif)

## Participants
The classes and objects participating in this pattern are:
- Mediator (Mediator)
  - defines an interface for communicating with Colleague objects.
- ConcreteMediator (StockMediator)
  - implements cooperative behaviour by coordinating Colleagure objects.
  - knows and maintains its colleagues.
- Colleague classes (Colleague, GoldmanSachs, JPMorgan)
  - each Colleague class knows its Mediator object.
  - each colleague communicates with its mediator whenever it would have otherwise communicated with another colleague.

## Applicability
Use the Mediator pattern when:
- a set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured and difficult to understand.
- reusing an object is difficult because it refers to and communicates with many other objects.
- a behaviour that's distributed between several classes should be customizable without a lot of subclassing.

## Benefits
- **It limits subclassing**. A mediator localizes behaviour that otherwise would be distributed among several objects.
- **It decouples colleagues**. You can vary and reuse Colleague and Mediator classes independently.
- **It simplifies object protocols**. A mediator replaces many-to-many interactions with one-to-many interactions between the mediator and its colleagues. One-to-many relationships are easier to understand, maintain, and extend.
- **It abstracts how objects cooperate**. Making mediation an independent concept and encapsulating it in an object lets you focus on how objects interact apart from their individual behaviour.
- **It centralizes control**. The Mediator pattern trades complexity of interaction for complexity in the mediator.
