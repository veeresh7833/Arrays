import java.util.Arrays;
import java.util.Scanner;
public class Printlar2smallest2num {
	 public static void main(String [] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int[] arr=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 int len=arr.length;
		 Arrays.sort(arr);
		 System.out.println("smallest 2 numbers in an  array :"+arr[0]+" "+arr[1]);
		 System.out.println("largest 2 numbers in an  array :"+arr[len-1]+" "+arr[len-2]);

	 }
	}