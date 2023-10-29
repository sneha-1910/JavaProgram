package Programs;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class StringPgrms {
//1
	@Test
	public void reverseString()
	{
		String s="Banglore"; 
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i); 
		}
		System.out.println(rev);	
	}
	
	//2
	@Test
	public void reverseString2()
	{
		String s="Banglore"; 
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
	
	//3
 @Test
  public void reverseString3()
	{
		String s="Banglore"; 
	     char[] str=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(str[i]);
		}
}
	
 //4
 @Test
 public void reverseString4()
	{
		String s="Banglore"; 
		char[] str=s.toCharArray();
		int count=0;
		for(char c:str)
			{
			count++;
		}
	for(int i=count-1;i>=0;i--)
	{
		System.out.print(str[i]);
	}
	}
	
	//5
 @Test
 public void reverseString5()
	{
		//String s="Banglore"; 
	StringBuffer s=new StringBuffer("Banglore");
	System.out.println  (s.reverse());
	}
	
@Test
public void removeDuplicatesTestYantra() 
{
	String s="TestYantra"  ;
	char[] ch=s.toCharArray();
      LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
	for(int i=0;i<ch.length;i++)
	{
	 //  lh.add(s.charAt(i));// or
	   lh.add(ch[i]);
	}

	for (Character charc : lh) {
		  
		System.out.print(charc);
		
	}
}

@Test
public void removeDuplicatesUsingMap() 
{
    String s="TestYantra";
    String s1=s.toLowerCase();
    LinkedHashMap<Character, Object> lhm=new LinkedHashMap<Character, Object>();
    for(int i=0;i<s1.length();i++)
    {
    	lhm.put(s1.charAt(i), i);
    }
    for (Entry<Character, Object> m : lhm.entrySet()) 
    {
	System.out.print(m.getKey());
	System.out.print(m.getValue());
	}
	
}

@Test
public void occuranceOfEachCharacterUsingMapString11()
{
	String s="TestYantra";
	String s1=s.toLowerCase();
	LinkedHashMap<Character, Object> lhm=new LinkedHashMap<Character, Object>();
      for(int i=0;i<s1.length();i++)
      {
    	  lhm.put(s1.charAt(i),i);
      }
       for (Entry<Character, Object> m : lhm.entrySet())
       {
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(m.getKey()==s.charAt(i))
			{
				count++;
			}
		}
	System.out.println(m.getKey()+ " is repeating " +count+ "times");
		
	}		
	}

public void occuranceOfEachCharacterUsingMapString12()
{
	String s="TestYantra";
	String s1=s.toLowerCase();
	LinkedHashMap<Character, Object> lhm=new LinkedHashMap<Character, Object>();
      for(int i=0;i<s1.length();i++)
      {
    	  lhm.put(s1.charAt(i),i);
      }
       for (Entry<Character, Object> m : lhm.entrySet())
       {
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(m.getKey()==s.charAt(i))
			{
				count++;
			}
		}
	System.out.println(m.getKey()+ " is repeating " +count+ "times");
		
	}
		
	}
	 
     @Test
     public void countNosOfDuplicatesInString()
     {
    		String s="TestYantra"  ;
    		char[] ch=s.toCharArray();
    	      LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
    		for(int i=0;i<ch.length;i++)
    		{
    		    lh.add(ch[i]);
    		}

    		for (Character charc : lh) {
    			  
    			//System.out.print(charc);
    			int count=0;
    			for(int i=0;i<ch.length;i++)
    			{
    				if(charc==ch[i])
    				{
    					count++;
    				}
    			}
    		
    	 System.out.println(charc+ " "+count);
    	  }
     }
     
     
     @Test
     public void CountNoOfDuplicatesInGivenStringUsingMap()
     {
     	String s="TestYantra";
     	String s1=s.toLowerCase();
     	LinkedHashMap<Character, Object> lhm=new LinkedHashMap<Character, Object>();
           for(int i=0;i<s1.length();i++)
           {
         	  lhm.put(s1.charAt(i),i);
           }
            for (Entry<Character, Object> m : lhm.entrySet())
            {
     		int count=0;
     		for(int i=0;i<s.length();i++)
     		{
     			if(m.getKey()==s.charAt(i))
     			{
     				count++;
     			}
     		}
     		if(count>1) {
     	System.out.println(m.getKey()+ " is repeating " +count+ "times");
     		
     	}
            }
     	}
  
@Test
public void occuranceOfEachCharacter() 
{
	String s="TestYantra"  ;
	String s2=s.toLowerCase(); //sir
	char[] ch=s.toCharArray();//if we dont wanna use
      LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
	for(int i=0;i<ch.length;i++) //s2.length
	{
	    lh.add(ch[i]);//lh.add(s2.charA(i));
	}

	for (Character charc : lh) {
		  
		//System.out.print(charc);
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(charc==ch[i]) //charc==s.charAt(i))
			{
				count++;
			}
		}
	if(count>1) {
 System.out.println(charc+ " "+count);
  }
}

}

@Test
public void occuranceOfEachCharacterUsingMapString1()
{
	String s="TestYantra";
	String s1=s.toLowerCase();
	LinkedHashMap<Character, Object> lhm=new LinkedHashMap<Character, Object>();
      for(int i=0;i<s1.length();i++)
      {
    	  lhm.put(s1.charAt(i),i);
      }
       for (Entry<Character, Object> m : lhm.entrySet())
       {
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(m.getKey()==s.charAt(i))
			{
				count++;
			}
		}
	System.out.println(m.getKey()+ " is repeating " +count+ "times");
		
	}
		
	}




@Test
public void PositionofEachString() 
{
	String s="TestYantra"  ;
	char[] ch=s.toCharArray();
      LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
	for(int i=0;i<ch.length;i++)
	{
	    lh.add(ch[i]);
	}

	for (Character charc : lh)
	{
		for(int i=0;i<ch.length;i++)
		{
			if(charc==ch[i])
			{
				System.out.println(charc+ " position is " +(i+1));
				break;
			}
		}
}

}

@Test
public void  PositionofEachStringUsingMap()
{
	String s="TestYantra";
	String s1=s.toLowerCase();
	LinkedHashMap<Character, Object> lhm=new LinkedHashMap<Character, Object>();
	for(int i=0;i<s1.length();i++)
	{
		lhm.put(s1.charAt(i), i);
	}
	for (Entry<Character, Object> m : lhm.entrySet()) 
	{
		Character n = m.getKey();
		for(int i=0;i<s1.length();i++)
		{
			if(n==s1.charAt(i))
			{
				System.out.println(m.getKey()+ " position is " +(i+1));
				break;	
			}
		}
		
	}
}

@Test
public void removeDuplicatesFromString2()
{
	String s="I am from am from TestYantra";
	String[] s1=s.split(" ");
	   LinkedHashSet<String> lh=new LinkedHashSet<String>();
		for(int i=0;i<s1.length;i++)
		{
		    lh.add(s1[i]);
		}

		for (String str : lh) 
		{
			  
			System.out.print(str+ " ");
			
		}
}

@Test
public void CountNosOfDuplicatesfromString2() {
	 
	String s="I am from am from TestYantra"  ;
    String[] s1=s.split(" ");
      LinkedHashSet<String> lh=new LinkedHashSet<String>();
	for(int i=0;i<s1.length;i++)
	{
	    lh.add(s1[i]);
	}

	for (String str : lh) {
		  
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(str.equals(s1[i]))
			{
				count++;
			}
		}
	
 System.out.println(str+ " "+count);
  }
}

@Test
public void OccuranceOfEachcahracterFromSTring2() 
{
	String s="I am from am from TestYantra"  ;
    String[] s1=s.split(" ");
      LinkedHashSet<String> lh=new LinkedHashSet<String>();
	for(int i=0;i<s1.length;i++)
	{
	    lh.add(s1[i]);
	}
	for (String str : lh) {
		  
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(str.equals(s1[i]))
			{
				count++;
			}
		}
	if(count>1) {
 System.out.println(str+ " "+count);
  }
}
}

@Test
public void OccuranceOfEachcahracterFromSTring2UsingMap()
{
	String s="I am from am i TestYantra";
	String st=s.toLowerCase();
	String[] str=st.split(" ");
	LinkedHashMap<String, Object> lh=new LinkedHashMap<String, Object>();
	for(int i=0;i<str.length;i++)
	{
		lh.put(str[i], i);
	}
	for (Entry<String, Object> m : lh.entrySet()) {
     { 
    	 String n = m.getKey();
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(n.equals(str[i]))
			{
				count++;
			}
		}
			System.out.println(n+ " " +count);	
     }
	}
}

@Test
public void PositionOfEachCharacterFromString2() 
{

	String s="I am from am from TestYantra"  ;
    String[] s1=s.split(" ");
      LinkedHashSet<String> lh=new LinkedHashSet<String>();
	for(int i=0;i<s1.length;i++)
	{
	    lh.add(s1[i]);
	}
	for (String str : lh) 
	{
		for(int i=0;i<s1.length;i++)
		{
			if(str.equals(s1[i]))
			{
				System.out.println(str+ " position is " +(i+1));
				break;	
			}
		}
	}
}

@Test
public void StringPolidrome() 
{
	String s= "malayalam";
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	if(rev.equals(s))
		{
		System.out.println("yes, the given string is a polindrome");
	}
	else
	{
		System.out.println("No, the given string is not a polindrome");
	}
}

@Test
public void printPositionOfEcahCharInReverseUsingMap() 
{
    String s="Tester"; //r=6 e=5 t=4 s=3
    String s1=s.toLowerCase();
	LinkedHashMap<Character, Object> lhm=new LinkedHashMap<Character, Object>();
	for(int i=0;i<s1.length();i++)
	{
		lhm.put(s1.charAt(i), i);
	}
	for (Entry<Character, Object> m : lhm.entrySet()) 
	{
		Character n = m.getKey();
		for(int i=s1.length()-1;i>=0;i--)
		{
			if(n==s1.charAt(i))
			{
				System.out.println(m.getKey()+ " position is " +(i+1));
				break;	
			}
		}
	}
	
}


@Test
public void printPositionOfEcahCharInReverse()
{
	 String s="Tester"; //r=6 e=5 t=4 s=3
	    String s1=s.toLowerCase();
		LinkedHashSet<Character> lh=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			lh.add(s1.charAt(i));
		}
	for (Character str : lh) 
	
		{
			
			for(int i=s1.length()-1;i>=0;i--)
			{
				if(str==s1.charAt(i))
				{
					System.out.println(str+ " position is " +(i+1));
					break;	
				}
			}
		}
}

@Test
public void reverseGivenString()
{
   String s="I am from TestYantra"; //TestYantra from am I
   String[] s1=s.split(" ");
   for(int i=s1.length-1;i>=0;i--)
   {
	   System.out.print(s1[i]+ " ");
   }
}

@Test
public void reverseTheWordsInString() 
{
	String[] s={"I", "am", "from", "TestYantra"}; // I ma morf artnaYtseT
	//String[] s=st.split(" ");
//	for(int i=s.length-1;i>=0;i--)
	for(int i=0;i<s.length;i++)
	{
	   String str=s[i];
	 
	   for(int j=str.length()-1;j>=0;j--)
	   {
		   System.out.print(str.charAt(j));
	   }
	   System.out.print(" ");
	}
}

@Test
public void swap1stAndLastWordsInAString() 
{
	String st="I am from TestYantra";//TestYantra am from I
	String[] s = st.split(" ");
	
	// s[0]=I s[1]=am s[2]=from s[3]=TestYantra
	   String temp=s[0];
	    s[0]=s[s.length-1];
        s[s.length-1]=temp;
	  for(int i=0;i<s.length;i++)
	  {
		  System.out.print(s[i]+" ");
	  }

}




















}





	
	
	
	
	

