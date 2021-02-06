package collectionFrameWork;

import java.util.TreeSet;

public class TreeSetComparator {
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparator(
				));
		t.add(10);
		t.add(12);
		t.add(99);
		t.add(53);
		t.add(52);
		t.add(55);
		t.add(87);
		t.add(78);
		t.add(91);
		System.out.print(t);
		
	}

}
