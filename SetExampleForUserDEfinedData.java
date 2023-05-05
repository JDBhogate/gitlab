package collection28_april;

import java.util.HashSet;


public class SetExampleForUserDEfinedData {

	public static void main(String[] args) {
		
		person p=new person("amit",22);
		person p1= new person("neha",22);
		person p2= new person("neha",22);
		person p3= new person("neha",22);
		person p4= new person("neha",22);
		
		HashSet<person> r= new HashSet();
		r.add(p);
	 	r.add(p1);
		r.add(p2);
		r.add(p3);
		r.add(p4);
		
		for(person i:r)
		{
			System.out.println(i);
		}
		 
		
	}

}
