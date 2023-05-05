package collection28_april;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		  
		  LinkedList<String> l= new LinkedList<String>();//insertion order 
		  
		   l.add("amit");
		   l.add("neha");
		   l.add("ashu");
		   l.add("mayank");
		   l.add("priya");
		   l.add("gagan");
		   l.add(1,"himanshu");//inserting new data in between 
		   l.set(0, "leena"); //replace 
		   System.out.println(l);
		   

		System.out.println(l.size());

		l.add(5,"ritu");
		l.remove(3);
		l.set(3, "kamal");
		 
		System.out.println(l.get(0));
		//Collections -- is predefined class 
		Collections.reverse(l);
		System.out.println(l);
	}}

