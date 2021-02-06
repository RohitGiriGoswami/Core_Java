package collectionFrameWork;

import java.util.TreeSet;

public  class ComparatorStringStringBuffer {
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet( new ComparatorStringStringBuffer2());
		
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add("XX");
		t.add(new StringBuffer("AA"));
		t.add("ABCD");
	    t.add("A");
	    System.out.print(t);
		
	}

}
