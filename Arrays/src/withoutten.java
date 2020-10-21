import java.util.Scanner;
public class withoutten
{
 public static void main(String [] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int[] arr=new int[n];
		 int[] asd=new int[n];
		 int c=0,i,k=0;
		 for( i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
			 if(arr[i]==10)
			 {
				 c++;	 
			 }
			 else
			 {
				 asd[k++]=arr[i];
			 }
		 }
		 for(int j=0;j<c;j++)
		 {
			 asd[k++]=0;
			 
		 } 
		 for(int z:asd)
		 {
			 System.out.print(z   +" ");	 
		 }	 
	 }
	}
