package collectionFrameWork;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.add("rohit");
		s.push("giri");
		s.push(111);
		s.push(999);
		s.push("xxxx");
		//System.out.println(s.empty());
		System.out.println(s.search(111));
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s);
	}

}

