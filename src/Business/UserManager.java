package Business;

import Entities.User;
import Utils.Logger;

import java.util.Random;

public class UserManager {

    public UserManager(Logger logger) {
        logger.log();
    }

    public void add(User user) {

        System.out.println("USER : " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Welcome to the Kodlama io family!");
        password(user);
        System.out.println("Password : " + user.getPassword());
    }

    protected void password(User user) {
        Random random = new Random();
        user.setPassword(Math.abs(random.nextInt()));
    }
}
