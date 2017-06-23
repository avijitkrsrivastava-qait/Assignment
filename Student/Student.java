package Student;

/**
 * @author avijitkumar
 */
/**
 * Class description of Student 
 * It sets and gets the information of Students
 */
public class Student {

    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getId(int id) {
        return id;
    }

    String getName(String name) {
        return name;
    }

    double getCgpa(int cgpa) {
        return cgpa;
    }

}
