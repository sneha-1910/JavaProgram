package Programs;

import org.testng.annotations.Test;

public class NUmbers {

	@Test
	public void factorial() 
	{
		int no=5;
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	@Test
	public void fibonacci() 
	{
		int fib1=0; int fib2=1;
		System.out.println(fib1+ " " +fib2);
		for(int i=1;i<=10;i++)
		{
			int fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
		System.out.println(fib3);
	}
}
	
	@Test
	public void primeNoBetween() 
	{ // 1 to 30 prime no
		for(int i=1;i<=30;i++)
		{
	    int no=i;
	    int count=0;
		for(int j=1;j<=no;j++)
		{
			if(no%j==0)
			{ 
			count++;
			}
		}
		if(count==2)
		{
		System.out.println(no+ " ");	
		}	
	}
	}
	
	
@Test
public void Prime() 
{ 
	int no=29;
	int count=0;
  for(int i=1;i<=no;i++)
  {
	  if(no%i==0)
	  {
		  count++;
	  }			  
  }
  if(count==2)	
  {
	  System.out.println("it is prime no");
  }
  else
  {
	  System.out.println("it is not a prime no");
  }
}
	
@Test
public void findPrimeInAnarray() 
{
	int[] a= {1,9,3,5,2,6,7,4,11,13,17,19};
	 for( int i=0;i<a.length;i++)
	 {
		 int count=0;
		 int no=a[i];
		 for(int j=1;j<=no;j++)
		 {
			 if(no%j==0)
			 {
				 count++;
			 }
		 }
		 if(count==2)
		 {
			 System.out.println(no+ " ");
		 } 
	 }		
}
	
@Test
public void printNosIntheGivenFormat() 
{
	// 1 3 7 15 31 63 127
	int n=1;
	for(int i=0;i<=6;i++)
	{
		System.out.println(n+ " ");
		n=(n*2)+1;
	}
}
	
	
	
	
	
	
	
	
	
	
	
}
