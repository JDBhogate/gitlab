package day9_classes;

import java.util.Scanner;

public class Calculation {

	
	
	int sum(int x,int y)
	{
		return x+y;
	}
	int sum(int x,int y,int z)
	{
		return x+y+z;
	}
	public static void main(String[] args) {
		 
		Calculation c= new Calculation();
		
	int y= c.sum(10,20);
	if(y==30)
	System.out.println("sum="+y);
	else
		System.out.println("wrong input");
	Scanner s= new Scanner(System.in);
	int p= s.nextInt();
	int q=s.nextInt();
	int r=s.nextInt();
	
	int k= c.sum(p,q,r);//line 11 method is called
	}

}
