# 🔐 Access Modifiers & Constructors in Java

This folder contains Java programs focused on **Access Modifiers**, **Getters & Setters**, and **Constructors**.

These are important concepts in **Object-Oriented Programming (OOP)** and help in understanding how Java controls access to data and initializes objects.

---

## 📂 Files in This Folder

### 1. `access_modifiers_getters_and_setters_in_Java.java`

Covers:

* 🔒 Access Modifiers
* `public`
* `private`
* `protected`
* Default access modifier
* Getters
* Setters
* Data encapsulation

### 2. `constructors_in_Java.java`

Covers:

* 🏗️ What is a Constructor?
* Constructor syntax
* Default Constructor
* Parameterized Constructor
* Initializing objects using constructors
* Constructor naming rules

---

## 🔐 Access Modifiers

Access modifiers determine **where a class, variable, method, or constructor can be accessed**.

| Modifier    | Same Class | Same Package | Subclass | Other Package |
| ----------- | :--------: | :----------: | :------: | :-----------: |
| `private`   |      ✅     |       ❌      |     ❌    |       ❌       |
| Default     |      ✅     |       ✅      |     ❌    |       ❌       |
| `protected` |      ✅     |       ✅      |     ✅    |       ❌*      |
| `public`    |      ✅     |       ✅      |     ✅    |       ✅       |

> `protected` members can also be accessed from another package through inheritance.

---

## 🔑 Getters & Setters

Getters and setters are commonly used to access and modify **private variables** safely.

Example:

```java
class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

This concept is an important part of **Encapsulation** in Java.

---

## 🏗️ Constructors

A constructor is a special method that is automatically called when an object is created.

Example:

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Aryan");

        System.out.println(student.name);
    }
}
```

### Important Rules

* Constructor name must be the same as the class name.
* A constructor does not have a return type.
* Constructors are called automatically when objects are created.
* A class can have multiple constructors using **constructor overloading**.

---

## 🎯 Learning Goals

After completing these programs, you should understand:

* How Java controls access to class members
* How `private` variables provide data protection
* How getters and setters work
* What constructors are
* How constructors initialize objects
* How constructors can be overloaded
* The role of access control in OOP

---

## 🧠 Key Concepts

```text
Access Modifiers
      │
      ├── public
      ├── private
      ├── protected
      └── default

Encapsulation
      │
      ├── Private Variables
      ├── Getters
      └── Setters

Constructors
      │
      ├── Default Constructor
      ├── Parameterized Constructor
      └── Constructor Overloading
```

---

## 🚀 Part of My Java Learning Journey

This folder is part of my **Java Learning Repository**, where I am building my Java fundamentals step by step before moving deeper into **Object-Oriented Programming, DSA, and Software Development**.

**Keep learning. Keep coding. Keep improving. 💻🔥**
