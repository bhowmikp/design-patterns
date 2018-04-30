# Facade

Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use. Creates simplified interface that performs many other actions behind the scenes.

**Frequency of Use** - 5/5

## UML Class Diagram
![Facade UML](facade.gif)

## Participants
The classes and objects participating in this pattern are:
- Facade (BankAccountFacade)
  - knows which subsystem classes are responsible for a request.
  - delegates client requests to appropriate subsystem objects.
- subsystem classes (AccountNumberCheck, SecurityCodeCheck, FundCheck)
  - implement subsystem functionality.
  - handle work assigned by the Facade object.
  - have no knowledge of the facade; that is, they keep no reference to it.

## Applicability
Use the Facade pattern when:
- you want to provide a simple interface to a complex subsystem. Subsystems often get more complex as they evolve. Most patterns, when applied, result in more and smaller classes. This makes the subsystem more reusable and easier to customize, but it also becomes harder to use for clients that don't need to customize it. A facade can provide a simple default view of the subsystem that is good enough for most clients. Only clients needing more customizability will need to look beyond the facade.
- there are many dependencies between clients and the implementation classes of an abstraction. Introduce a facade to decouple the subsystem from clients and other subsystems, thereby promoting subsystem independence and portability.
- you want to layer your subsystem. Use a facade to define an entry point to each subsystem level. If subsystems are dependent, then you can simplify the dependencies between them by making them communicate with each other solely through their facades.

## Benefits
- **It shields clients from subsystem components**, thereby reducing the number of objects that clients deal with and making the subsystem easier to use.
- **It doesn't prevent applications from using subsystem classes if they need to**. Thus you can choose between ease of use and generality.
- **It promotes weak coupling between the subsystem and its clients**. Weak coupling lets you vary the components of the subsystem without affecting its clients. Facade help layer a system and the dependencies between objects. They can eliminate complex or circular dependencies. Reducing compilation dependencies with facades can limit the recompilation needed for a small change in an important subsystem. A facade can also simplify porting systems to other platforms, because it's less likely that building one subsystem requires building all others.
