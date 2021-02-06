package collectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedlList {
	public static void main(String[] args) {
		ArrayList A=new ArrayList();
		
		A.add("100");
		A.add(10);
		A.add("AAA");
		//A.add("AAA");
		LinkedList l=new LinkedList(A);
		l.add("rohit");
		l.add(10);
		l.remove("AAA");
	    l.add(1, "giri");
	  //  System.out.println(l);
	    l.addFirst("xxx");
	    l.addLast("yyy");
	    System.out.println(l);
	}

}
