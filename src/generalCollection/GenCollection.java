package generalCollection;

import java.util.Collection;

/**
 * Created by Viet Quoc Tran
 */
public class GenCollection<E> {
    public static <E> void displayCollection(Collection<E> elements) {

        elements.forEach(System.out::println);

        // If you're not familiar with compact way of writing lambda then you can use

//        elements.forEach(x -> {
//            System.out.println(x.toString());
//        });

        // or to conventional way of iterating collection

//        for (E e: elements) {
//            System.out.println(e.toString());
//        }

    }
}
