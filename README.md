
# Array Manipulator

This repository contains a Java project focused on array manipulation algorithms. The `ArrayManipulator` class includes methods for performing various operations on an array, such as insertion, removal, printing, and index searching.


## Introduction
This Java project showcases a simple array manipulation class, `ArrayManipulator`, offering functionalities to manage an array dynamically. It includes methods for insertion, deletion, and searching for elements within the array.

## Getting Started
Ensure you have Java installed on your system to compile and run the `Main` class.

To compile the code:
```bash
javac Main.java
```

To run the code:
```bash
java Main
```

## Usage
The `Main` class demonstrates the usage of the `ArrayManipulator` methods by performing various operations on an array.

### Example
```java
Array numbers = new Array(5);
numbers.insert(10);
numbers.insert(20);
numbers.insert(30);
numbers.insert(40);
numbers.insert(50);
numbers.print();

// Remove element at index 3
numbers.removeAt(3);
numbers.print();

// Find index of element 50
System.out.println(numbers.indexOf(50));
```

## Methods
- `insert(int item)`: Inserts an element into the array.
- `removeAt(int index)`: Removes the element at the specified index.
- `indexOf(int item)`: Returns the index of the specified element.
- `print()`: Prints the elements in the array.
- `printDivider()`: Prints a divider for better visualization.
