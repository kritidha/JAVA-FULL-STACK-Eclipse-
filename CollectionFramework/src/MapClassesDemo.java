import java.util.*;
public class MapClassesDemo {
	
public static void main(String args[]) {
	HashMap hm = new HashMap();
	LinkedHashMap lhm= new LinkedHashMap();
	TreeMap tm= new TreeMap();
	
	hm.put("Tom", new Double(4000.00));
	hm.put("John",new Double(3500.50));
	hm.put("Smith", new Double(2125.25));
	
	lhm.put("Tom", new Double(4000.00));
	lhm.put("John",new Double(3500.50));
	lhm.put("Smith", new Double(2125.25));
	
	tm.put("ABC", new Double(4000.00));
	tm.put("cbc",new Double(3500.50));
	tm.put("Bbc", new Double(2125.25));
	
	System.out.println("hm elements:"+hm);
	System.out.println("lhm elements:"+lhm);
	System.out.println("tm elements:"+tm);
	
	
	Set set= hm.keySet();
	Iterator hmitr = set.iterator();
	
	
	System.out.println("\n The Account balance of lhm Account Holders:");
	Collection lhmcol = lhm.values();
	
	Iterator lhmitr = lhmcol.iterator(); 
	
	while(lhmitr.hasNext()) {
		System.out.println(lhmitr.next());
	}
	
	System.out.println();
	System.out.println("\nThe Account balance of tm Account holder:");
	
	
	Set tmset=tm.entrySet();
	Iterator tmitr= tmset.iterator();
	while(tmitr.hasNext()) {
		Map.Entry me=(Map.Entry)tmitr.next();
		
		System.out.println(me.getKey()+":");
		System.out.println(me.getValue());
		
	}
	
	double balance= ((Double)hm.get("John")).doubleValue();
	hm.put("John",new Double(balance+1000));
	
	System.out.println("John's new balance: "+hm.get("John"));
}}