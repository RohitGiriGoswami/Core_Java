package arrays;

public class binarySearch1 {
	public static void main(String[] args) {
		
		int[] a= {10,20,30,30,40,50,60,70,};
		int search=60;
		int item=0;
		int lower=0;
		int higher=a.length-1;
		int min= (lower+higher)/2;
		while(lower<=higher) {
			
		if(a[min]==search) {
			item++;
			System.out.println("your searh result is on"+min);
			break;
		}
		else if( a[min]< search) {
			lower= min+1;
			
		}else { 
		higher=min-1;	
		}
		min=(lower+higher)/2;
	}
		if(item==0) {
			System.out.println("not matched");
		}
		

	}
}
