package collection28_april;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		//Vector <Integer> v= new Vector<Integer>();//capacity is 10 
		Vector <Integer> v= new Vector<Integer>(3);//cpacity is 3 
		v.add(11);
		v.add(334);
		v.add(33);
		v.add(33);
		v.add(33);
		v.add(33);
		v.add(33);
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());//actual count of data in vector 
		System.out.println(v.capacity());//10 default capacity
		
	}

}
