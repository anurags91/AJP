package Java_Collections_Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo1 {

	public static void main(String[] args) 
	{
//		ArrayList<E>
		
		ArrayList<Integer> ob=new ArrayList<Integer>();
		
		// size() : it returns the size of arraylist
		System.out.println("Size : "+ob.size());
		// add() : it is used to add values to the list
		
		ob.add(45);
		ob.add(56);
		ob.add(35);
		ob.add(12);
		ob.add(89);
		
		System.out.println("Arraylist : "+ob);
		// to print array list use object name in println
		System.out.println("Size : "+ob.size());
		
		
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter number of values : ");
//		int n=sc.nextInt();
//		
//		while(n>0)
//		{
//			System.out.println("Enter value : ");
//			ob.add(sc.nextInt());
//			n--;
//		}
//		System.out.println("Arraylist : "+ob);
//		// to print array list use object name in println
//		System.out.println("Size : "+ob.size());
		
		
		ArrayList<String> ob1=new ArrayList<String>(5);
		
		System.out.println("ob1 size : "+ob1.size());
		
		ob1.add("a");
		ob1.add("b");
		
		System.out.println("ob1 : "+ob1);
		
		ArrayList<Float> ob2=new ArrayList<Float>();
		
		ob2.add(34.344f);
		ob2.add(56.44f);
		System.out.println("ob2"+ob2);
	}

}
