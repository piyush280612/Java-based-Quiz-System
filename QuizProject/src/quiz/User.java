package quiz;

public abstract class User {

    protected String name;
    protected int userID;

    //CONSTRUCTOR
    public User(String name, int userID) {
        this.name = name;
        this.userID = userID;
    }

    public abstract void displayInfo();







}
