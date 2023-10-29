package Programs;

import org.testng.annotations.Test;

public class Alphabet_patterns {

	@Test
	public void pattern18() 
	{
	   // A B C D E
	   // F G H I J
	   // K L M N O 
	   // P Q R S T
	   // U V W X Y 
      int n=5;
      char ch='A';
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=n;j++)
    	  {
    		  System.out.print(ch++ +" ");
    	  }
    	  System.out.println();
      }
	}
	
	@Test
	public void pattern19()
	{
		// A B C D E
		// A B C D E
		// A B C D E
		// A B C D E
		// A B C D E
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			char ch='A';
			for(int j=1;j<=n;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
	
@Test
public void pattern20() 
{
//	a 
//	a b 
//	a b c 
//	a b c d 
//	a b c d e 
	int n=5;
	
	for(int i=0;i<=n;i++)
	{
		char ch='a';
		for(int j=1;j<=i;j++)
		{
			System.out.print(ch++ +" ");
		}
		System.out.println();
	}
}
	
@Test
public void pattern21() 
{
	int n=5;
	char ch='a';
	for(int i=1;i<=n;i++)
	{     	
		for(int j=1;j<=i;j++)
		{
			System.out.print(ch+" ");
		}

		System.out.println();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
