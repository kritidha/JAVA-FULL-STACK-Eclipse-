package assignment1;

import java.util.ArrayList;

public class Employeee {
	public String findName(ArrayList employees,String name){
		String result="";
		if(employees.contains(name)){
		result="FOUND";
		}else{
		result="NOT FOUND";
		}
		return result;
		}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Kritidha");
		list.add("Ellie");
		list.add( "Jashan");
		list.add( "Priyansh");
		Employeee e= new Employeee();
		String a=e.findName(list, "Kritidha");
		System.out.println(a);
	}
	
}
