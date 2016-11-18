package generalCollection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Viet Quoc Tran
 */
public class IterationDemo {
    static public void main(String... args) {
        Collection<Integer> intCollect = new ArrayList();
        int index = 0, count = 5;
        while (index++ < count) {
            intCollect.add((int) (Math.random() * 50));
        }

        // Display element inside intCollect

        System.out.println("   We have Collection of:   " + intCollect.toString());
        // Iterate through Collection

        // Conventional way
        System.out.println("Conventional way");
        for (Integer i : intCollect) {
            System.out.print(" | " + i);
        }
        System.out.println();
        // Using Lambda with Comsumer Interface of Java 8
        System.out.println(" Using Lambda with Comsumer Interface ");
        intCollect.forEach(e-> System.out.print(" | " + e));

        System.out.println();
        // Using Lambda with Comsumer Interface and Reference to function (Java 8)
        // We cannot manupulate element before applying the function to it when iterating Collection this way
        System.out.println(" Using Lambda with Comsumer Interface and Reference to function ");
        intCollect.forEach(System.out::println);
        System.out.println();

        // In additional to operation supported by Collection, List interface ( ArrayList and LinkedList  classes )
        // support operation with index; so

        ArrayList<Integer> intList  = (ArrayList<Integer> )intCollect;
        //  This is legal conversion becuase intCollect is pointing to an ArrayList Object
        System.out.println(" Iterate List by using index, similar to Array");
        for (int i = 0; i < intList.size(); ++i ) {
            System.out.print(" | " + intList.get(i));
        }
    }
}
