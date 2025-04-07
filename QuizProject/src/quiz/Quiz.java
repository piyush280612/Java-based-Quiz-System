package quiz;

import java.util.Scanner;

public class Quiz {
    private Question[] question;
    private Student student;
    private int score;

    //constructor
    public Quiz(Student student, Question[] questions) {
        this.student = student;
        this.question = questions;
        this.score = 0;
    }


    public void start() {
        Scanner obj = new Scanner(System.in);
        System.out.println("\n📖 STARTING QUIZ FOR: " + student.name);

        for (int i = 0; i < question.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            question[i].displayQuestion();

            System.out.println("Choose your Answer ( A / B / C / D )");
            char ans = obj.next().charAt(0);

            if (question[i].isCorrect(ans)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong Answer! Correct answer is: " + question[i].getCorrectOption());
            }


        }
        System.out.println("\n🎓 Quiz Finished. Final Score: " + score + "/" + question.length);

    }

}
