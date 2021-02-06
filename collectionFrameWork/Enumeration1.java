package collectionFrameWork;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Enumeration1 {
	public static void main(String[] args) {
	
	    Vector v=new Vector();
		//Stack s=new Stack();
		for(int i=1; i<=10; i++) {
			v.add(i);
		}
		System.out.print(v+" ");
		System.out.println();
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			int i=(int) e.nextElement();
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.print(v);
	}

}
