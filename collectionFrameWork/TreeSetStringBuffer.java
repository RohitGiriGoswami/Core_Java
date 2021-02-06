package collectionFrameWork;

import java.util.TreeSet;

public class TreeSetStringBuffer {
	public static void  main(String[] args) {
		TreeSet t=new TreeSet(new TreeSetStringBufferComparator());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("U"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("M"));
		t.add(new StringBuffer("T"));
		t.add(new StringBuffer("Q"));
		t.add(new StringBuffer("V"));
		t.add(new StringBuffer("L"));
		System.out.print(t);
	}

}
