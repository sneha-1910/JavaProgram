package Programs;

import org.testng.annotations.Test;

public class NumMINMax {

   @Test
   public void FirstMinInArray()  
   {
        int [] a= {2,9,0,1,4};
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
       
		/*
	if(i==0)
        {
        	System.out.println(" 1stMinNor " +a[i]);
        }
	   if(i==1)	
	   {
		   System.out.println(" 2ndmin " +a[i]);
	   }*/
            
	  }
        System.out.println("1st min no= " +a[0]);
 	   System.out.println("2nd min no= " +a[1]);
        int sum=a[0]+a[1]+a[2];
 	   System.out.println("sumOf1stand3rdMIN= " +sum); 
 	   
 	   int mul=a[1]*a[2]*a[3];
 	   System.out.println("multiOfMIn= " +mul);
  }
   
   @Test
   public void FirstMaxInArray()
   {
	   int []a= {2,3,4,5,6,1};
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
		 /*  if(i==0)
		   {
			   System.out.println(" FirstMax " +a[i]);
		   }
		   if(i==1)
		   {
			   System.out.println(" secondMax " +a[i]);
		   }*/
		 }

	   System.out.println("1st max no= " +a[0]);
	   System.out.println("2nd max no= " +a[1]);
      int sum=a[0]+a[1]+a[2];
      System.out.println("sumof1stand3rdMax= " +sum);
   
      int mul=a[0]*a[1]*a[2];
      System.out.println("mulofMAX= " +mul);
   
   }
   
    @Test
   public void SumOf1st3MINnors()
   {
    	  int [] a= {2,9,0,1,4};
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
        int sum=0;
        for(int i=0;i<3;i++)
        {
        	sum=sum+a[i];
        }
        System.out.println("sumOfMinNor=" +sum);
   }
   
    @Test
    public void sumOf1st3MAXnors()
    {
     	  int [] a= {2,9,0,1,4};
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
         int sum=0;
         for(int i=0;i<3;i++)
         {
         	sum=sum+a[i];
         }
         System.out.println("sumofMAXnor" +sum);
    } 
    
    @Test
   public void MulOf1st3MINnors()
   {
    	  int [] a= {2,9,0,1,4};
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
        int mul=1;
        for(int i=0;i<3;i++)
        {
        	mul=mul*a[i];
        }
        System.out.println("mulOfMinNo=" +mul);
   } 
   
    @Test
    public void mulOf1st3MAXnors()
    {
     	  int [] a= {2,9,0,1,4};
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
         int mul=1;
         for(int i=0;i<3;i++)
         {
         	mul=mul*a[i];
         }
         System.out.println("mulofMAXnor " +mul);
    } 
   
   @Test
   public void find1stMinNorWithoutUsingBBsort()
   {
	   int [] a= {2,4,6,8,1,7,9};
	   int fmin=a[0];
	   for(int i=0;i<a.length;i++)
	   {
		   if(fmin>a[i])
		   {
			   fmin=a[i];
		   }
	   }
	 System.out.println("The 1st min nor in an array is" +fmin);
	   
   }
 
   @Test
   public void find1stMAXnorWithoutUsingBBsort()
   {
	   int[] a= {2,3,9,8,4,5};
	   int fmax=a[0];
	   for(int i=0;i<a.length;i++)
	   {
		   if(fmax<a[i])
		   {
			   fmax=a[i];
		   }
	   }
	  
	   System.out.println("The 1st max nor in an array is " + fmax); 
   }
   
   @Test
   public void find1stand2ndMINnorWIthoutBBsort()
   {
	   int []a= {5,3,0,1,0};
	   int fmin=a[0];
	   int smin=a[0];
	   for(int i=0;i<a.length;i++)
	   {
		   if(fmin>a[i])
		   {
			 smin=fmin;
			 fmin=a[i];
		   }
		   else if(smin>a[i] && a[i]>fmin)
		   {
			   smin=a[i];
		   }   
	   }
	   System.out.println(fmin+ " "  +smin+ "  ");
	   
   }
   
   //sir program
   @Test
   public void find1stand2ndMINnorWIthoutBubbleBsort()
   {
	   int []a= {5,3,0,1,0};
	   int fmin=a[0];
	   int smin=a[0];
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]<=fmin)
		   {
			 if(a[i]!=fmin)  
			 {
			 smin=fmin;
		   }
			 fmin=a[i];
		   }
		   else if(smin==fmin || smin>a[i])
		   {
			   smin=a[i];
		   }   
	   }
	   System.out.println(fmin+ " " +smin+ "  ");
   
   } 
   
   @Test
   public void find1stand2ndmaxNoInArrayWIthoutBbsort()
   {
	   int[] a= {5,3,0,1,0};
	   int fmax=a[0],smax=a[0];
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]>=fmax)
		   {
			   if(a[i]!=fmax)
			   {
				   smax=fmax;
			   }
			   fmax=a[i]; 
			  }
		   else if(smax==fmax || smax<a[i])
		   {
			   smax=a[i];
		   }
	   }
	   
	   System.out.println("1st and 2nd no is" +fmax+ "   " +smax);
	   
   }
   
   @Test
   public void pgmToPrintCombinationOfNumbers()
   {
	   int[] a= {8,4,3,9,2,7,5,6,3};
	   for(int i=0;i<a.length;i++)
	   {
		  for(int j=0;j<a.length;j++)
			  // for(int j=i+1;j<a.length;j++)//it avoid duplicate combinations
		   {
			   if(a[i]+a[j]==10)
			   {
				   System.out.println(a[i]+ " " +a[j]);
			   }
		   }
	   }
	   
	   
	   
   }
   
   
   
}
