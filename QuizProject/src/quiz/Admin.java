package quiz;

public class Admin extends User {

    public Admin(String name, int userID) {
        super(name, userID);
    }

    @Override
    public void displayInfo() {
        System.out.println("🛠️ Admin Name: " + name + ", User - ID: " + userID);
    }
}

