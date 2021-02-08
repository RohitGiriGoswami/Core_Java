package com.rays.Bean;

public class TestMarksheetModel {
	public static void main(String[] args) throws Exception {
		//testAdd();
		//testUpdate();
		//testDelete();
		//testGet();
		//testMerit();
		testSearch();
	}


	private static void testAdd() throws Exception {
		MarksheetBean b=  new MarksheetBean();
		b.setId(10);
		b.setRollNo("110");
		b.setName("rohit");
		b.setChem(98);
		b.setPhy(88);
		b.setMath(91);
		MarksheetModel mm= new MarksheetModel();
		mm.add(b);
	}
       private static void testUpdate() throws Exception {
   		MarksheetBean b2= new MarksheetBean();
   		b2.setName("hero");
   		b2.setId(10);
   		
   		MarksheetModel mm= new MarksheetModel();
		mm.Update(b2);
	
   		
   	}
       private static void testDelete() throws Exception {
    		MarksheetBean b3=new MarksheetBean();
    		b3.setId(1);
    		MarksheetModel mm = new MarksheetModel();
    		mm.Delete(b3);
    			
    		}
       
       private static void testGet() throws Exception {
   		MarksheetBean b4 = new MarksheetBean();
   		b4.setRollNo("104");
   		MarksheetModel mm= new MarksheetModel();
   		mm.get(b4);
   		
   	}
       private static void testMerit() throws Exception {
   		MarksheetBean b5 =new MarksheetBean();
   		MarksheetModel mm= new MarksheetModel();
   		mm.getMeritList(b5);
   		
   	}
       private static void testSearch() throws Exception {
   		MarksheetBean b6 = new MarksheetBean();
   		MarksheetModel mm = new MarksheetModel();
   		mm.Search(b6);
   		
   	}
 
}
