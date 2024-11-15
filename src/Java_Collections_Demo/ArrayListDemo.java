package Java_Collections_Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 =new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		
		int n=sc.nextInt();
		
		while(n>0)
		{
			System.out.println("Enter value : ");
			list1.add(sc.nextInt());
			n--;
		}
		System.out.println("Arraylist : "+list1);
		
		Iterator itr = list1.iterator();
		System.out.println("Elements of Array list are : - ");
		int sum=0;
		while(itr.hasNext())
		{
			Integer x = (Integer) itr.next(); // next() method returns an object of Object class
			// Object-> Integer
			System.out.println(x);
			sum+=x;
		}
		
		System.out.println("Sum : "+sum);
		
//		add() : to insert the value List
		// List - > ArrayList, LinkedList, Stack, Vector
		
		System.out.println("Before insertion : "+list1);
		
		list1.add(2,100); // it is used to insert a value at the given index
		//    add(index, value)
		
		System.out.println("After insertion : "+list1);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		list2.add(134); list2.add(135); list2.add(136);
		
		//listob.addAll(list2ob);
		// to store all the elements of list 2 into list1 we can use
		// add function -> listob.add(list2ob); it will add all the elements
		// of second list into the first list and it will start to add elements from
		// the last available index of the first list
		// listob.addAll(index, list2ob);
		// it will start adding all the values of list2 in list1 from the given index
		// and it will shift all the existing values of the first list to the end
		
		
		//list1.addAll(list2);
		list1.addAll(3,list2);
		System.out.println("After adding list 2 : "+list1);
		
		// addFirst();  addLast();
		// addFirst function will add the new value at the first index of the list
		// and will shift existing elements to the right side
		// addLast() : it will add the new value at the last of the existing list
		
		list1.addFirst(1000);
		list1.addLast(2000);
		
		System.out.println("List1 : "+list1);
		
		list1.remove(3);  // it will delete value from 3rd index
		Integer x=2000;
		//2000- int - index 
		list1.remove(x); // it will remove 2000 from the list
		list1.removeFirst();// removes first element
		list1.removeAll(list2); // it will remove all the elements of list2 from list1
		list1.removeLast(); // it removes the last element
		
		System.out.println("After Removing values:  "+list1);
		
		// => removeIf()
		// for(int a:arr)
//		list1.removeIf(varname -> condition)
//		varname-> it will contain value of the list one by one to be used in the condition
		
		list1.removeIf(m -> m%2!=0); // lambda expression
		System.out.println("list1 : "+list1);
	}

}
