import java.util.Iterator;
import java.util.TreeSet;

public class FIRSTASS3 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		//Collection<String> set = new TreeSet<>(Collections.reverseOrder());
		set.add("Mili");
		set.add("Kriti");
		set.add("red");
		set.add("Pink");
		
		Iterator<String> it = set.iterator();
		String query = "Kriti";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}}