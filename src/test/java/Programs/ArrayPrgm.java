package Programs;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class ArrayPrgm {


       @Test
		public void swap2norsUSing3RdVariable()
		{
		
		int a=10;
		int b=20;
		int temp = 0;
		temp=a;
		a=b;
		b=temp;
	
		System.out.println(a);
		System.out.println(b);
        }	
       
       @Test
      public void swap2noWithoutUsing3rdVar()
      {
    	  int a=10;
    	  int b=20;
    	  a=a+b;//10+20=30
    	  b=a-b;//30-20=10
    	  a=a-b;//30-10=20
    	  
    	  System.out.println("a="+a);
    	  System.out.println("b="+b);
      }
     
  /*    @Test
      public void sortAnArrayInAscendingOrderUsingBuubleSortTechnique()
      {
    	  int[] a= {5,3,0,1,4};int temp = 0;
    	  
    	  for(int i=0;i<a.length-1;i++)
    	  {
    		  for(int j=0;j<a.length-1;j++)
    		  {
    			 if(a[j]>a[j+1]) 
    			 {
    				
			      temp=a[j];
			      a[j]=a[j+1];
			      a[j+1]=temp;
					
    				
    			 }
    			 
    		  }
    	  }
    	  
    	  for(int k=0;k<a.length;k++)
    	  {
    	   System.out.println(a[k]);
    	  }
      }*/
    
     //sir program
      @Test
      public void BubbleSort()
      {
    	 
          int[] a= {5,3,0,1,4};
    	  for(int i=0;i<a.length;i++)
    	  {
    		  for(int j=i+1;j<a.length;j++)
    		  {
    			 if(a[i]>a[j]) 
    			 {	
			       int temp=a[i];
			      a[i]=a[j];
			      a[j]=temp;	
    			 } 
    		  }
    	  }
    	  for(int i=0;i<a.length;i++)
    	  {
    	   System.out.print(a[i]+"  ");
    	  } 
      }
    	
    	  @Test
    	    public void BubbleSortInDescendingOrder()
    	      {
    	    	 
    	  int[] a= {5,3,0,1,4};
    	    	  
    	    	  for(int i=0;i<a.length;i++)
    	    	  {
    	    		  for(int j=i+1;j<a.length;j++)
    	    		  {
    	    			 if(a[i]<a[j]) 
    	    			 {
    	    			 int temp=a[i];
    				      a[i]=a[j];
    				      a[j]=temp;
    					}
    	    			 
    	    		  }
    	    	  }
    	    	  
    	    	  for(int i=0;i<a.length;i++)
    	    	  {
    	    	   System.out.print(a[i]+"  ");
    	    	  }   
    	 	  
     }
 
 @Test
 public void additionOf2Array()
 {
	 int []a= {4,2,6,1,7};
	 int []b= {3,1,7,2,9,8};
       
	 int length=a.length;
	 if(a.length<b.length)
	 {
		 length=b.length;
	 }
	 for (int i=0;i<length;i++)
	 {
		 try {
			 System.out.println(a[i]+b[i]+"");
		 }
		 catch(Exception e)
		 {
			 if(a.length<b.length)
			 {
				 System.out.println(b[i]);
			 }
			 else
			 {
				System.out.println(a[i]); 
			 }
		 }
	 }
 }

 @Test
 public void appending0AtLast()
 {
	 int []a= {5,0,4,0,0,9,0,8,0};
	 for(int i=0;i<a.length;i++)
	 {
	
	if(a[i]!=0)
		 {
			 System.out.println(a[i]);
	     }
	 }
		for (int i=0;i<a.length;i++) 
		{
			if(a[i]==0)
			{
				System.out.println(a[i]);
			}
		}
			
       }
 
 //sir prgm
 
 @Test
 public void appendArray()
 {
	 int []a= {5,0,4,0,0,9};
	 int []b= new int[a.length];
	 int m=0;
	 int n=a.length-1;
	 
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]==0)
		 {
			 b[m]=a[i];
			 m++;
		 }
		 else 
		 {
			 b[n]=a[i];
			 n--;
		 }
	 }
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println(b[i]);
	 }
 }
 
 @Test
 public void removeDuplicatesInAnArrayUsingCollection()
 {
	 int[]a= {2,3,1,4,1,3,5,2};
	 LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
	 for(int i=0;i<a.length;i++)
	 {
		 lh.add(a[i]);
	 }
	 
	 for (Integer inte : lh) //to print without array format
	 {
		 System.out.println(inte);
	}

 }
 
 @Test
 public void removeDuplicatesUsingMap()
 {
	 int []a= {2,3,1,4,1,3,5,2};
	 LinkedHashMap<Integer, Integer> lhM=new LinkedHashMap<Integer, Integer>();
	 for (int i=0;i<a.length;i++)
	 {
		 lhM.put(a[i],i);
	 }
	for (Entry<Integer, Integer> m : lhM.entrySet()) 
	{
		System.out.println(m.getKey());
	} 
 }
    	  
  @Test
 public void removeDuplicates()
  {
	  int []a= {2,3,1,4,5,4,3,2,1};
	  int count=0;
	  for(int i=0;i<a.length-1;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
		  
			  if(a[i]==a[j])
			  {
				 count++;
			  }
		System.out.print(a[i]); 
	 }
			
	  }
	 for(int i=0;i<a.length-1;i++) 
	 {
		 if(a[i]!=10)
		 {
			System.out.print(a[i]); 
		 }
	 }
  }
    	  
   @Test
   public void countHowManyTimesTheDuplicatesNoIsRepeatingInAnArray()
   {
	   int []a= {2,3,1,4,0,5,2};
	   LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
	   for(int i=0;i<a.length;i++)
	   {
		lh.add(a[i]);
	   }
	   for (Integer inte : lh) 
	   {
		//System.out.println(inte);// 5 4 3 0 1
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(inte==a[i])
			{
				count++;
			}
		
		}
		System.out.println(inte+" "+count);
		}
	   
   }
   
    @Test
    public void countTheDuplicatesUsingMap()
    {
	int []a= {5,4,4,3,0,1,0,4};
	LinkedHashMap<Integer, Integer> lhM=new LinkedHashMap<Integer, Integer>();
	for(int i=0;i<a.length;i++)
	{
	lhM.put(a[i],i)	;
	}
    for (Entry<Integer, Integer> m:lhM.entrySet()) 
   {
	int n=m.getKey();
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(n==a[i])//m.getKey()==a[i]
		{
		count++;	
		}
	}
	System.out.println(n+ " " +count);
 }
    }
   
  @Test
  public void countNoOfDuplicatesInAnArrayUsingCollection()
  {
	  int []a= {2,3,1,4,1,3,5,2};
	  LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
	  for(int i=0;i<a.length;i++)
	  {
		  lh.add(a[i]);
		  
	  }
	   for (Integer inte : lh) 
	   {
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(inte==a[i])
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println(inte+" "+count);
	      }
		}
	  }
	  
	@Test
	public void countNoOfDuplicatesInAnArrayUsingMAP()
	{	  int []a= {2,3,1,4,1,3,5,2};
		LinkedHashMap<Integer, Integer> lhM=new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
		lhM.put(a[i],i)	;
		}
	    for (Entry<Integer, Integer> m:lhM.entrySet()) 
	   {
		int n=m.getKey();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])//m.getKey()==a[i]
			{
			count++;	
			}
		}
		if(count>1)
		{
			System.out.println(n+ " " +count);	
		}
	}
	 }
	  
  @Test
  public void positionOfEachNoInAnArrayWithoutDuplicates()
  {
	  int[]a= {2,3,1,4,1,3,5,2};
	   int position=1;
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]==a[j])
			  {
				 a[j]=20; 
			  }
		  }
	  }
	 for (int i=0;i<a.length;i++) 
	 {
		 if(a[i]!=20)
		 {
			 System.out.println(a[i]+ " " +position);
		 }
		 position++;
	 }
  }
  
//sir pgrm
  @Test
  public void positionOfEachNoInAnArrayWithoutDuplicate()
  {
	  int[]a= {2,3,1,4,1,3,5,2};
	  LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
	  for (int i=0;i<a.length;i++)
	  {
		  lh.add(a[i]);
		  //System.out.println(lh);
	  }
    for (Integer inte : lh)
    {
		for (int i=0;i<a.length;i++)
		{
			if(inte==a[i])
			{
				System.out.println(inte+ "position is " +(i+1));
				break;
			}
		}
	}  
    	  
  }  	  
 
  @Test
  public void positionOfEachNoInAnArrayWithoutDuplicateusingMap()
  {
	  int []a= {2,3,1,4,1,3,5,2};
		LinkedHashMap<Integer, Integer> lhM=new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
		lhM.put(a[i],i)	;
		}
	    for (Entry<Integer, Integer> m:lhM.entrySet()) 
	   {
		for(int i=0;i<a.length;i++)
		{
			if(m.getKey()==a[i])
			{
				System.out.println(m.getKey()+ " Position is " +(i+1));
				break;
			}
		
        }
    	  
	   }
  }
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
}   
       

       
       
       
       
       
       
       
       
       





