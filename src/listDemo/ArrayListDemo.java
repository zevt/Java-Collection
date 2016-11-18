package listDemo;

import structure.Student;

import java.util.ArrayList;

/**
 * Created by  Viet Quoc Tran.
 */
public class ArrayListDemo {
    public static void main(String ...args) {
        ArrayList<Student> studentsList = new ArrayList<>();
//        System.out.println(studentsList.c);
        studentsList.ensureCapacity(10);
    }
}
