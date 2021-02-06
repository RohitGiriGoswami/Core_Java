package collectionFrameWork;

import java.util.TreeSet;

public class EmployeeComparable {
	public static void main(String[] args) {
		
		Employee e1=new Employee("rohit", 110);
		Employee e2=new Employee("Don", 11);
		Employee e3=new Employee("giri", 163);
		Employee e4=new Employee("goswami", 15);
		Employee e5=new Employee("Ji", 105);
		Employee e6=new Employee("Vice President", 17);
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4); 
		t.add(e5);
		t.add(e6);
		
		System.out.println(t);
	}

}
