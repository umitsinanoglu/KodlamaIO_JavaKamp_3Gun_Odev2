import Business.InstructorManager;
import Business.StudentManager;
import Business.UserManager;
import Entities.Instructor;
import Entities.Student;
import Utils.EmailLogger;
import Utils.FileLogger;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstName("Ümit");
        student1.setLastName("Sinanoğlu");

        Instructor instructor1 = new Instructor();
        instructor1.setId(2);
        instructor1.setFirstName("Eren");
        instructor1.setLastName("Tunçyürek");
        instructor1.setBranch("Java");

        UserManager studentManager1 = new StudentManager(new FileLogger());
        studentManager1.add(student1);

        System.out.println("----------------------------------------------");

        InstructorManager instructorManager1 = new InstructorManager(new EmailLogger());
        instructorManager1.add(instructor1);

        System.out.println("----------------------------------------------");

    }

}
