
public class Recursion {

	public static void main(String[] args) {
		System.out.println(tableOfSquares(10));
	}
	
	static int tableOfSquares(int n) {
		for(int num = 1; num<=n; num++) {
			System.out.println(num + " " + num*num);
			
		}
		return n;
	}
}
