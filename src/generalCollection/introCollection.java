package generalCollection;

import structure.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by  Viet Quoc Tran
 */
public class introCollection<E> {
    private static int id_index = 0;

    public static void main(String... args) {
        // Initialize collection of Students
        Collection<Student> studentCollect = new ArrayList();
        // Add some students in to the collection

        studentCollect.add(new Student("David Sanders", generateID()));
        studentCollect.add(new Student("John Lee", generateID()));
        studentCollect.add(new Student("Neymar da Santos", generateID()));

        GenCollection.displayCollection(studentCollect);

        // Because Collection is generic type so it doesn't accept element of primitive type
        // Following code will generate error

        /*
        *  Collection<int> wrongNumberCollect;
        *
        */

        // if we want to create a collection of number then use Boxed Type
        // int -> Integer; float -> Float
        Collection<Integer> numberCollect = new LinkedList<>();

    }

    // generateID function automatically increases studentID to make it unique.
    // in database design, id is usually automatically assigned and auto-increase
    private static int generateID() {
        return ++id_index;
    }

}
