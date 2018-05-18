# Decorator

Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

**Frequency of Use** - 3/5

## UML Class Diagram
![Decorator UML](decorator.gif)

## Participants
The classes and objects participating in this pattern are:
- Component (Pizza)
  - defines the interface for objects that can have responsibilities added to them dynamically.
- ConcreteComponent (PlainPizza)
  - defines an object to which additional responsibilities can be attached.
- Decorator (ToppingDecorator)
  - maintains a reference to a Component object and defines an interface that conforms to Component's interface.
- ConcreteDecorator (Mozzarella, TomatoSauce)
  - adds responsibilities to the component.

## Applicability
Use the Decorator pattern:
- to add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects.
- for responsibilities that can be withdrawn.
- when extension by subclassing is impractical. Sometimes a large number of independent extensions are possible and would produce an explosion of subclasses to support every combination. Or a class definition may be hidden or otherwise unavailable for subclassing.
- need capabilities of inheritance, but need to add functionality at runtime.

## Benefits
- **More flexibility than static inheritance**. The Decorator pattern provides a more flexible way to add responsibilities to objects than can be had with static (multiple) inheritance. With decorators, responsibilities can be added and removed at run-time simply by attaching and detaching them. Decorators also make it easy to add a property twice.
- **Avoids feature-laden classes high up in the hierarchy**. Define a simple class and add functionality incrementally.
 - **A decorator and its component aren't identical**. A decorator acts as a transparent enclosure.
- **Lots of little objects**. Easy to customize, but hard to learn and debug.
