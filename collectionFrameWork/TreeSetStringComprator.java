package collectionFrameWork;

import java.util.TreeSet;

public class TreeSetStringComprator {
	public static void main(String[] args) {
		
		TreeSet t= new TreeSet(new MyComparatorString());
		t.add("suyash");
		t.add("rohit");
	t.add("rohit");
	t.add("om");
	t.add("pradeep");
	t.add("akash");
	t.add("rakesh");
	t.add("jaydeep");
	
	t.add("pioyush");
	t.add("akku");
	t.add("xxx");
	System.out.print(t);
	
}
}