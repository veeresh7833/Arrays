import java.util.*;
public class Arraysumavg {
 public static void main(String [] args)
 {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[] arr=new int[n];
	 int sum=0;
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=sc.nextInt();
		 sum+=arr[i];
	 }
	 System.out.println("sum of the array elements:"+sum);
	 System.out.println("average of the array elements:"+sum/n);

 }
}
