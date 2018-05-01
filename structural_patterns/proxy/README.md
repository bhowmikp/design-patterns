# Proxy

Provide a surrogate or placeholder for another object to control access to it. Class that will limit access to another class. Used for secuirty reasons, because object ins internsive to create, or accessed from remote location.

**Frequency of Use** - 4/5

## UML Class Diagram
![Proxy UML](proxy.gif)

## Participants
The classes and objects participating in this pattern are:
- Proxy (ATMProxy)
  - maintains a reference that lets the proxy access the real subject. Proxy may refer to a Subject if the RealSubject and Subject interfaces are the same.
  - provides an interface identical to Subject's so that a proxy can be substituted for the real subject.
  - controls access to the real subject and may be responsible for creating and deleting it.
  - other responsibilites depend on the kind of proxy:
    - remote proxies are responsible for encoding a request and its arguments and for sending the encoded request to the real subject in a different address space.
    - virtual proxies may cache additional information about the real subject so that they can postpone accessing it.
    - protection proxies check that the caller has the access permissions required to perform a request.
- Subject (ATMData)
  - defines the common interface for RealSubject and Proxy so that a Proxy can be used anywhere a RealSubject is expected.
- RealSubject (ATMMachine)
  - defines the real object that the proxy represents.

## Applicability
Proxy is applicable whenever there is a need for more versatile or sophisticated reference to an object than a simple pointer. Several common situations in which the Proxy pattern is applicable:
- **remote proxy** provides a local representative for an object in a different address space.
- **virtual proxy** creates expensive objects on demand.
- **protection proxy** controls access to the original object. Protection proxies are useful when objects should have different access rights.
- **smart reference** is a replacement for a bare pointer that performs additional actions when an object is accessed. Typical uses include:
  - counting the number of references to the real object so that it can be freed automatically when there are no more references (also called **smart pointers**)
  - loading a persistent object into memory when it's first referenced.
  - checking that the real object is locked before it's accessed to ensure that no other object can change it.

## Benefits
- **Introduces a level of indirection when accessing an object**. Other uses of this indirection are:
  - A remote proxy can hide the fact that an object resides in a different address space.
  - A virtual proxy can perform optimizations such as creating an object on demand.
  - Both protection proxies and smart references allow additional housekeeping tasks when an object is accessed.
- **Copy-on-write is related to creation on demand**. Copying a large and complicated object can be an expensive operation. By using a proxy to postpone the copying process, we ensure that we pay the price of copying the object only if it's modified. Copy-on-write can reduce the cost of copying heavyweight subjects significantly.
