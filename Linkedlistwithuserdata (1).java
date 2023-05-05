package collection28_april;

import java.util.LinkedList;
//demonstrate storing user defined data in List 
public class Linkedlistwithuserdata {

	public static void main(String[] args) {
		
		LinkedList l= new LinkedList();
		
		person p= new person("neha",22);
		person p1= new person("ashu",24);
		person p2= new person("yash",24);
		
		l.add(p);
		l.add(p1);
		l.add(0,p2);
		System.out.println(l.get(0));
		
	}

}
