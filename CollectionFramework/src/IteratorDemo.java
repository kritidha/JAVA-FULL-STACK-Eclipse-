import java.util.LinkedHashSet;
import java.util.Iterator;
public class IteratorDemo {
	public static void main(String args[]) {
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("abc");
		lhs.add(10);
		lhs.add(20);
		lhs.add(40);
		lhs.add("bbc");
		
		Iterator lhsIterator =  lhs.iterator();
		
		while(lhsIterator.hasNext()) {
			Object obj = lhsIterator.next();
			
			if(obj instanceof String) {
				
				String str =((String)obj).toUpperCase();
				System.out.println("Modified String:"+str);
				
				
			}
			else {
				System.out.println("Object:"+obj);
				
			}
		}
	}
}
