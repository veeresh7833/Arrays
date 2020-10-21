import java.util.Scanner;
public class Coin {
	 public static void main(String [] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int start=1;
			int count=0;
			while(n>0)
			{
				n-=start;
				start++;
				count++;
			}
			System.out.println(count);
		}	 

	 }
	}
