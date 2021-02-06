package collectionFrameWork;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
	ArrayList l=new ArrayList(10);
	l.add("rohit");
	l.add(10);
	l.add('A');
	l.add(null);
	l.add("giri");
	l.add(55);
	System.out.println(l.size());
	l.remove(1);
	l.add(3, "goswami");
	l.set(1, "Don");
	System.out.println(l);
	System.out.println(l.size());
	
	System.out.println(l instanceof Serializable);
	System.out.println(l instanceof Cloneable);
	System.out.println(Collections.synchronizedList(l));
}
}