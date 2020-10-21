import java.util.*;
public class LcmofArrayele {
	
	// GCD of 'a' and 'b' 
	public static int gcd(int a, int b) 
	{ 
		if (b == 0) 
			return a; 
		return gcd(b, a % b);
		
	} 

	// Returns LCM of array elements 
	public static  int  findlcm(int arr[], int n) 
	{ 
		
		int ans = arr[0]; 

		// ans contains LCM of arr[0], ..arr[i] 
		// after i'th iteration, 
		for (int i = 1; i < n; i++) 
			ans = (((arr[i] * ans)) /(gcd(arr[i], ans))); 
		return ans; 
	} 

	public static void main(String [] args)
	{
		int arr[] = { 2, 7, 3, 9, 4 }; 
		int n = arr.length;
		int ans=findlcm(arr, n);
		System.out.println(ans); 
		 
	} 

}
