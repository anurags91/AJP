package Java_Collections_Demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list1=new LinkedList<String>();
		
		list1.add("a");
		list1.add("b");
		list1.add(1, "abc");
		ArrayList<String> list2=new ArrayList<String>();
		
		list2.add("134"); list2.add("135"); list2.add("136");
		
		list1.addAll(list2);
		
		list1.addAll(1, list2);
		list1.addFirst("mmm");
		list1.remove();
		System.out.println("List1 before removal: "+list1);
		list1.removeIf(x -> x.startsWith("a"));
		
		
		System.out.println("List1 : "+list1);
		
		System.out.println("List 2 before clear : "+list2);
		ArrayList<String> clone = (ArrayList<String>) list2.clone();
		list2.clear();
		System.out.println("List 2 after clear : "+list2);
		System.out.println("clone : "+clone);
		
		// contains()  : it is used to search an element in the list
		
		System.out.println("List1 : "+list1);
		if(list1.contains("bjj"))
			System.out.println("Value found!!");
		else
			System.out.println("Value not found!!");
		
		System.out.println("Element : "+list1.element());// returns the first element
		System.out.println("Get index : 3 : "+list1.get(3));
		System.out.println("get first : "+list1.getFirst());
		System.out.println("get last : "+list1.getLast());
		
		// indexOf() / lastIndexOf()
		
		System.out.println("index of 135 : "+list1.indexOf("135"));
		System.out.println("index of 135 : "+list1.lastIndexOf("135"));
		
		ListIterator<String> itr = list1.listIterator(3);
		
		System.out.println("itr : "+itr);
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		list1.offer("xyz");
		System.out.println("list1 : "+list1);
		
		list1.offerFirst("xyz1");
		System.out.println("list1 : "+list1);
		
		list1.offerLast("xyz2");
		System.out.println("list1 : "+list1);
		
		System.out.println("peek : "+list1.peek());
		System.out.println("peekfirst : "+list1.peekFirst());
		System.out.println("peeklast : "+list1.peekLast());
		
		System.out.println("poll : "+list1.poll());
		System.out.println("List 1 : "+list1);
		
		System.out.println("poll last : "+list1.pollLast());
		System.out.println("List 1 : "+list1);
		
		System.out.println("poll first : "+list1.pollFirst());
		System.out.println("List 1 : "+list1);
		
		
		
		
		
		
		
		
	}
}