package FindOut;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;



public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList al = new ArrayList();
		al.add(0, "ggg");
		al.add(586);
		al.add(1,30);
		al.add(2,"456");
		System.out.println(al);
		
		LinkedList l=new LinkedList();
		l.add(90);
		l.add(20);
		l.add(1,"fff");
		l.add("");
		System.out.println(l);
				
		HashSet hs = new HashSet();
		 hs.add(1);
		 hs.add(2);
		 hs.add(3);
		 hs.add(0.9);
		 System.out.println(hs);
		 
		 PriorityQueue pq = new PriorityQueue();
		pq.add("pqr") ;
		pq.add("ooo");
		//pq.poll();
		pq.add("123");
		pq.add("0");
		pq.peek();
		System.out.println(pq);
		
		
		
		
		
	
	}

}
