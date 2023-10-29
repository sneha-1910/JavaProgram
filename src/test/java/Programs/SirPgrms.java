package Programs;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class SirPgrms {
	
	@Test
	public void String() 
	{
	  String s1="welcom to expleo";
	  String[] s=s1.split(" ");
	  for(int i=s.length-1;i>=0;i--)
	  {
		  System.out.print(s[i]+ " ");
	  }
	  }
	
	@Test
	public void STring2() 
	{
     	String s="snnehaaaa";
		LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			lh.add(s.charAt(i));
		}
		for (Character str : lh) {
		
			System.out.print(str);
		}
}

	@Test
	public void AddMiddleString() {
	String[] s= {"s","sn","sneh","sneha","snehap","snehasp"};
	int middle=s.length/2;
	ArrayList<String > lh=new ArrayList<String>();
	//LinkedList<String> lh=new LinkedList<String>();
	for(int i=0;i<s.length;i++)
	{
		lh.add(s[i]);
	}
	lh.add(middle, "sne");
	System.out.println(lh);
}
	
@Test
public void duplicatewords()
{
	String[] s= {"s","sn","s","sn","sne","sne","sneha"};
	LinkedHashSet<String> lh=new LinkedHashSet<String>();
	for(int i=0;i<s.length;i++)
	{
		lh.add(s[i]);
	}	
	for (String str : lh)
	{
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(str.equals(s[i]))
			{
				count++;
			}
		}
		if(count>=1)		
		{
			System.out.println(str+ "  " +count+ " ");
		}
	}
}
	
@Test
public void ReverseString() 
{
	String s="sssnneha";
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
}
	
@Test
public void CountTheAlphabets() 
{
	String s="aaabbcdddf";
     LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
     for(int i=0;i<s.length();i++)
     {
    	 lh.add(s.charAt(i));
     }
     for (Character chara : lh) 
     {
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(chara.equals(s.charAt(i)))
			{
				count++;
			}
		}
		if(count>=1)
		{
			System.out.print(chara+ " " +count+ " ");
		}
	}
}

@Test
public void ReverseString1() 
{
	String s="today is friday";
	String[] s1=s.split(" ");
	for(int i=s1.length-1;i>=0;i--)
	{
		System.out.print(s1[i]+ " ");
	}
	
}
	
@Test
public void firstMax()
{
	int[] s= {7,-3,10,2,1,-9};
	int fmax=s[0];
	for(int i=0;i<s.length;i++)
	{
		if(s[i]>fmax)
		 fmax=s[i];
	}
	System.out.println(fmax);
	
}
	
@Test
public void Max3Products()
{
	int[] s= {7,-3,10,2,1,-9};
	for(int i=0;i<s.length;i++)
	{
		for(int j=i+1;j<s.length-1;j++)
		{
			if(s[i]<s[j])
			{
		int temp=s[i];
	       s[i]=s[j];
	       s[j]=temp;
			}
		}
		System.out.print(s[i]+" ");
	}
	int mul=1;
	for(int i=0;i<3;i++)
	{
		mul=mul*s[i];
	}
	System.out.println(mul);
}
	
@Test
public void ReverseString3() 
{
	String s="i am selenium";
	String[] s1=s.split(" " );
	StringBuilder rev=new StringBuilder();
	
	for (String str : s1) {
		for(int i=str.length()-1;i>=0;i--)
		{
			rev.append(str.charAt(i));
		}
		rev.append(" ");
	}
	
      rev.deleteCharAt(rev.length()-1);
      System.out.println(rev.toString());

  }

@Test
public void ReverseString5() 
{
	String s="my name is sneha";// i am selenium
	String[] s1=s.split(" ");
	String rev="";
	for(int i=s1.length-1;i>=0;i--)
	{
		String s2=s1[i];
	for(int j=s2.length()-1;j>=0;j--)
		{
			rev=rev+s2.charAt(j);
		}
	}
	System.out.println(rev);
	for(int k=0;k<rev.length();k++)
	{
		if(k==1|| k==5 || k== 7)
		{
			System.out.print(rev.charAt(k)+" ");
		}
		else
		{
			System.out.print(rev.charAt(k));
		}
	}	
}

@Test
public void print1to20()
{
	for(int i=1;i<=20;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
}

@Test
public void OccuranceOfString() 
{
	String s="My name is rishav it contains ri and shav";
	String[] s1=s.split(" ");
	LinkedHashMap<String , Object> lhm=new LinkedHashMap<String, Object>();
	for(int i=0;i<s1.length;i++)
	{
		lhm.put(s1[i], i);
	}
    for (Entry<String, Object> m : lhm.entrySet()) 
    {
    	int count=0;
		String n = m.getKey();
		for(int i=0;i<s1.length;i++)
		{
			if(n.equals(s1[i]))
			{
				count++;
			}
		}
		System.out.println(n+ " repeats " +count+ " times");
		
	}
}

@Test
public void StringintheGivenPattern()
{
	String s="aabcbbdeaa"; // aa ab bc cb bb bd de ea aa
	
	for(int i=0;i<s.length()-1;i++)
	{
		System.out.print(s.charAt(i)+""+s.charAt(i+1)+" ");
	}
}


	
	@Test
	 public void test1()
	{ 
		//ip=1,2,5
		//op=2,3,4,6,7,8,9,10
		
	        for (int i = 1; i <= 10; i++) {
	            if (i != 1 && i != 2 && i != 5) {
	                System.out.print(i);
	            }
	        }
  }
	
 @Test
public void selenium()
{
	String s="Selenium";// s se sel sele selen seleni seleniu selenium
	for(int i=0;i<s.length();i++)
	{
			
	for(int j=0;j<=i;j++)	
	{
			System.out.print(s.charAt(j));
		
	}	
	System.out.println();

	}
}

	
@Test
public void arr()
{
	 int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

     // Initialize separate arrays for even and odd numbers
     int[] evenNumbers = new int[integerArray.length];
     int evenCount = 0;
     int[] oddNumbers = new int[integerArray.length];
     int oddCount = 0;

     // Iterate through the array and classify numbers
     for (int num : integerArray) {
         if (num % 2 == 0) {
             evenNumbers[evenCount] = num;
             evenCount++;
     
         } else {
             oddNumbers[oddCount] = num;
             oddCount++;
            
         }
     }

     // Print even numbers
     System.out.println("Even numbers:");
     for (int i = 0; i < evenCount; i++) {
    	 
         System.out.print(evenNumbers[i]);
     }

     // Print odd numbers
     System.out.println("\nOdd numbers:");
     for (int i = 0; i < oddCount; i++) 
     {
         System.out.print(oddNumbers[i]);
     }
 }


@Test
public void num()
{
	//input:2,3,7
	//output:1,4,5,6,8,9,10

	for(int i=1;i<=10;i++)
	{
		if(i!=2 && i!=3 && i!=7)
		{
			System.out.println(i);
		}
	}	
}

@Test
public void PrintString()
{
	String s="aabbaa";
	for(int i=0;i<s.length()-1;i++)
	{
		System.out.println(s.charAt(i)+""+s.charAt(i+1));
	}
	
}

@Test
public void removeDuplicates()
{
	String s="aabbaa";
	
	LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		lhs.add(s.charAt(i));
	}
	for (Character charac : lhs) 
	{
		System.out.println(charac);
	}
	
}

@Test
public void givenString()
{
	String s="my name is Radha";//mynameisradha
	 
       String output=s.replace(" ", "");
       System.out.println(output);
}

@Test
public void reverse()
{
	String s="my name is ok";
	String[] s1=s.split("");
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
	
}

@Test
public void printvowels() 
{
	String[] names= {"vijay","vinay","jawahar"};
	for (String name : names)
	{
		int vowelCount=Count(name);
		System.out.println(name+ " "+ vowelCount);
	}
}

   public int Count(String str)
   {
	   int count=0;
	   for(int i=0;i<str.length();i++)
	   {
		   char ch = Character.toLowerCase(str.charAt(i));
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
               count++;
	   }
	   } 
	  return count;	   
}

   
 @Test
 public void printVowel()
 {
		String[] names= {"Rakshith","chat","Zoom"}; 
		for (String name : names) 
		{
			int vowelcount=Count1(name);
			System.out.println(name+ " "+vowelcount);
		}
 }
  public int Count1(String str)
  {
	  int count=0;
	  for(int i=0;i<str.length();i++)
	  {
		  char ch=Character.toLowerCase(str.charAt(i));
		  if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u')
		  {
			  count++;
		  }
  }
	return count;
    
  }  
  
  
  @Test
  public void S_Case()
  {
	  String[] names= {"Rakshith","chat","Zoom"}; 
	  for (String nm : names) 
	  {
		int count=0;
		char[] ch=nm.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				count++;
			}
		}
	  System.out.println(nm+ " "+ count);	
	}
  }
  
  
  
   
@Test
public void ArraylistToArray()
{
	ArrayList<String> arrList=new ArrayList<String>();
	arrList.add("Element 1");
	arrList.add("Element 2");
	arrList.add("Element 3");
	
	String[] array=new String[arrList.size()];
	array=arrList.toArray(array);
	
	for (String ele : array) 
	{
		System.out.println(ele);
	}
	
} 
   
@Test
public void reverseString2() 
{
	String s="my name is anusha";
	String[] s1=s.split(" ");
	for(int i=0;i<s1.length;i++)
	{
		String s2=s1[i];
		for(int j=s2.length()-1;j>=0;j--)
		{
			System.out.print(s2.charAt(j));
		}
		System.out.print(" ");
	}
	
}
   
@Test
public void Palindrome()
{
	String a= "madam";
	String r = "";	
	for (int i = a.length()-1; i >=0; i--)
	{
		r=r+a.charAt(i);

	}
	if(a.equals(r))
	{
		System.out.println(a+ "is a string palindrome");
	}
	else
	{
		System.out.println(a+ "is not a string palindrome");		 
	}

}  
   
@Test
public void count_96()
{
	int no=12345;
	int count=0;
	while(no!=0)
	{
		int rem=no%10;
		count=count+1;
		no=no/10;
	}
	System.out.println(count);
}
@Test
public void pattern_95()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
@Test
public void Swap2Without3rd_91()
{
	
	int a=10;
	int b=20;
	a= a+b;//10+20=30
	b=a-b;//30-10=20
	a = a-b;//30-20=10
	System.out.println(a);
	System.out.println(b);
			
}


@Test
public void Factorial_89()
{
	int no=6;
	int fact=1;
	for(int i=no;i>=1;i--)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}

@Test
public void Reverse_88()
{
	String s="my name is anusha";
	String[] arr =s.split(" ");
	
	
	for(int i=0;i<arr.length;i++)
	{
		String a=arr[i];
		

	for(int j=a.length()-1;j>=0;j--)
	{
		System.out.print(a.charAt(j));
		
	}
	System.out.print(" ");
	
}

	
}
@Test
public void pattern_77()
{
	int space = 3;
	int star = 1;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		space--;
		star = star+2;
	}
}
@Test
public void Armstrong_75()
{
	int no=153;
	int sum=0;
	int copy=no;
	while(no!=0)
	{
		int rem=no%10;
		sum = sum+(rem*rem*rem);
		no=no/10;
		
				}
	if(copy==sum)
	{
		System.out.println( copy + "is a Armstrong number ");
	}
	else
	{
		System.out.println( copy + "is not a Armstrong number");
	}
}

@Test
public void Reverse_71()
{

	String s="i am in ooty";
	String[] arr =s.split(" ");
	
	
	for(int i=0;i<arr.length;i++)
	{
		String a=arr[i];
		

	for(int j=a.length()-1;j>=0;j--)
	{
		System.out.print(a.charAt(j));
		
	}
	System.out.print(" ");
}
}
@Test
public void Reverse_66()
{

	String s="i love programming";
	String[] arr =s.split(" ");
	
	
	for(int i=0;i<arr.length;i++)
	{
		String a=arr[i];
		

	for(int j=a.length()-1;j>=0;j--)
	{
		System.out.print(a.charAt(j));
		
	}
	System.out.print(" ");
}
}

@Test
public void pattern_49()
{
	for(int i=1;i<=5;i++)
	{
		char a= 'A';
		for(int j=1;j<=i;j++)
		{
			System.out.print(a);
			a++;
		}
		System.out.println();
	}
}  
   
  @Test
  public void countCharactersInString_47() 
  {
	String s="immunuties" ;
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='u')
		{
			count++;
		}
	}
	System.out.println(count);
  }

@Test
public void countCharactersInString_48() 
{
	String s="education";
	
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch =='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u' )
		{
			System.out.println(ch);
		}
	}	
}

@Test
public void combinatiOfNumbers_50() 
{
	int[] a= {1,3,5,2,8,9,10};
	for(int i=0;i<a.length;i++)
	   {
		  for(int j=0;j<a.length;j++)
			  // for(int j=i+1;j<a.length;j++)//it avoid duplicate combinations
		   {
			   if(a[i]+a[j]==11)
			   {
				   System.out.println(a[i]+ " " +a[j]);
			   }
		   }
	   }
	
}


@Test
public void string() 
{
	String s1="hello";
	String s2=new String("hello");
	System.out.println(s1==s2);
}

@Test
public void addtheelements_93()
{
	int[] a= {1,2,3};
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			 int add=a[i]+a[j];
	       System.out.println(add);
		}
	}
}

@Test
public void fibonacci()
{
	int fib1=0;
	int fib2=1; int fib3=0;
	int[] a=new int[10];
//	System.out.print(fib1+ " "+ fib2+" ");
	for(int i=0;i<10;i++)
	{
        fib3=fib1+fib2;
        a[i]=fib1;
        System.out.print(fib1+" ");
		fib1=fib2;
		fib2=fib3;
//		System.out.print(fib3+" ");
	}
	System.out.println();
	for (int i = a.length-1; i >=0; i--) 
	{                                             
		System.out.print(a[i]+" ");
	}
}

@Test
public void case2()
{
	int[] a= {1,2,3,5,6,7,8};
	for(int i=1;i<10;i++)
	{
		for (int j : a) 
		{
		if(i!=j)
		{
		System.out.println(i);
	}
	
}
}
}

















}














	
	
	
	
	
	
	
	
	
	
	






















	
	
	
	
	
	

