package com.company;

public class InterviewPrepQs {

    // 1) What are the 4 principles of Object Oriented Programming?
    // Abstraction, Polymorphism, Inheritance, Encapsulation

    // 2) Explain Abstraction
    // Allows you to only show the functionality to the user. The implementation details are hidden from the user.
    // Ex. If you have a function adding (num1 (2), num2 (3)). The adding is done without the user knowing how it was added.
    // All the user sees is the result (4). You could change how the two numbers are added behind the scenes with the
    // result being the same.

    // 3) Explain Polymorphism
    // SAME NAME, MANY FORMS. Use the same word or term to mean different things depending on the context. This occurs
    // when we have classes that are related to each other via inheritance.
    // Ex. People can have different characteristics. A woman can be a mother, daughter, and employee all at the same time
    // but takes on one of those roles depending on the context of the situation.
    // TWO TYPES: Compile-time or static (method overloading) and Runtime (method overriding)

    // 4) Explain Inheritance
    // When a child (subclass) class inherits the properties (methods and fields) of the parent (superclass) class.
    // Ex. A child inherits the traits of his/her parents.

    // 5) Explain Encapsulation
    // Includes public, protected, private & default access modifiers to access the fields in a class.
    // Ex. Having an instagram account and keeping it private only allows people you accept to follow your posts and have
    // access to your content. If your account is public then anyone can have access to the content you post.

    // 6) What are the 4 Access Modifiers and their access specifiers?
    // PUBLIC: Class, Package, Subclass, Global, Variable   PROTECTED: Class, Package, Subclass  DEFAULT: Class, Package
    // PRIVATE: Class, Variable

    // 7) What are the 5 SOLID principles?
    // Single Responsibility, Open/Close Principle, Liskov's Substitution Principle, Interface Segregation Principle,
    // & Dependency Inversion

    // 8) Explain Single Responsibility
    // Every class should have one main use or responsibility. Classes with single responsibility are easier to explain,
    // understand, and implement
    // Ex. In accounting one employee deals with payroll only, another deals with accounts receivable, etc. They all
    // have a single responsibility within the accounting/bookkeeping for the company.

    // 9) Explain Open/Close Principle
    // "open to extension, but closed for modification" Write your code so that you will be able to add new functionality
    // without changing the existing code. This prevents situations in which a change to one of your classes also requires
    // you to adapt all depending classes.
    // Ex. An electric adapter in the wall is always closed for modification (we cannot change it once it is fitted).
    // But an adapter or extension chord allows us to extend it.

    // 10) Liskov's Substitution Principle
    // Objects in a program should be replaceable with instances of their subtypes without altering the correctness of
    // that program
    // Ex. A farmer's son should inherit the farming skills from his father and be able to replace his father if needed.

    // 11) Interface Segregation Principle
    // "many client-specific interfaces are better than one general-purpose interface". Interfaces created should only
    // have methods that offer the functionality you are looking for, not empty methods you'll never use. This principle
    // helps reduce side effects and frequency of required changes.
    // Ex. You go to a restaurant as a vegan and are handed a menu with options that include more than just vegan options.
    // What you really need is just a menu with vegan options instead of a menu with all the foods you cannot eat.

    // 12) Dependency Inversion
    // "depend upon abstractions, not concretions". Details should depend upon abstractions, abstractions should not depend
    // upon details. This principle makes your code more reusable.
    // Ex. TV remote battery. Your remote needs a battery but it's not dependent on the battery brand. You can use any
    // brand that you want and it will work. The TV remote is loosely coupled with the brand name.

    // 13) What is the difference between overloading and overriding?
    // Overloading = two or more methods have the same method name but different parameters
    // Overriding = two methods with the same name and parameters. One method is in the parent class and the other in the
    // child class. Overriding changes the behavior of the method.
    // Ex. CODE THIS.

    // 14) What is the difference between an abstract class and an interface?
    // Abstract Class = can contain non abstract and default methods; can have any access modifiers
    // Interface = only contains method signatures; can only be public (public static final)
    // A class can only extend one abstract class, but can implement multiple interfaces. Both can let you use classes
    // of the same supertype.
    // Ex. CODE THIS.

    // 15) For interface and abstract class, why would you use one over the other?
    // You can implement multiple interfaces but can only extend one abstract class. You can flesh out methods more
    // fully in an abstract class; Interfaces are for empty methods.

    // 16) What is the difference between "Collection" and "Collections"?
    // Collection = an interface; root interface in collection hierarchy
    // Collections = a utility class present in java.util.package to define several utility methods (sorting, searching)
    // for collection objects; collections is a class which has some static methods and that method returns the collection


    // 17) What is an ArrayStoreException? Is it checked or unchecked?
    // thrown to indicate that an attempt has been made to store the wrong type of object into an array of objects.
    // It is an unchecked error that occurs at runtime.

    // 18) Describe JVM, JDK, JRE
    // JDK: Java development kit = tool necessary to compile, document and package Java programs (like SDK)
    // JRE: A subset of the JDK for end-users and developers who want to redistribute the runtime environment alone.
    // The Java runtime environment consists of the Java virtual machine, the Java core classes, and supporting files.
    // JVM: The java virtual machine is a specification that provides runtime environment in which java byte code can be
    // executed.

    // 19) What is a HashMap?
    // HashMapu is a map based collection class that is used for storing Key & Value pairs, does not sort the stored keys
    // and values

    // 20) Why is a HashMap unsorted?
    // - it is sorted by Java's own internal logic; entries are sorted by hashcode. It is not sorted in any human-readable way
    // - HashMaps are SETS of key-value pairs, and sets are often unsorted sets of unique values.

    // 21) What is the difference between Comparable and Comparator?
    // Comparable = this interface has one method, compareTo(). Class with objects to be sorted must implement this
    // Comparable interface
    // Comparator = this interface has two methods, equals() and compare(). Class with objects to be sorted do not need
    // to implement this Comparator interface

    // 22) What is Class Loader?
    // Part of JVM which is used to load classes and interfaces

    // 23) What are the 5 exception keywords?
    // Try, Catch, Finally Throw, Throws

    // 24) Difference between throw and throws?
    // "Throws" goes in signature: void method() throws Exception {}
    // "Throw" goes in method body: void method() { throws new Exception; }

    // 25) Difference between Final, Finally, Finalize?
    // Final: final is a keyword used to apply restrictions on class, method and variable. Final class can't be inherited,
    // final method can't be overridden and final variable value can't be charged.
    // Finally: Finally is a code block used to place important code, it will be executed whether exception is handled
    // or not.
    // Finalize: Finalize is a method used to perform clean up processing just before object is garbage collected.
    // Ex. CODE THIS.

    // 26) What is Dictionary in Java?
    // the dictionary class is the abstract parent of any class, such as Hashtable, which maps keys to values. Any
    // non-null object can be used as a key and as a value.

    // 27) Which collection is the fastest?
    // in case of index value pair- arraylist, value- hashset and key value pair- hashmap

    // 28) What is an instance variable?
    // an attribute or field of an object

    // 29) What is the finalize method?
    // the method called before garbage collection on any Java object.

    // 30) What is an access modifier?
    // a keyword that describes who or what can access or modify the state of an object.
    // Ex. public, private, default, protected

    // 31) What is an abstract class?
    // a class that contains one or more abstract methods, and therefore can never be instantiated. Abstract classes are
    // defined so that other classes can extend them and make them concrete by implementing the abstract methods

    // 32) What is an abstract method?
    // a method that has no implementation.
    // Ex. interface methods are abstract

    // 33) What is an API?
    // application programming interface. The specification of how a programmer writing an application accesses the behavior
    // and state of classes and objects.


    // 34) What is autoboxing?
    //  automatic conversion between reference (Wrapper classes) and primitive types. DONE BY COMPILER.

    // 35) What is a class variable?
    // a data item associated with a particular class as a whole-not with particular instances of the class. Class
    // variables are defined in class definitions. Also called a static field.

    // 36) What is a class path?
    // an environmental variable which tells the Java virtual machine and Java technology based applications where to
    // find the class libraries, including user-defined class libraries.

    // 37) What does DOM stand for?
    // document object model

    // 38) What is an enumerated type?
    // a type whose legal values consist of a fixed set of constants.
    // Ex. enum colors = {BLACK, BLUE, PURPLE, RED};

    // 39) Explain garbage collection
    // the automatic detection and freeing of memory that is no longer in reference. The Java runtime system performs
    // garbage collection so that programmers never explicitly free objects.

    // 40) Explain what a generic is.
    // a class, interface, or method that declares one or more type variables. These type variables are known as type parameters.
    // A generic declaration defines a set of parameterized types, one for each possible invocation of the type
    // parameter section. At runtime, all of these parameterized types share the same class, interface, or method.

    // 41) Why use generics?
    // makes for more readable code and lets your IDE help you find errors before compile time; ensures every time we
    // use this method that it's done precisely the way the method is built for; this way our method only runs with a
    // type declaration, the type needs to be passed to the method when it's called, and the type is assigned to the box
    // that is created; that way in the future if we ever do anything with for example Milk box or Orange box they can
    // only handle specifically the things they are allowed to handle; all of this adds security to your code as well as
    // it prevents a theoretical box from having the wrong things placed in it, which prevents exploits you may not see
    // at first glance in a more complicated codebase

    // 42) Explain type erasure.
    // the deletion of peramatized types at runtime

    // 43) Explain JAR (Java Archive)
    // package file format used to aggregate many Java class file and associated metadata and resources into one file
    // for distribution. They include a Java-specific manfiest file. They are built on the ZIP format and typically
    // have a far file extension.

    // 44) Why is Java considered dynamic?
    // platform-independent file format that aggregates many files into one. Multiple applets written in the Java
    // programming language, and their requisite components can be bundled in a JAR file and subsequently downloaded to
    // a browser in a single HTTP transaction.
    // It is designed to adapt to an evolving environment. Java programs can carry an extensive amount of run-time info
    // that can be used to verify and resolve accesses to objects at run-time.

    // 45) What does it mean to be multithreaded?
    // designed to have parts of its code execute concurrently

    // 46) What does it mean to be protected?
    // signifies that the method or variable can only be accessed by elements residing in its class, subclasses,
    // or classes in the same package

    // 47) What is serialization?
    // object created from incoming data (JSON, XML, CSV, etc.)


}
