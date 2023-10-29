package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Interview_programs {

	@Test
	public void case1()
	{
		int[] a= {-1,3,5,-6,8,-9,10,4,-2,7};
		int fl=a[0];
		int sl=a[0];
		int tl=a[0];

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fl)
			{
				sl=fl;
				fl=a[i];
			}
			else if(a[i]>sl)
			{
				tl=sl;
				sl=a[i];
			}
			else
			{
				tl=a[i];
			}
		}
		System.out.println(fl+tl);
		System.out.println(fl+ " "+tl);
	}


	@Test
	public void case2()
	{
		String[] s= {"Abhishek" ,"Abhi","Venkat","Ravi","Vinit","John"};
		TreeSet<String> set=new TreeSet<String>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		for (String names : set) 
		{
			System.out.println(names);
		}
	}

	@Test
	public void sameQuestion()
	{
		String[] s= {"Abhishek" ,"Abhi","Venkat","Ravi","Vinit","John"};
		for(int i=0;i<s.length;i++) 
		{
			for(int j=0;j<s.length-1;j++)
			{
				if(s[j].compareTo(s[j+1])>0)
				{
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(s));
	}

	@Test
	public void Stringg()
	{
		String[] s= {"bat","batsman","batsss"};
		String s1="";
		LinkedHashSet<Character> ch=new LinkedHashSet<Character>();
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[0].length();j++)
			{
				if(s[0].charAt(j)==s[i].charAt(i))
				{
					ch.add(s[i].charAt(i));
				}
			}
		}
		for (Character charac : ch) {
			//System.out.print(charac.toString());//or we can use String()
			System.out.print(charac+s1);
		}
		System.out.println();
	}


	@Test
	public void cae1()
	{
		int[] a= {1,2,3,55,1,2,3};
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			lhs.add(a[i]);
		}
		for (Integer integ : lhs) 
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(integ==a[i])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(integ);
			}
		}
	}


	@Test
	public void palindrome()
	{
		String s="ababa";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
			   String s1= s.substring(i,j);
				if(s1.length()>=3)
				{ 
					String rev="";
					//System.out.println(s1);
				   StringBuilder sb=new StringBuilder(s1);
					        rev=rev+sb.reverse();
						if(s1.equals(rev))
						{
							System.out.println(rev);
						}
					}
				}	
			}
		}
	
@Test
public void num()
{
   int[] a= {10,20,30,40,50};
   int m=2;
   for(int n=1;n<=m;n++)
   {
	   int temp=a[0];
	   for(int i=1;i<a.length;i++)
	   {
		   a[i-1]=a[i];
	   }
	    a[a.length-1]=temp;
   }
   for(int k=0;k<a.length;k++)
   {
	   System.out.print(a[k]+" ");  
   }  
}


@Test
public void qutn()
{
	int a[]= {1,2,7,9,16,99,100};
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.print(a[i]+" ");
		}
	}
	for(int i=0;i<a.length;i++)
	{
	 if(a[i]%2!=0)
	{
		System.out.print(a[i]+" ");
	}		
}
}


@Test
public void missinNoinanARray()
{
	int[] a= {1,2,3,4,6,8};
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<a.length;i++)
	{
		al.add(a[i]);
	}
	for(int i=1;i<10;i++)
	{
	  if(!al.contains(i))	
	  {
		  System.out.println(i);
	  }
	}
}

@Test
public void reverseString() 
{
	String s="software";
    String s1="";
    for(int i=s.length()-3;i>=2;i--)
    {
    	  s1+=s.charAt(i);
    }
    System.out.print(s.substring(0,2));
   System.out.print(s1);
    System.out.print(s.substring(s.length()-2,s.length()));
}

@Test
public void substract()
{
	int [] a= {2,8,4,5,7,6};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
		   if(a[i]-a[j]==1)
		   {
			   System.out.print(a[i]+" "+a[j]+" ");
		   }
		}
	}
}
  
@Test
public void getString()
{
	String s="saznat";
	char[] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]!='a' && ch[i]!='n' )
		{
			System.out.println(ch[i]);
		}
	}
}

@Test
public void getString2()
{
	String s="saznat";
	for(int i=0;i<s.length();i++)
{
	for(int j=0;j<s.length();j++)
	{
		
	}
}
}

@Test
public void orderOfOccurnaceUsingMap()
{
	String s="Snneha";
	LinkedHashMap<Character, Object> map=new LinkedHashMap<Character,Object>();
	for(int i=0;i<s.length();i++)
	{
		map.put(s.charAt(i), i);
	}
	for (Entry<Character, Object> lhm :map.entrySet() ) 
	{
		Character n = lhm.getKey();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(n.equals(s.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(n+ " "+ count);
	}
	
}

@Test
public void SameprgmWithoutMap()
{ 
	String s="eettssffffa";
    for(int i=0;i<s.length();i++)
    {
    	int count=0;
    for(int j=0;j<s.length();j++)
    {
    	if(s.charAt(i)==s.charAt(j) && i>j)
    	{
    		break;
    	}
   	else if(s.charAt(i)==s.charAt(j))
    {
    	count++;
    } 
    }
    if(count>=1)
    {
    System.out.println(s.charAt(i)+ " "+count);	
    }
    }
}
  
@Test
public void substringss()
{
	String s="abaab";
	for(int i=0;i<s.length();i++)
	{
      for(int j=i+1;j<=s.length();j++)
		{
		     String s1 = s.substring(i,j);
		 	System.out.println(s1);	
		}
	}
}

@Test
public void substrings2() 
{
	String s1="abaab";
	for(int i=0;i<s1.length();i++)
{
	for(int j=i+1;j<s1.length();j++) //or for(int j=i+1;j<=s1.length();j++)
	{
		String s2=s1.substring(i,j+1);// s1.substring(i,j);
		if(s2.length()==2) 
		{
		System.out.println(s2);
	}
}	
}
}

@Test
public void subString3()
{
	String s="abaabbbb";
    LinkedHashSet<String> set=new LinkedHashSet<String>();
    for(int i=0;i<s.length();i++)
    {
    	for(int j=i+1;j<s.length();j++)
    	{
    		String s1=s.substring(i,j);
    	    if(s1.length()==2)
       {
            set.add(s1);
       }
    	}	
    }
    System.out.println(set);
}

@Test
public void Substring4()
{
	String s="abbabc";
     HashMap<String, Integer> map = new HashMap<String, Integer>();
     for(int i=0;i<s.length();i++)
     {
    	 for(int j=i+1;j<s.length();j++)
    	 {
    		 String s1=s.substring(i,j);
    		 if(s1.length()==2)
    		 {
    			 if(map.containsKey(s1))
    			 {
    			   	 map.put(s1, map.get(s1)+1);
    			 }
    			 else 
    			 {
    				 map.put(s1,1);
    			 }
    		 }
    	 }
     }
    for ( Entry<String, Integer> entry : map.entrySet())
    {
		if(entry.getValue()==1)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}

@Test
public void case22()
{
	String s="ssnhea";
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for (Character charac : set) 
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(charac==s.charAt(i))
			{
			   count++;
			}			
		}
		if(count>1)
		{
			System.out.println(charac);
		}
	}
}

	
@Test
public void areanagaram()
{
	int n=142857;
	int n1=n*2;
	String s1=n+"";
	String s2=n1+"";
	boolean flag=true;
	for(int i=0;i<s1.length();i++)
	{
	if(s2.contains(s1.charAt(i)+""))
	{
   }
	else
	{
		flag=false;
		break;
	}
	}
	if(flag=true)
	{
		System.out.println("anagrams");
	}
	else
	{
		System.out.println("not anagrams");
	}
}

@Test
public void numbersss()
{
	int n=530201;
	String s1="";
	String s2="";
	while(n>0)
	{
		int rem=n%10;
		if(rem>0)
		{
			s1=rem+s1;
		}
		else
		{
			s2=rem+s2;
		}
		n=n/10;
	}
	System.out.println(s1+s2);				
}


@Test
public void Stringgiven()
{
	String s="aabbccddaaaa";
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
		    	                                                                                                     
		}
	}
}

@Test
public void palindrome1()
{
	String s1="racecara";
	int n=s1.length()/2;
	int count=0;
	for(int i=0;i<=n;i++)
	{
		if(s1.charAt(i)!=s1.charAt(s1.length()-1-i))
		{
			System.out.println("not palindrome");
			count++;
			break;	
		}
	}
	if(count==0)
	{
		System.out.println("palindrome");
	}
	
}

@Test
public void addToArray()
{
	int[] a= {1,2,3,4,9};
	int[]  b= {3,4,5};
	int[] ab=new int[a.length+b.length];
	int index=0;
	for(int ab1:a)
	{
		ab[index]=ab1;
		index++;
	}
	for(int ab2:b)
	{
		ab[index]=ab2;
		index++;
	}
	System.out.println(Arrays.toString(ab));
	
	
}

@Test
public void maxNOrInAnArray() {
    int[] a = {1, 2, 3, 4, 4, 5, 6, 7, 7};
    
     for(int i=0;i<a.length;i++)
     {
    	for(int j=i+1;j<a.length;j++)
    	{
    		if(a[i]<a[j])
    		{
    			int temp=a[j];
    			a[j]=a[i];
    			a[i]=temp;
    		}
    	}
     }
 	System.out.println(a[0]+" "+a[1]+" ");
}


@Test
public void sameProgram()
{
	
    int[] arr = {1, 2, 3, 4, 4, 5, 6, 6, 7};

    Arrays.sort(arr); // Sort the array

    boolean found = false;
    System.out.println("Duplicates in the array:");

    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] == arr[i + 1]) { // Check for duplicates
            if (!found) {
                System.out.print(arr[i]);
                found = true;
            } else {
                System.out.print(", " + arr[i]);
            }
        } else {
            found = false;
        }
    }	
}

@Test
public void OrderOfoccuranceInteger()
{
	int a=122322;
	HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
	while(a>0)
	{
		int rem=a%10;
		if(map.containsKey(rem))
		{
			map.put(rem, map.get(rem)+1);
		}
		else
		{
			map.put(rem, 1);
		}
		a=a/10;
	}
   for (Entry<Integer, Integer> output : map.entrySet()) 
   {
	System.out.println(output.getKey()+" "+output.getValue());
	   
}
	
}














}







