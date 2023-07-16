import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList al= new ArrayList();
		System.out.println("Initial size of ArrayList :"+al.size());
		
		
		al.add("green");
		al.add("red");
		al.add("blue");
		al.add("pink");
		al.add("4");
		
		
		
		System.out.println("\nSize of ArrayList After Additions:"+al.size());
		
		System.out.println("\nContents of ArrayList After add:"+al);
		
	   al.remove(4);
	   System.out.println("\nContents of ArrayList after remove index:"+al);
		
		al.remove("pink");
		System.out.println("\nContents of ArrayList After remove object:"+al);
		
		System.out.println("\nSize of ArrayList after deletions:"+al.size());
		
		String alElement= (String)(al.get(1));
		System.out.println("\nalElement:"+alElement);
		
		al.add(2,alElement+"rose");
		System.out.println(al);
	}
}
