# State

Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

**Frequency of Use** - 3/5

## UML Class Diagram
![State UML](state.gif)

## Participants
The classes and objects participating in this pattern are:
- Context (Context)
  - defines the interface of interest to clients.
  - maintains an instance of a  ConcreteState subclass that defines the current state.
- State (State)
  - defines an interface for encapsulating the behavior associated with a particular state of the Context.
-ConcreteState subclasses (StartState, StopState)
  - each subclass implements a behavior associated with a state of the Context.

## Applicability
Use the State pattern in either of the following cases:
- An object's behavior depends on its state, and it must change its behavior at run-time depending on the state.
- Operations have large, multipart conditional statements that depend on the object's state. This state is usually represented by one or more enumerated constants. Often, several operations will contain this same conditional structure. The State pattern puts each branch of the conditional in a separate class. This lets you treat the object's state as an object in its own right that can vary independently from other objects.

## Benefits
- **It localizes state-specific behavior and partitions behavior for different states**. The State pattern puts all behavior associated with a particular state into one object. Because all state-specific code lives in a State subclass, new states and transitions can be added easily by defining new subclasses.
- **It makes state transitions explicit**. When an object defines its current state solely in terms of internal data values, its state transitions have no explicit representation; they only show up as assignments to some variables. Introducing separate objects for different states makes the transitions more explicit.
- **State objects can be shared**. If State objects have no instance variables then contexts can share a State object.
