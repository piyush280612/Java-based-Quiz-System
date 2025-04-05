package quiz;

public class Student extends User {

    public Student(String name, int userID){
        super(name, userID);
    }

    @Override
    public void displayInfo() {
        System.out.println("👨‍🎓 Student Name: " + name + ", User - ID: " + userID);
    }
}
