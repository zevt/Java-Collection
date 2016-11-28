package comparing;

import java.util.ArrayList;
import java.util.List;

public class TestCompare {

	public static void main(String[] args) {
		Squirrel sq1 = new Squirrel(2, "ABC");
		Squirrel sq2 = new Squirrel(3, "XBC");
		Squirrel sq3 = new Squirrel(1, "CCC");
		List<Squirrel> list = new ArrayList<>();
		list.add(sq1);
		list.add(sq2);
		list.add(sq3);
		System.out.println(list);
		list.sort((s1, s2) -> new ChainingComparator().compare(s1,s2));
		System.out.println(list);
	}

}
