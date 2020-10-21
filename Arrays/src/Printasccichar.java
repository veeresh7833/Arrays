import java.util.Scanner;

public class Printasccichar {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[] arr=new int[n];
	 int s=65;
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=s++;
		System.out.printf("%c",arr[i]);
	 }
}
}
