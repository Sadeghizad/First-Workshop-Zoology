# First Workshop - Zoology

A simple hierarchy to learn OOP concepts like Interfaces, Inheritance, Polymorphism, and Abstraction.

## Overview

This project simulates a zoology system using Object-Oriented Programming (OOP) principles. It demonstrates how real-world entities (like animals) can be represented as classes, with shared characteristics and behaviors defined through interfaces, abstract classes, and inheritance.

## Class Hierarchy

The project consists of the following classes and interfaces:

1. **`Creature` (Interface)**: The base interface representing any living creature.
2. **`Mammal` (Abstract Class)**: An abstract class implementing the `Creature` interface, representing mammals.
3. **`Cat` (Class)**: A subclass of `Mammal` that implements the `Carnivore` interface.
4. **`Human` (Class)**: A subclass of `Mammal` that implements both the `Carnivore` and `Herbivore` interfaces.
5. **`Carnivore` (Interface)**: Represents creatures that consume meat.
6. **`Herbivore` (Interface)**: Represents creatures that consume plants.

### Class Diagram

```plaintext
+-------------------+
|     Creature      |
|   (Interface)     |
+-------------------+
        ^
        |
+-------------------+
|       Mammal      |
|  (Abstract Class) |
+-------------------+
        ^
        |
+-------------------+       +-------------------+
|        Cat        |       |       Human       |
|      (Class)      |       |      (Class)      |
+-------------------+       +-------------------+
| - implements      |       | - implements      |
|     Carnivore     |       |     Carnivore,    |
|                   |       |     Herbivore     |
+-------------------+       +-------------------+
```

## What should you do?

Your task is to complete the implementation of the classes as described in the hierarchy.

## How to get started

1. Clone the repo in your local machine:

```bash
git clone <url>
```
2. Open the project in Intellij IDEA or your IDE
3. Complete the implementations
4. Commit & Push your changes
```bash
git commit -m "message"
```
```bash
git push
```

## Conclusion

This exercise is designed to help you understand key OOP concepts by modeling real-world entities. By completing this project, you'll gain a better understanding of interfaces, abstract classes, inheritance, and polymorphism.

Happy coding! 🚀
