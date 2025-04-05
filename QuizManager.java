package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizManager {
    private ArrayList<Question> questionBank;

    public QuizManager() {
        questionBank = new ArrayList<>();
        seedQuestions();
    }

    private void seedQuestions() {
        questionBank.add(new Question(
                "What does OOP stand for?",
                new String[]{"Object Oriented Programming", "Only One Program", "Open Oriented Process", "Outer Object Process"},
                'A'
        ));

        questionBank.add(new Question(
                "Which is not an OOP principle?",
                new String[]{"Abstraction", "Inheritance", "Compilation", "Polymorphism"},
                'C'
        ));

        questionBank.add(new Question(
                "Which is not a coastal city in India?",
                new String[]{"Mumbai", "Puri", "Kolkata", "Chennai"},
                'C'
        ));

        questionBank.add(new Question(
                "What is the full-form of ATM?",
                new String[]{"ANY TIME MONEY", "AUTOMATIC TELLER MACHINE", "ALL TIME MONEY", "ALL TRANSACTIONAL MACHINE"},
                'B'
        ));
    }

    public void launch() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user type (admin/student): ");
        String type = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter user ID: ");
        int id = scanner.nextInt();

        if (type.equalsIgnoreCase("admin")) {
            Admin admin = new Admin(name, id);
            admin.displayInfo();
            System.out.println("No additional features yet for Admin.");
        } else {
            Student student = new Student(name, id);
            student.displayInfo();

            Quiz quiz = new Quiz(student, questionBank.toArray(new Question[0]));
            quiz.start();
        }
    }
}

