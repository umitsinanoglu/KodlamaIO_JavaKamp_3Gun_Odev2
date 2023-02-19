package Business;

import Entities.Instructor;
import Entities.User;
import Utils.Logger;

public class InstructorManager extends UserManager {

    public InstructorManager(Logger logger) {
        super(logger);
    }

    @Override
    public void add(User user) {
        System.out.println("Instructor : " + user.getFirstName() + " " + user.getLastName());
        password(user);
        System.out.println("Password : " + user.getPassword());
    }

}
