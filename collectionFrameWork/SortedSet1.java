package collectionFrameWork;

import java.util.TreeSet;

public class SortedSet1 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(100);
		
		t.add(90);
		t.add(80);
		t.add(110);
		t.add(70);
		t.add(50);
		t.add(60);
		//t.add("rrr");
		
		t.add(120);
		t.add(150);
		t.add(160);
		System.out.println(t);
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.print(t.headSet(80));
		System.out.println();
		System.out.print(t.tailSet(80));
		System.out.println();
		System.out.print(t.subSet(50, 120));
	}

}
