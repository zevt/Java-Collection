package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConstructorDemo {

	public static void main(String[] args) {
		String[] strs = { "Hello", "World", "How are you", "Not sure" };
		// Create an empty ArrayList
		ArrayList<String> arrList1 = new ArrayList<String>();
		// List<String> arrList22 = new ArrayList<String>(strs);

		// Create immutable list
		List<String> arrList2 = Arrays.asList(strs);

		// public ArrayList(int initialCapacity)
		arrList2 = new ArrayList<String>(100);

		arrList2 = new ArrayList<String>() {

		};

		// publicArrayList (Collection<?extendsE> c)
		arrList1 = new ArrayList<String>(arrList2);
		//
		{
			ArrayList<Integer> intList = new ArrayList<Integer>();
			// ArrayList<Object> objList = intList; // illegal!
			// objList.add ("oops");
		}

		System.out.println(" Size of arrList2 is " + arrList2.size());
		// Create a shallow copy of arrList1
		ArrayList<String> clArrayList = (ArrayList<String>) arrList1.clone();

		// List doesn't contrain clone method
		// clArrayList = (ArrayList<String>) arrList2.clone();

		// Using shallow copy method System.arraycopy
		try {
			System.arraycopy(arrList2, 0, clArrayList, 0, arrList2.size());
		} catch (ArrayStoreException e) {
			System.out.println(e.toString());
		}

		String[] strs2 = new String[10];
		try {
			System.arraycopy(strs, 0, strs2, 0, strs.length);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		System.out.println(Arrays.asList(strs2));
		
//		E	remove(int index)
//		Removes the element at the specified position in this list.
//		boolean	remove(Object o)
//		Removes the first occurrence of the specified element from this list, if it is present.
//		
//		while (arrList1.remove("asdfdf")) {
//			
//		}
	}

}
