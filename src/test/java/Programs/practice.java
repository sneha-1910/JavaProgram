package Programs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class practice {

	

		@Test
		public void pattern()
		{
			int n=5;
			for(int i=0;i<=n;i++) 
			{
				
				for(int j=1;j<=i;j++)
				{
					if(i%2==0)
					{
						System.out.print("4" );
					}
					else
					{
						System.out.print("3");
					}
				}
				System.out.println();
			}
		}
		
   @Test
   public void stringPattern() 
   {
	   String[] a= {"a","b","c","d","a","b","c","a","d"};
	   //a=3;b=2;c=2;d=2 
	   
	  LinkedHashSet<String> lh=new LinkedHashSet<String>();
	  
	   for(int i=0;i<a.length;i++)
	   {
		 lh.add(a[i]);
		  
	   }
	   for (String str : lh) 
	   {
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(str.equals(a[i]))
			{
				count++;
			}
		}
		System.out.println(str+ " " +count);
	}
	   
   }
	
  @Test
  public void stringpattern() 
  {
	String s="snehaaa";
	LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
	    lh.add(s.charAt(i));
	}
	    System.out.println(lh);
	    for (Character chara : lh) 
	    {
	    	System.out.println(chara);
	    	if(chara=='a' || chara=='e'|| chara=='e' || chara=='o' || chara=='u')
	    	{							
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(chara.equals(lh))
				{
					count++;
					
					}
				}
			
			System.out.println(chara+ " " +count);
	    	}
		}
  }
   
	}


