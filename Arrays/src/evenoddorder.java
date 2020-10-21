	import java.util.Scanner;
	public class evenoddorder {
	 public static void main(String [] args)
		 {
			 Scanner sc=new Scanner(System.in);
			 int n=sc.nextInt();
			 int[] arr=new int[n];
			 int[] asd=new int[n];
			 int c=0,k=n-1;
			 for(int i=0;i<n;i++)
			 {
				 arr[i]=sc.nextInt();
				 if(arr[i]%2==0)
				 {
					 asd[c++]=arr[i];	 
				 }
				 else
				 {
					 asd[k--]=arr[i];
				 }
			 }
			 for(int z:asd)
			 {
				 System.out.print(z   +" ");	 
			 }	 
		 }
		}
