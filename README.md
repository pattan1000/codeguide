#Creating Objects

As you know, a class provides the blueprint for objects; you create an object from a class. Each of the following statements taken from the CreateObjectDemo program creates an object and assigns it to a variable:
```
Point originOne = new Point(23, 94);
Rectangle rectOne = new Rectangle(originOne, 100, 200);
Rectangle rectTwo = new Rectangle(50, 100);
The first line creates an object of the Point class, and the second and third lines each create an object of the Rectangle class.
```
Each of these statements has three parts (discussed in detail below):

Declaration: The code set in bold are all variable declarations that associate a variable name with an object type.
Instantiation: The new keyword is a Java operator that creates the object.
Initialization: The new operator is followed by a call to a constructor, which initializes the new object.

#Declaring a Variable to Refer to an Object

Previously, you learned that to declare a variable, you write:

type name;
This notifies the compiler that you will use name to refer to data whose type is type. With a primitive variable, this declaration also reserves the proper amount of memory for the variable.

You can also declare a reference variable on its own line. For example:

Point originOne;
If you declare originOne like this, its value will be undetermined until an object is actually created and assigned to it. Simply declaring a reference variable does not create an object. For that, you need to use the new operator, as described in the next section. You must assign an object to originOne before you use it in your code. Otherwise, you will get a compiler error.
Instantiating a Class

The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory. The new operator also invokes the object constructor.

Note: The phrase "instantiating a class" means the same thing as "creating an object." When you create an object, you are creating an "instance" of a class, therefore "instantiating" a class.
The new operator requires a single, postfix argument: a call to a constructor. The name of the constructor provides the name of the class to instantiate.

The new operator returns a reference to the object it created. This reference is usually assigned to a variable of the appropriate type, like:

Point originOne = new Point(23, 94);
The reference returned by the new operator does not have to be assigned to a variable. It can also be used directly in an expression. For example:

int height = new Rectangle().height;
This statement will be discussed in the next section.

#Initializing an Object

Here's the code for the Point class:
```
public class Point {
    public int x = 0;
    public int y = 0;
    //constructor
    public Point(int a, int b) {
        x = a;
        y = b;
    }
}
```
This class contains a single constructor. You can recognize a constructor because its declaration uses the same name as the class and it has no return type. The constructor in the Point class takes two integer arguments, as declared by the code (int a, int b). The following statement provides 23 and 94 as values for those arguments:
Instantiating a Class

The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory. The new operator also invokes the object constructor.

Note: The phrase "instantiating a class" means the same thing as "creating an object." When you create an object, you are creating an "instance" of a class, therefore "instantiating" a class.
The new operator requires a single, postfix argument: a call to a constructor. The name of the constructor provides the name of the class to instantiate.

The new operator returns a reference to the object it created. This reference is usually assigned to a variable of the appropriate type, like:

Point originOne = new Point(23, 94);
The reference returned by the new operator does not have to be assigned to a variable. It can also be used directly in an expression. For example:

int height = new Rectangle().height;
This statement will be discussed in the next section.

Initializing an Object

Here's the code for the Point class:
```
public class Point {
    public int x = 0;
    public int y = 0;
    //constructor
    public Point(int a, int b) {
        x = a;
        y = b;
    }
}
```
This class contains a single constructor. You can recognize a constructor because its declaration uses the same name as the class and it has no return type. The constructor in the Point class takes two integer arguments, as declared by the code (int a, int b). The following statement provides 23 and 94 as values for those arguments:
```
Point originOne = new Point(23, 94);
```
#Useful references:

Writing good Java code : Creating Class and Object [Link.](https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html)
#Exercise

Please following by TODO.
[Exercise 1](https://github.com/pattan1000/codeguide/blob/master/src/Bicycle.java) 
[Exercise 2](https://github.com/pattan1000/codeguide/blob/master/src/Rectangle.java)
