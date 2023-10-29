package Programs;

import org.testng.annotations.Test;

public class Patterns {

	@Test
	public void Pattern1() 
	{   // * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern2()
	{
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern3() 
	{
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//sir pgrm
	@Test
	public void pattern31() 
	{
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
      @Test
      public void pattern4() 
     {
	    //         *
    	//       * *
    	//     * * *
        //   * * * *
    	// * * * * * 
    	  int n=5;
    	  for(int i=1;i<=n;i++)
    	  {
    		  for(int j=i;j<n;j++)
    		  {
    			  System.out.print("  ");//double space
    		  }
    		  for(int j=1;j<=i;j++)
    		  {
    			  System.out.print("* ");
    		  }
    		  System.out.println();
    	  }
     }
	
	@Test
	public void pattern5()
	{ // * * * * * 
	  //   * * * * 
	  //     * * * 
	  //       * * 
	  //         * 
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
    @Test
      public void pattern6()
       {   //     *
    	   //    * *
           //   * * * 
    	   //  * * * * 
	       // * * * * * 
    	int n=5;
    	for(int i=n;i>0;i--)
    	{
    		for(int j=1;j<=n;j++) 
    	     {
    			if(i<=j)
    			{
    				System.out.print("* ");
    			}
    			else
    			{
        			System.out.print(" ");
    			}
    	     }
    			System.out.println();	
    	     }
    	    }
    
    @Test
    public void pattern61() 
    { 
    	int n=5;
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=i;j<=n;j++) 
    		{
    		System.out.print(" ");
    	   }
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print("* ");
    	}
       System.out.println();	
    }
    }
    	
   @Test
   public void pattern7()
   { // * * * * * 
	 //  * * * * 
	 //   * * * 
	 //    * * 
	 //     * 
	 int n=5;
	 for(int i=1;i<=n;i++)
	 {
		 for(int j=1;j<i;j++)
		 {
			 System.out.print(" ");
		 }
		 for(int j=i;j<=n;j++)
		 {
			 System.out.print("* ");
		 }
		 System.out.println();
	 }
   }
   
  @Test
  public void Pattern71() 
  {
	  int n=5;
	  for(int i=n;i>0;i--)
	  {
		  for(int j=n;j>=1;j--)
		  {
			  if(i>=j)
			  {
				  System.out.print("* ");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
  }
  
 @Test
 public void pattern8() 
 {   // 1 1 1 1 1
	 // 1 1 1 1 1
	 // 1 1 1 1 1
	 // 1 1 1 1 1
	 // 1 1 1 1 1
	 int n=5;
	 for(int i=1;i<=n;i++)
	 {
		 for(int j=1;j<=n;j++)
		 {
			 System.out.print("1 ");
		 }
		 System.out.println();
	 }
 }

 @Test
 public void pattern9() 
 { 
	// 1 1 1 1 1
	// 2 2 2 2 2
	// 3 3 3 3 3 
	// 4 4 4 4 4 
	// 5 5 5 5 5
	 int n=5;
	 for(int i=1;i<=n;i++)
	 {
		 for(int j=1;j<=n;j++)
		 {
			 System.out.print(i+" ");
		 }
		 System.out.println();
	 }
	 
 }
       
@Test
public void pattern10() 
{   // 1 2 3 4 5
	// 1 2 3 4 5
	// 1 2 3 4 5
	// 1 2 3 4 5
	// 1 2 3 4 5
	int n=5;
	for(int i=1;i<=n;i++) 
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print(j+ " ");
		}
		System.out.println();
	}
		
	
}
	
    @Test
    public void Pattern11() 
    { // 1
      // 1 2 
      // 1 2 3
      // 1 2 3 4 
      // 1 2 3 4 5
    	int n=5;
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
    	
    }
	
@Test
public void pattern12() 
{
	// 1 1 1 1 1
	// 2 2 2 2
	// 3 3 3 
	// 4 4 
	// 5
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for( int j=i;j<=n;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
	
    @Test
    public void pattern13()
    { //         1
      //       2 2
      //     3 3 3
      //   4 4 4 4
	  // 5 5 5 5 5
    	int n=5;
  
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=i;j<n;j++)
    		{
    		System.out.print("  ");
    	}
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print(i+" ");
    	}
      System.out.println();
    }
    }
	
	
    @Test
    public void pattern14() 
    {
    	// 1 2 3 4 5
    	//   2 3 4 5
    	//     3 4 5
    	//       4 5
    	//         5
    	int n=5;
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<i;j++)
    		{
    			System.out.print("  ");
    		}
    		for(int j=i;j<=n;j++)
    		{
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
    }
	
	@Test
	public void pattern15() 
	{
		// 5 4 3 2 1
		// 5 4 3 2 
		// 5 4 3 
		// 5 4 
		// 5
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int k=5;
			for(int j=i;j<=n;j++)
			{
				System.out.print(k--+" ");
			}
			System.out.println();
		}
		
	}
	
@Test
public void pattern16() 
{
   // 1
   // 2 2 
   // 1 1 1
   // 2 2 2 2
   // 1 1 1 1 1
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i%2==0)
			{
				System.out.print("2 ");
			}
			else
			{
				System.out.print("1 ");
			}
		}
		System.out.println();
	}
}
	
@Test
public void pattern17() 
{ 
	//     1
	//    2  2
	//  3  3  3
	// 4  4  4  4 
	//5  5  5 5  5
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for (int j=i;j<n;j++) 
		{
		System.out.println(" ");
	    }
		for(int j=1;j<=i;j++)
		{
			System.out.println(i+" ");
		}
	System.out.println();
	}
}	
}
