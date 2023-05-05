package collection28_april;

import java.util.Comparator;
import java.util.TreeSet;
//Treeset uses sorting algorithm

class Namecomparator implements Comparator<person>
{
	public int compare(person u,person u1)
	{
		System.out.println("***************");
		return u.pname.compareTo(u1.pname);  // -1 1 0 
	}
}

public class TreeSetExample 
{

	public static void main(String[] args) {
		
		person p=new person("amit",22);
		person p1= new person("riya",22);
		person p2= new person("bina",22);
		person p3= new person("ashu",22);
		person p4= new person("gagan",22);
		
		//to perform sorting on user defined class we  have to pass comparator object to treeset constructor 
		//comparator will contain sorting logic 
		// and override compare () method 
		
		TreeSet<person> r= new TreeSet(new Namecomparator());
		r.add(p);
	 	r.add(p1);
		r.add(p2);
		r.add(p3);
		r.add(p4);
		
		for(person i:r)
		{
			System.out.println(i);
		}
	}}
		