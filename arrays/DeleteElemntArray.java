package arrays;

public class DeleteElemntArray {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9};
		int delete=4;
		int count=0;
		for(int i=0; i<a.length; i++) {
			
			if(delete==a[i]) {
				for(int j=i; j<a.length-1; j++) {
					a[j]=a[j+1];
				}
				count++;
				break;
				
			}
		}
		if(count==0) {
			System.out.println("elemnt not found");
		}else {
			System.out.println("succesfully delete");
		for(int q:a) {
			System.out.print(q+" ");
		}
		}
	}

}
