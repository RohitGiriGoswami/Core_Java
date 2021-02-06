package collectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursor {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		for(int i=1; i<=10; i++) {
		 a.add(i);
		}
		System.out.println(a);
	//	System.out.println(a.get(4));
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer) itr.next();
			if(i%2==0) {
				System.out.print(i);
			}else {
				itr.remove();
			}
		}
		System.out.print(a);
				
	}

}
