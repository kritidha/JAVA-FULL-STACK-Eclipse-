import java.util.*;

public class Ans1 {
    public static void main(String args[])
    {
    	 ArrayList<String> list = new ArrayList<String>();
         list.add("1");
         list.add("Kriti");
         list.add("Assignement");
         list.add ("AbC");
         System.out.println("ArrayList Elements");
         Iterator itr = list.iterator();
         while (itr.hasNext()) {
             System.out.println(itr.next());
             }
             
             
            
             LinkedList<String> al = new LinkedList<String>();
	            
	            al.add("This");
	            al.add("Is ");
	            al.add("A");
	            al.add("Linked List");
	            System.out.println("\nLinked List Elements");
	     
	            Iterator<String> itr1 = al.iterator();
	            while (itr1.hasNext()) {
	                System.out.println(itr1.next());
	            }
	            
	            Map<Integer, String> map = new HashMap<>();
	            
	            map.put(1, "THIS");
	            map.put(2, "IS");
	            map.put(3, "A");
	            map.put(4, "MAP INTERFACE");
	     
	            Set set = map.entrySet();
	            Iterator itr2 = set.iterator();
	     
	            System.out.println("\nMAP Elements");
	            while (itr2.hasNext()) {
	               Map.Entry entry = (Map.Entry)itr2.next();
	              
	                System.out.println(entry.getKey() + " "
	                                   + entry.getValue());
	            }
	            
	            
	            Stack<String> stack = new Stack<String>();
	            
	            stack.push("THIS");
	            stack.push("IS");
	            stack.push("A");
	            stack.push("STACK");
	            stack.push("");
	            System.out.println("\nStack Elements");
	    
	            stack.pop();
	     
	            Iterator<String> itr4 = stack.iterator();
	     
	            while (itr4.hasNext()) {
	                System.out.println(itr4.next());
	            }
	     
           
        }
        }
    

