package collectionFrameWork;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 {
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("rohit");
		l.add("xxx");
		l.add("zzz");
		l.add("yyy");
		l.add("ttt");
		l.add("rrrr");
		l.add("ooo");
		l.add("aaa");
		System.out.print(l);
		ListIterator itr=l.listIterator();
		while(itr.hasNext()) {
			 String s= (String) itr.next();
			
			 if(s.equals("rohit")){
			itr.remove();
				 
			 }
			 
			 if(s.equals("aaa")) {
				 itr.add(700);
			 }
			 if(s.equals("ttt")) {
				 itr.set("BBB");
			 }
		}
		System.out.println();
		System.out.print(l);
		
	}

}
