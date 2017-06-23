package Student;

/**
 * @author avijitkumar
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;
import java.util.*;

/**
 * Class Description of Collection It verifies that entered data is valid or not
 */
public class Collection {

    static ArrayList arr;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of students");

        int n = in.nextInt();
        int flag = 0, p = 0, q = 0, r = 0;
        if (n >= 2 && n <= 1000) {
            arr = new ArrayList<Student>(n);
            flag = 1;
        } else {
            System.out.println("Enter numer of students from 2 to 1000");
        }

        if (flag == 1) {
            for (int i = 0; i < n; i++) {
                System.out.println("enter the details about student number " + (i + 1));

                int id1 = in.nextInt();
                if (id1 >= 0 && id1 <= 1000) {
                    p = 1;
                }

                String name1 = in.next();
                if (name1.length() >= 5 && name1.length() <= 35) {
                    q = 1;
                }

                double cgpa1 = in.nextDouble();
                if (cgpa1 >= 0.00 && cgpa1 <= 4.00) {
                    r = 1;
                }

                if (p == 1 && q == 1 && r == 1) {
                    arr.add(new Student(id1, name1, cgpa1));
                }
            }
        }
        /**
         * Class Description of idComparator It compares the Student id
         */
        class idComparator implements Comparator {

            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;

                if (s1.id == s2.id) {
                    return 0;
                } else if (s1.id > s2.id) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        /**
         * Class description of nameComparator It compares the Student names
         */
        class nameComparator implements Comparator {

            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;
                return s1.name.compareTo(s2.name);
            }
        }
        /**
         * Class description of CGPAComparator It compares the Student's CGPA
         */
        class CGPAComparator implements Comparator {

            public int compare(Object o1, Object o2) {
                Student s1 = (Student) o1;
                Student s2 = (Student) o2;

                if (s1.cgpa == s2.cgpa) {
                    return 0;
                } else if (s1.cgpa > s2.cgpa) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }

        Collections.sort(arr, Collections.reverseOrder(new idComparator()));
        Collections.sort(arr, new nameComparator());
        Collections.sort(arr, Collections.reverseOrder(new CGPAComparator()));

        Iterator itr = arr.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.name);
        }
    }

}
