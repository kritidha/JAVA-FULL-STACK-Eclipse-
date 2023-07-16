import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ans5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= new ArrayList<String>();
		
		list.add("Kritidha");
		list.add("Abc");
		list.add("Mno");
		
		List<String> syncronizedList=Collections.synchronizedList(list);
		synchronized(syncronizedList){
			
			Iterator<String> it= syncronizedList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
}


