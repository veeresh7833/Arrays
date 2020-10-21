import java.util.*;
import java.io.IOException; 
class Subset
{ 
	
	static void printSubsets(char set[]) 
	{ 
		int n = set.length; 

		// Run a loop for printing all 2^n 
		// subsets one by one 
		for (int i = 0; i < (1<<n); i++) 
		{ 
			System.out.print("{ "); 

			// Print current subset 
			for (int j = 0; j < n; j++) 

				if ((i & (1 << j)) > 0) 
					System.out.print(set[j] + " "); 

			System.out.println("}"); 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		char set[] = {'a', 'b', 'c'}; 
		printSubsets(set); 
	} 
} 
