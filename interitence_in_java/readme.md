# 🧬 Inheritance in Java

<div align="center">

### 🚀 Object-Oriented Programming with Java

> **Learn once. Understand deeply. Build everywhere.**

![Java](https://img.shields.io/badge/Java-OOP-orange?style=for-the-badge\&logo=openjdk\&logoColor=white)
![Topic](https://img.shields.io/badge/Topic-Inheritance-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner%20→%20Intermediate-success?style=for-the-badge)

</div>

---

## 📚 About This Folder

This folder contains my practice and learning material for **Inheritance in Java**, one of the core pillars of **Object-Oriented Programming (OOP)**.

The goal of this section is to understand how classes can reuse and extend the properties and behaviors of other classes while learning important concepts such as:

* 🧬 Class Inheritance
* 🔄 Method Overriding
* 🏗️ Constructors in Inheritance
* 🎯 `this` & `super` Keywords
* ⚡ Dynamic Method Dispatch

---

## 🗂️ Topics Covered

| #  | File                                   | Concept                         |
| -- | -------------------------------------- | ------------------------------- |
| 01 | `inheritence_in_java.java`             | 🧬 Basic Inheritance            |
| 02 | `method_overrinding.java`              | 🔄 Method Overriding            |
| 03 | `constructor_in_inheritence.java`      | 🏗️ Constructors in Inheritance |
| 04 | `this_and_super_keywords_in_java.java` | 🎯 `this` & `super` Keywords    |
| 05 | `Dynamic_method_dispatch_in_java.java` | ⚡ Dynamic Method Dispatch       |

---

## 🧠 What I Learned

### 🧬 1. Inheritance

Inheritance allows one class to acquire the properties and methods of another class.

```java
class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void display() {
        System.out.println("Class B");
    }
}
```

Here, `B` inherits the functionality of `A` using the `extends` keyword.

---

### 🔄 2. Method Overriding

Method overriding allows a child class to provide its own implementation of a method already defined in the parent class.

```java
class A {
    void show() {
        System.out.println("Parent");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("Child");
    }
}
```

This is an important concept for achieving **runtime polymorphism**.

---

### 🏗️ 3. Constructors in Inheritance

Constructors are not inherited, but when an object of a child class is created, the parent class constructor is called as part of the initialization process.

This helped me understand how Java initializes objects across an inheritance hierarchy.

---

### 🎯 4. `this` and `super`

Two important keywords:

| Keyword | Purpose                              |
| ------- | ------------------------------------ |
| `this`  | Refers to the current object         |
| `super` | Refers to the immediate parent class |

Example:

```java
class B extends A {

    int x = 20;

    void display() {
        System.out.println(this.x);
        System.out.println(super.x);
    }
}
```

---

### ⚡ 5. Dynamic Method Dispatch

Dynamic Method Dispatch allows Java to determine which overridden method should execute **at runtime**.

```java
A obj = new B();
obj.show();
```

Even though the reference is of type `A`, Java can execute the overridden method from `B`.

This is one of the foundations of **runtime polymorphism**.

---

## 🔑 Important Keywords

```text
extends
super
this
@Override
```

These keywords play an important role while working with inheritance and polymorphism.

---

## 🌳 Inheritance Structure

```text
                ┌──────────────┐
                │   Parent A   │
                └──────┬───────┘
                       │
                    extends
                       │
                ┌──────▼───────┐
                │   Child B    │
                └──────────────┘
```

The child class can reuse accessible members of the parent class and can also add its own functionality.

---

## 🛠️ Concepts Practiced

* [x] Basic Inheritance
* [x] `extends` Keyword
* [x] Method Overriding
* [x] Constructors in Inheritance
* [x] `this` Keyword
* [x] `super` Keyword
* [x] Dynamic Method Dispatch
* [x] Runtime Polymorphism

---

## 🎯 Next Step

After completing inheritance, the next major OOP concepts to explore are:

```text
Inheritance
    ↓
Polymorphism
    ↓
Abstraction
    ↓
Encapsulation
    ↓
Advanced OOP
```

---

<div align="center">

### 💻 Learning Java • One Concept at a Time

**Part of my Java learning journey 🚀**

⭐ Keep learning. Keep coding. Keep improving.

</div>
