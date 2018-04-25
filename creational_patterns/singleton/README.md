# Singleton

A class of which only a single instance can exist, and provides a global point of access to it.

**Frequency of Use** - 4/5

## UML Class Diagram
![singleton_uml][singleton.gif]

## Participants
The classes and objects participating in this pattern are:
- Singleton (LoadBalancer)
  - defines an Instance operation that lets clients access its unique instance. Instance is a class operation.
  - responsible for creating and maintaining its own unique instance.

## Applicability
Use the singleton pattern when:
- there must be exactly one instance of a class, and it must be accessible to clients from well-known access point
- when the sole instance should be extensible by subclassing, and clients should be able to use an extended instance without modifying their code

## Benefits
- **Controlled accessto sole instance**. Since Singleton class encapsulates its sole instance, it can have strict control over how and when clients access it.
- **Reduced name space**. The Singleton pattern is an improvement over global variables. It avoids polluting the name space with global variable that store sole instances.
- **Permits refinement of operations and representation**. The Singleton class may be subclassed, and it's easy to configure an application with an instance of this extended class. You can configure the application with an instance of the class you need at run-time.
- **Permits a variable number of instances**. Makes it easy to change mind and allow more than one instance of the Singleton class.
- **More flexible than class operations**.
