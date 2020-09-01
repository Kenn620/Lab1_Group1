public class Problem4 {

	public static void main(String[] args) {
		tableOfSquares(0,5); 
		
	}
		static void tableOfSquares(int n) {
			
			for (int num=1; num<=n; num++) {  
				System.out.println("Square of "+ num +" is " + num*num );	
				
			}
		}
		static void tableOfSquares(int num, int n) {
			
				if(num< n || num==n) {  
					
					
				System.out.println("Square of "+ num +" is " + num*num );
				tableOfSquares(++num ,n);
				
			} else
				
				return;
	
					
		}
}