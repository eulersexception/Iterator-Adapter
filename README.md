# Adapter and Iterator Patterns

In this exercise, we want to to look at the Iterator and the Adapter patterns.
The Iterator pattern is a very commonly used design pattern in the Java 
programming language. This pattern is used to access the elements of a collection 
object in sequential manner without any need to know its underlying representation.

The iterator pattern is implemented in Java for all classes which implement a Collection.

![Java Collections](https://www3.ntu.edu.sg/home/ehchua/programming/java/images/Collection_interfaces.png)

The Enumeration interface defines the methods by which you can enumerate 
(obtain one at a time) the elements in a collection of objects.
This legacy interface has been superceded by Iterator. 
Although not deprecated, Enumeration is considered obsolete for new code. 
However, it is used by several methods defined by legacy classes such 
as Vector and Properties, and it is used by several other API classes, 
and is currently in widespread use in application code.

In this exercise we want to implement iterating though a list with an Iterator and with an Enumeration.
Since the Enumeration interface is not directly implemented for a list, we will write an
Adapter from Enumeration to Iterator.



### Part 1: Iterator Pattern
A List is a collection in Java and it can use an Iterator. Listing the elements of a list
can be done in Java in a number of different ways (see: 
[https://www.baeldung.com/java-iterate-list](https://www.baeldung.com/java-iterate-list)).
Implement different ways to iterate over a List in Java.

**You have the following tasks in the class IterateThroughArrayLists:**

1. ✅[iterate using a basic for loop](testFor)
Use `for (int i= 0; i< ...)` and print the list items using `System.out.println()`.

2. ✅[iterate using an enhanced for loop](testShortFor)
Use `for (T temp: myList)` and print the list items using `System.out.println()`.

3. ✅[iterate using a while loop](testWhile)
Use `while` and print the list items using `System.out.println()`.

4. ✅[iterate using a foreach and a lambda expression](testForEachAndLambda)
Use `mylist.foreach (...)` and print the list items using `System.out.println()`.

5. ✅[iterate using an Iterator](testIterator)
and print the list items using `System.out.println()`.


### Part 2: Adapter Pattern

Write an `IteratorToEnumerationAdapter` which implements the Enumeration interface. 
The Enumeration interface has the methods:

- `boolean hasMoreElements()`: When implemented, it must return true while there are still 
  more elements to extract, and false when all the elements have been enumerated.
- `Object nextElement()`: This returns the next object in the enumeration as a generic Object 
reference.

Use an Iterator to implement the methods in the `IteratorToEnumerationAdapter`.

**You have the following tasks:**

1. ✅[implement `hasMoreElements()`](testMethods[IteratorToEnumerationAdapter])

2. ✅[implement `nextElement()`](testMethods[IteratorToEnumerationAdapter])

3. ✅[iterate over the List in Part 1 with an enumeration](testEnumerationAdapter)
and print the list items using `System.out.println()`.
