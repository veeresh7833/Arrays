import java.util.*;
public class Searchelement {
		 public static void main(String [] args)
		 {
			 Scanner sc=new Scanner(System.in);
			 int n=sc.nextInt();
			 int[] arr=new int[n];
			 for(int i=0;i<n;i++)
			 {
				 arr[i]=sc.nextInt();
			 }
			 int e=sc.nextInt();
			 int temp=0;
			 int in=0;
			 for(int i=0;i<n;i++)
			 {
				 if(arr[i]==e)
					 {
					 temp=1;
					 in=i;
					 break;
					 }
			 }
			 if(temp==0)
			 {
				 System.out.println("-1"); 
			 }
			 else
			 {
				 System.out.println("element index is:"+in); 
			 }
		 }
		}
