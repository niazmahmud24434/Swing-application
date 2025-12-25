# Circle Drawer GUI – Java Swing Project

## Overview

A simple **Java Swing application** that allows users to draw circles at random positions on a panel. The GUI includes two buttons:

* **Draw Circle** – Draws a filled circle at a random location
* **Clear** – Clears all circles and restores a blank panel

This project demonstrates **GUI development, event handling, and custom drawing** in Java.

---

## Features

* Interactive GUI with **JFrame** and **JPanel**
* **Custom drawing** of circles using `Graphics`
* Event handling via **ActionListener**
* Maintains a list of drawn circles for proper rendering
* Clear button to reset the panel

---

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/your-username/GUI-Circle-Project.git
```

2. Navigate to the project directory
3. Compile and run:

```bash
javac CircleGUI.java
java CircleGUI
```

4. Use the **Draw Circle** and **Clear** buttons to interact with the application

---

## Project Structure

```
CircleGUI.java    -> Main GUI application with buttons and panel
Circle.java       -> Circle class storing x, y, radius
```

---

## UML Class Diagram

* **CircleGUI** – Main JFrame containing buttons and drawing panel
* **Circle** – Stores circle properties (x, y, radius)
* **Relationship:** CircleGUI contains a list of Circle objects (composition) and handles user actions via ActionListener

*(Add your UML diagram image here in the repository)*

---

## Technologies Used

* Java SE
* Swing (JFrame, JPanel, JButton)
* Graphics for custom drawing
* Event handling with ActionListener

---

## Conclusion

This project demonstrates:

* Building interactive GUI applications in Java
* Handling button click events with ActionListener
* Drawing shapes dynamically and updating the panel
* Managing user interactions effectively

