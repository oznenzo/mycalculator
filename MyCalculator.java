<<<<<<< HEAD
package mycalculator;

public class MyCalculator {

	/**
	 * Author: Kristine Elaine P. Bautista
	 * Program Description: Calculator of Simple Mathematical Functions
	**/

		// add two numbers
		public float add(float a,float b){
			return a+b;
		}
		
		// subtract two numbers
		public float subtract(float a,float b){
			return a-b;
		}
		
		// multiply two numbers
		public float multiply(float a,float b){
			return a*b;
		}
		
		// divide two numbers
		public float divide(float a,float b){
			return a/b;
		}
		
		// x^2 of two numbers
		public float square(int x){
			return x*x;
		}
		
		// x^3 of three numbers
		public float cube(int x){
			return x*x*x;
		}
		
		// n! of an integer
		public static int nfactorial(int n){
			int factorial = 1;
			
			for(int i=1;i<=n;i++) //edited i<n to i<=n to multiply up to the nth integer
				factorial *= i;
			
			return factorial;
		}
		
		// binary search in an array
		public  static int binarySearch(int[] a,int x){
			int n = a.length; // get number of elements in the array
			int lower, upper, middle; // variables for positions in the array
			lower = 0; upper = n-1; // initialize values of lower and upper points
			
			while(lower<=upper){
				middle = (lower+upper)/2;
				if(x>a[middle]) lower = middle + 1;
				else if(x<a[middle]) upper = middle - 1;
				else return a[middle]; //edited -- returns the sub array if number is found
			}
			
			return 1;
		}
		
	
	
}
=======
/**
 * Author: Kristine Elaine P. Bautista
 * Program Description: Calculator of Simple Mathematical Functions
**/

public class MyCalculator {
	// add two numbers
	public float add(float a,float b){
		return a+b;
	}
	
	// subtract two numbers
	public float subtract(float a,float b){
		return a-b;
	}
	
	// multiply two numbers
	public float multiply(float a,float b){
		return a*b;
	}
	
	// divide two numbers
	public float divide(float a,float b){
		return a/b;
	}
	
	// x^2 of two numbers
	public float square(int x){
		return x*x;
	}
	
	// x^3 of three numbers
	public float cube(int x){
		return x*x*x;
	}
	
	// n! of an integer
	public int nfactorial(int n){
		int factorial = 1;
		
		for(int i=1;i<n;i++)
			factorial *= i;
		
		return factorial;
	}
	
	// binary search in an array
	int binarySearch(int[] a,int x){
		int n = a.length; // get number of elements in the array
		int lower, upper, middle; // variables for positions in the array
		lower = 0; upper = n-1; // initialize values of lower and upper points
		
		while(lower<=upper){
			middle = (lower+upper)/2;
			if(x>a[middle]) lower = middle + 1;
			else if(x<a[middle]) upper = middle - 1;
			else return middle;
		}
		
		return 1;
	}
	
}
>>>>>>> a55afef393b4a7d17f20835b7e26efaa1f086a86
