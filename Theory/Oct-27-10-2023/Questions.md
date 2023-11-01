1. Define:
  i. Static, Final, Impose. (2x3)
  ii. Private, public, protected. (2x3)
  iii. Inherits, void, implements. (2x3)

- Static:
  - The static keyword in Java is used to create class-level variables and methods that can be accessed without creating an instance of the class.
  - Static variables and methods belong to the class rather than to any instance of the class.
  - Static variables are initialized only once, at the start of the execution of the program.
  - Static methods can be called without creating an instance of the class, and they cannot access non-static variables or methods of the class.
- One 

- Final:
  - The final keyword in Java is used to create constants, which are variables whose value cannot be changed once they are initialized.
  - Final variables can be initialized at the time of declaration or in a constructor.
  - Final methods cannot be overridden by subclasses.
  - Final classes cannot be subclassed.

- Import:
  - The import keyword in Java is used to make classes and interfaces available to the current source code file.
  - Import statements are used to specify the fully qualified name of the class or interface that is being used in the code.
  - Import statements can be used to import a single class or interface, or all the classes and interfaces in a package.
  - Import statements can be used with the static keyword to import static members of a class or interface.

- Access Modifiers in Java are used to control the visibility and accessibility of classes, methods, and variables. There are four access modifiers in Java: private, public, protected, and the default (no modifier).
  - Private Access Modifier:
    - Variables, methods, and constructors that are declared as private can only be accessed within the declared class itself.
    - private access modifier is the most restrictive access level.
    - Classes and interfaces cannot be declared as private.
    - Variables that are declared as private can be accessed outside the class, if public getter methods are present in the class.
    - Using the private modifier is the main way that an object encapsulates itself and hides data from the outside world.
  - Public Access Modifier:
    - 

  - Inheritance in Java
    - Inheritance is a key feature of object-oriented programming (OOP) that allows a new class to be created from an existing class.
    - The new class is called the subclass or derived class, and the existing class is called the superclass or base class.
    - In Java, inheritance is achieved using the extends keyword, which indicates that a class is inherited from another class.
    - The subclass inherits all the members (fields, methods, and nested classes) from its superclass, except for constructors.
    - Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
    - Java supports several types of inheritance, such as single-level, multilevel, hierarchical, and interface inheritance.
  - Void in Java
    - void is a keyword in Java that is used to indicate that a method does not return a value.
    - A method that returns void can still perform operations and modify the state of the object or class.
  - Implements in Java
    - The implements keyword in Java is used to implement an interface.
    - An interface is a collection of abstract methods that define a contract for a class to implement.
    - A class that implements an interface must provide an implementation for all the methods defined in the interface.
    - A class can implement multiple interfaces, but it can only extend one class.




2. Explain:
  Collection Framework. 
  Draw the hierarchy of Collections
- The Collection Framework in Java provides a set of standard interfaces and implementations for data structures such as lists, sets, maps, and queues. It allows collections to be manipulated independently of their implementation details and provides a set of standard implementations that can be used as-is or extended to create custom collections. The Collection Framework consists of a set of interfaces and classes that are organized into two groups: collection interfaces and map interfaces. The Collection Framework provides several benefits, such as reducing the effort required to write code by providing useful data structures and algorithms, increasing the speed and quality of code, and allowing unrelated APIs to pass collection interfaces back and forth.


3. Draw the hierarchy of - Exception Handling