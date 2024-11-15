package Java_Collections_Demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;

public class LinkedListDemo1 
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
		
//		list1.set(2, "kkk");
		System.out.println("List 1 : "+list1);
		
		list1.add("nnn"); list1.add("jjj"); list1.add("hhh");
		list1.add("www"); list1.add("nnn"); list1.add("333");
		
		System.out.println("Elements of list : "+list1);
		
		// first stage
		Spliterator<String> sitr = list1.spliterator();
		// all the elements of the list1
		
		System.out.println("sitr : "+sitr);
		
		// second stage trySplit() : it splits the list into two parts
		// it will divide the list in two equal parts and then 
		// will store the second half of the list into object 
		// it will also remove the second half of the list from sitr
		// after using this function first half will be in the sitr object
		
		
		
		Spliterator<String> tsplit = sitr.trySplit();
		System.out.println("tsplit : "+tsplit);
		
		// ob.forEachRemaining(System.out :: println);
		
		// first half
		System.out.println("First half : ");
		sitr.forEachRemaining(System.out :: println);
		
		System.out.println("Second half : ");
		tsplit.forEachRemaining(System.out :: println);
	
		
		Object[] val= list1.toArray();
				
//		convertToIntArray()
		
		String[] a= new String[list1.size()];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]= (String) val[i];
		}
		
		for(String z:a) System.out.println(z);
		System.out.println("----------------------------------");
		list1.forEach(b -> System.out.println(b));
	}
}
