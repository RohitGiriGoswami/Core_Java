package collectionFrameWork;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("rohit");
		v.add("xxx");
		v.add(11);
		for(int i=1; i<=25; i++) {
			v.add(i);
		}
		System.out.println(v.capacity());
		System.out.println(v);
		
	}

}
