package quiz;

public class Question {

    private String question;
    private String[] options; //A,B,C,D
    private char correctOption;

    //constructor
    public Question(String question, String [] options, char correctOption){
        this.question = question;
        this.options = options;
        this.correctOption = Character.toUpperCase(correctOption);
    }

    //method to display question
    public void displayQuestion(){
        System.out.println();
        System.out.println("A. " + options[0]);
        System.out.println("B. " + options[1]);
        System.out.println("C. " + options[2]);
        System.out.println("D. " + options[3]);
    }

    //method to check if the user answer is correct by comparing with real answer
    public boolean isCorrect(char answer){
        return Character.toUpperCase(answer) == correctOption;
    }

    //getter
    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public char getCorrectOption() {
        return correctOption;
    }
}
