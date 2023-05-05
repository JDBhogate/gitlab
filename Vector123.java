package collection28_april;

import java.util.ListIterator;
import java.util.Vector;

public class Vector123 {

	public static void main(String[] args) {
		
		Vector v= new Vector(3);//size = 0 capacity =10 
		
		v.add("neha");
		v.add("ajay");
		v.add("priya");
		v.add(0,"leena"); 
		
		
		//System.out.println(v);
		//works bi directional 
		  ListIterator i= v.listIterator();
		   while(i.hasNext())
	        {
	        	System.out.println(i.next());
	        }
	        System.out.println("\n -------------------");
        while(i.hasPrevious())
        {
        	System.out.println(i.previous());
        }
	}

}
