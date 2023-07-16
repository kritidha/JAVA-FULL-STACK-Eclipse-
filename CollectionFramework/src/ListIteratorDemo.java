import java.util.*;
public class ListIteratorDemo {
	public static void main(String args[]) {
		ArrayList al= new ArrayList();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add(5);
		al.add(6);
		al.add(7);
		 System.out.println("Al elements before iteration:"+al);
		 int count=1;
		 
		 ListIterator litr = al.listIterator();
		 while(litr.hasNext()) {
			 Object obj= litr.next();
			 
			 if(obj instanceof String) {
				 String s=(String)obj;
				 litr.set(s.toUpperCase());
				 
			 }
			 else if(obj instanceof Integer) {
				 if(count==1) {
					 litr.add(20);
					 count++;
				 }
			 }
		 }
		 
		 System.out.println("Al elements after iteration :"+al);
		 
		 while(litr.hasPrevious()) {
			 Object obj = litr.previous();
			 System.out.println(obj);
		 }
	}
}
