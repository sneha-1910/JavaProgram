package Programs;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class StringButOtherPrograms {

	@Test
	public void countNoOfVowelsINAStringWithDuplicates() 
	{

		Scanner sc=new Scanner(System.in);
        String st=sc.next();
        char[] s=st.toCharArray();
        int count=0;
        for(int i=0;i<s.length;i++)
        {
        	if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' )
        	{
        		count++;
        	System.out.print(s[i]);
       }
       }
        System.out.println(count);
	}
	
@Test
public void countNoOfVowelsInAStringWithoutDuplicates()
{
	Scanner sc=new Scanner(System.in);
    String st=sc.next();
    char[] s=st.toCharArray();
   
    LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
     for(int i=0;i<s.length;i++)
    {
    	 lh.add(s[i]);
    	 
    }
     int count=0;
    for (Character ch : lh) 
    {
         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
    	{
    		count++;
    	System.out.print(ch);
     
   }
   }
	    System.out.println(count);
    	 
    }

@Test
public void segregateAlphabetsNumbersAndSpclCharactersFRomGivenString() 
{
	String s="a1b2%c2@3";// abc 123 %@
	char[] st=s.toCharArray();
	String alpha="";
	String num="";
	String spcl="";
	for(int i=0;i<st.length;i++)
	{
		if(Character.isAlphabetic(st[i]))
		{
		 alpha = alpha+st[i];
		
		}
    else if(Character.isDigit(st[i]))	
    {
    	num=num+st[i];
	}
	else
	{
		spcl=spcl+st[i];
	}
	}
	System.out.println(alpha);
	System.out.println(num);
	System.out.println(spcl);
}

@Test
public void  diffmethodsegregateAlphabetsNumbersAndSpclCharactersFRomGivenString() 
{
	String s="a1b2%c2@3";// abc 123 %@
	
	String alpha="";
	String num="";
	String spcl="";
	for(int i=0;i<s.length();i++)
	{
		char st=s.charAt(i);
		if(st>='a' && st<='z' || st>='A' && st<='Z')
		{
		 alpha = alpha+st;
		
		}
    else if(st>='0' && st<='9')	
    {
    	num=num+st;
	}
	else
	{
		spcl=spcl+st;
	}
	}
	System.out.println(alpha);
	System.out.println(num);
	System.out.println(spcl);
}

@Test
public void addingNumbersInASTring()
{
	String s="1he2m4";
	int sum=0;
	
	for(int i=0;i<s.length();i++)
	{
	if(s.charAt(i)>='0' && s.charAt(i)<='9')
	{
	int n=s.charAt(i)-48;
	sum=sum+n;
	}
	}
	System.out.println(sum);
}

@Test
public void sumOf2DigitsInAString() 
{
	String s="12a11b3"; //11+12+3=26
       String num="";
       int sum=0;
       int tsum=0;
	for(int i=0;i<s.length();i++)
	{
	if(s.charAt(i)>='0' && s.charAt(i)<='9')
	{
		int n=s.charAt(i)-48;
		tsum=tsum*10+n;
     }
	else {
		sum=sum+tsum;
		tsum=0;
	}
 }
	sum=sum+tsum;
	System.out.println(sum);
}

@Test
public void printMinLengthValuesInAString() 
{
	String[] s= {"12", "1234", "12345","45","1434234"};// 12 45
	String min_length=s[0];
	for(int i=0;i<s.length;i++)
	{
		if(s[i].length()<min_length.length())
		{
			min_length=s[i];
		}
	}
	for(int i=0;i<s.length;i++)
	{
		if(s[i].length()==min_length.length())
	    {
			System.out.println(s[i]+ " ");        
	    }
	}
}

@Test
public void  printMAXLengthValuesInAString() 
{
	String[] s= {"1234","12345","455","88899","123456"};
	String max_length=s[0];
	for(int i=0;i<s.length;i++)
	{
		if(s[i].length()>max_length.length())
		{
			max_length=s[i];
		}
	}
	
	for(int i=0;i<s.length;i++)
	{
		if(s[i].length()==max_length.length())
         {
	           System.out.println(s[i]+ " ");
         }
	}
	
}

@Test
public void printMINIMUMLengthValuesInString() 
{
	String[] s= {"ab","as","abcd","a","ccddee"};
	String min_length=s[0];
	for(int i=0;i<s.length;i++)
	{
		if(s[i].length()<min_length.length())
		{
			min_length=s[i];
		}
	}
	for(int i=0;i<s.length;i++)
	{
		if(s[i].length()==min_length.length())
		{
			System.out.println(s[i]+ " ");
		}
	}
}

@Test
public void printMAxiMUMLengthValuesInString() 
{
	String[] s={"ab","as","abcd","a","ccddee"};
	String max_length=s[0];
	for(int i=0;i<s.length;i++)
	{
		if(s[i].length()>max_length.length())
		{
			max_length=s[i];
		}
	}
	for(int i=0;i<s.length;i++)
	{
		if(s[i].length()==max_length.length())
		{
			System.out.println(s[i]+ " ");
		}				
	}
}


















}


























       
        
	

