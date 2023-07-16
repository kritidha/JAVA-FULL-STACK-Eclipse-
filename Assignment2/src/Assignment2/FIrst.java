package Assignment2;

import java.util.HashSet;
import java.util.Iterator;

public class FIrst {
	public static void main(String args[]) {
        HashSet<String> set = new HashSet<>();
		
		set.add("Kriti");
		set.add("Anny");
		set.add("priya");
		set.add("Naina");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
