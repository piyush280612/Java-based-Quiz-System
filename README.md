🧠 Java OOP-Based Quiz System
A console-based Quiz Application built using Java that demonstrates core Object-Oriented Programming (OOP) principles. This project simulates a real-world quiz management system with distinct user roles (Admin/Student), a question bank, score tracking, and modular design using abstraction, inheritance, and polymorphism.

🚀 Project Overview
-The Quiz System is a lightweight terminal application where:
-Admins can view admin info (extendable to add/edit questions in future).
-Students can take a multiple-choice quiz.
-Each quiz contains several questions, and the system tracks the user's score.
-Emphasis is placed on demonstrating Java’s OOP fundamentals with clean code structure.

🧩 Features
-Question bank with MCQs
-Abstract User base class with two concrete roles: Student and Admin
-Real-time quiz interaction
-Score tracking and result display
-Modular Java classes demonstrating clean architecture

🧱 Class Structure & Responsibilities

🔸 User (Abstract Class)
Fields: name, userID
Abstract method: displayInfo()
Acts as the base class for both Student and Admin

🔸 Student (Inherits from User)
Overrides displayInfo() to show student-specific details
Participates in quizzes

🔸 Admin (Inherits from User)
Overrides displayInfo() for admin
Can later be expanded to manage questions

🔸 Question
Fields: questionText, options[], correctAnswer
Methods:
displayQuestion()
isCorrect(char answer)

🔸 Quiz
Conducts quiz for a student
Tracks total score and prints result at the end

🔸 QuizManager
Entry point for managing user interactions
Initializes the question bank and routes the quiz flow


📌 Future Improvements
🧑‍🏫 Admin panel to add/edit/delete questions
💾 Store scores in files or a lightweight database
🖼️ Add GUI using JavaFX or Swing
📱 Port to Android for mobile quiz app


👨‍💻 Author
Designed & Developed by Piyush Pal
📧 ppal7191@gmail.com



