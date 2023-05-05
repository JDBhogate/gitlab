package collection28_april;

import java.util.HashSet;
import java.util.Iterator;

//all java classes inherit Object 
//so all method in Object class are present in your class 
//Wap to store 5 books details to hash set and display them 
class Book1 extends Object
{
	String bname;
	String aname;
	Book1(String a,String aname)
	{
		this.bname=a;
		this.aname=aname;
	}

	@Override
	public String toString()
	{
		return bname +"   "+ aname;
	}
}


public class StoreUSerDataToSet {

	public static void main(String[] args) {
		
		
		HashSet<Book1> s= new HashSet<Book1>();
		
		Book1 b= new Book1("bigdata","abcd");
		s.add(b);
		
		s.add(new Book1("java","herbert"));
		s.add(new Book1("php","jnny"));
		s.add(new Book1("c++","lisa"));
		s.add(new Book1("dotnet","abc"));
		s.add(new Book1("cloud","xyz"));
		
		s.remove(b);
		//System.out.println(s);
		
		//store manage  traverse 
		//iterator()  - method 
		//Iterator  - interface name 
		Iterator i= s.iterator();
		while(i.hasNext())//check whether data is there in collection or not 
		{
			System.out.println(i.next());//fetch the data 
		}
		

	}

}
