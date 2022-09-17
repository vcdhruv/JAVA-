/*
a constructor is a block of codes similar to the method. It is called when an instance of the class
is created.

There are two rules defined for the constructor.

Constructor name must be the same as its class name
A Constructor must have no explicit return type
A Java constructor cannot be abstract, static, final, and synchronized

Note: We can use access modifiers
while declaring a constructor. It controls the object creation. 
In other words, we can have private, protected, public or default constructor in Java.

There are two types of constructors in Java:

Default constructor (no-arg constructor)
Parameterized constructor


Java Default Constructor
A constructor is called "Default Constructor" when it doesn't have any parameter.

Syntax of default constructor:
<class_name>(){}  

Rule: If there is no constructor in a class, compiler automatically creates a default constructor.

/// interview type Q) What is the purpose of a default constructor?
The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.

Java Parameterized Constructor
A constructor which has a specific number of parameters is called a parameterized constructor.

Why use the parameterized constructor?
The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

Constructor Overloading in Java
In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.

Constructor overloading in Java
is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.

Java Copy Constructor :
There is no copy constructor in Java. However, we can copy the values from one object to another.
There are many ways to copy the values of one object into another in Java. They are:

By constructor
By assigning the values of one object into another
By clone() method of Object class

Q) Does constructor return any value?
Yes, it is the current class instance (You cannot use return type yet it returns a value).

Can constructor perform other tasks instead of initialization?
Yes, like object creation, starting a thread, calling a method, etc. You can perform any operation in the constructor as you perform in the method.

Is there Constructor class in Java?
Yes.

What is the purpose of Constructor class?
Java provides a Constructor class which can be used to get the internal information of a constructor in the class. It is found in the java.lang.reflect package.
*/
