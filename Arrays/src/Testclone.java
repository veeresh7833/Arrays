import java.util.*;
public class Testclone {
  public static void main(String [] args)
  {
	int arr[]= {10,20,50,60,43};
	for(int i:arr)
	{
		System.out.println(i);
	}
	System.out.println("clone array");
	int carr[]=arr.clone();
	for(int i:carr)
	{
		System.out.println(i);
	}
  }
}
