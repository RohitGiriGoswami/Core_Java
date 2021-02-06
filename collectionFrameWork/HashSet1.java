package collectionFrameWork;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add("rohit");
		hs.add(null);
		hs.add("bbb");
		hs.add("aaa");      //hashCode sew kam hota he...search operatin is best choice
		hs.add("zzz");
		hs.add("yyy");
		hs.add("xxx");
		hs.add("goswami");
		hs.add("giru");
	   System.out.println(hs.add(null));
		System.out.print(hs);
		System.out.println();
		HashSet hs2=new HashSet();
		hs2.add("rohit");
		hs2.add("akash");
		hs2.add("pradeep");
		hs2.add("rakesh");
		hs2.add("jaydeep");hs2.add("akku");
		hs2.add("om");hs2.add("piyush");
		System.out.println(hs2);
		System.out.println(hs2.size());
		
	}

}
